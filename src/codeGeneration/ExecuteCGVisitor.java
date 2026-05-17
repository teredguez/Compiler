package codeGeneration;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;
import ast.locatables.Statement;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.IntType;
import ast.types.VoidType;

import java.util.Stack;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,FuncDefinition>{

    public CodeGenerator cg;
    public ValueCGVisitor value;
    public AddressCGVisitor address;
    private Stack<String> breakLabels = new Stack<>();

    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        this.value = new ValueCGVisitor(cg);
        this.address = new AddressCGVisitor(cg);
        address.setValue(value);
        value.setAddress(address);
    }

    /*
     * execute[[ Program: program -> definition* ]]() =
     *   definition*.forEach( def -> {
     *      if( def instanceof VarDefinition )
     *          execute[[ def ]]
     *   })
     *   <call main>
     *   <halt>
     *   definition*.forEach( def -> {
     *     if( def instanceof FuncDefinition )
     *          execute[[ def ]]
     *   })
     */
    @Override
    public Void visit(Program p, FuncDefinition param ) {
        for(Definition def : p.getDefinitions()) {
            if(def instanceof VarDefinition){
                def.accept(this, null);
            }
        }
        cg.mainInv();
        for(Definition def : p.getDefinitions()) {
            if(def instanceof FuncDefinition){
                def.accept(this, null);
            }
        }
        return null;
    }

    /*
     * execute[[ Assignment: statement -> exp1 exp2 ]]() =
     *  #line statement.line
     *  ' * Assignment
     *  address[[ exp1 ]]
     *  value[[ exp2 ]]
     *  cg.convertTo(exp2.type, exp1.type)
     *  <store> exp1.type.suffix()
     */
    @Override
    public Void visit(Assignment a, FuncDefinition param) {
        cg.printLine(a.getLine());
        cg.printComment("Assignment");

        a.getLeftExpression().accept(address, null);
        a.getRightExpression().accept(value, null);

        cg.convertTo(a.getRightExpression().getType(), a.getLeftExpression().getType());
        cg.store(a.getLeftExpression().getType());
        return null;
    }

    /*
     * execute[[ InputStatement: statement -> expression ]]() =
     *   #line statement.line
     *   ' * Read
     *   address[[ expression ]]
     *   <in> expression.type.suffix()
     *   <store> expression.type.suffix()
     */
    @Override
    public Void visit(InputStatement r, FuncDefinition param) {
        cg.printLine(r.getLine());
        cg.printComment("Read");
        r.getExpression().accept(address, null);
        cg.in(r.getExpression().getType());
        cg.store(r.getExpression().getType());
        return null;
    }

    /*
     * execute[[ LogStatement: statement -> expression ]]() =
     *   #line statement.line
     *   ' * Write
     *   value[[ expression ]]
     *   <out> expression.type.suffix()
     */
    @Override
    public Void visit(LogStatement l, FuncDefinition param) {
        cg.printLine(l.getLine());
        cg.printComment("Write");
        l.getExpression().accept(value, null);
        cg.out(l.getExpression().getType());
        return null;
    }


    /*
     * execute[[ ReturnStatement: statement -> exp ]](FuncDef fd) =
     *   #line statement.line
     *   ' * Return
     *   value[[exp]]
     *   cg.convertTo(exp.type, fd.type.returnType)
     *   <ret> fd.type.getReturnBytesSum(),
     *         fd.getLocalBytesSum(),
     *         fd.type.getParamBytesSum()
     */
    @Override
    public Void visit(ReturnStatement r, FuncDefinition param) {
        cg.printLine(r.getLine());
        cg.printComment("Return");
        r.getReturnExpression().accept(value, null);
        cg.convertTo(r.getReturnExpression().getType(), ((FunctionType) param.getType()).getReturnType());
        cg.ret(
                ((FunctionType) param.getType())
                        .getReturnBytesSum(),
                param.getLocalBytesSum(),
                ((FunctionType) param.getType())
                        .getParamBytesSum()
        );
        return null;
    }

    /*
     * execute[[ FunctionType: type vardefinition* ]]() =
     *   vardefinition*.forEach( def -> execute[[ def ]] )
     */
    @Override
    public Void visit(FunctionType ft, FuncDefinition param) {
        ft.getParam().forEach( v -> v.accept(this, null));
        return null;
    }

    /*
     * execute[[ VarDefinition: vardefinition -> type ID ]]() =
     *   ' * type.toString() ID (offset vardefinition.offset )
     */
    @Override
    public Void visit(VarDefinition v, FuncDefinition param) {
        cg.printComment(v.getType().toString() + " " + v.getName() + " (offset " + v.getOffset() + ")");
        return null;
    }

    /*
     *
     * execute[[ FuncDef : def -> ID type vardefinition* statement* ]]() =
     *   #line def.line
     *   ID:
     *   ' * Parameters
     *   execute[[ type ]]
     *   ' * Local variables
     *   vardefinition*.forEach(v -> execute[[ v ]])
     *   <enter> def.getLocalBytesSum()
     *   statement*.forEach(s -> execute[[s]](def)) //  FuncDefinition as parameter
     *   if (type.returnType == VoidType.getInstance())
     *      <ret> type.getReturnBytesSum(),
     *            def.getLocalBytesSum(),
     *            type.getParamBytesSum()
     *
     */
    public Void visit(FuncDefinition f, FuncDefinition param) {
        cg.printLine(f.getLine());
        cg.label(f.getName());
        cg.printComment("Parameters");
        f.getType().accept(this, null);
        cg.printComment("Local variables");
        f.getVariableList().forEach( v -> {
            v.accept(this, null);
        });
        cg.enter(f.getLocalBytesSum());
        f.getStatementList().forEach( s -> {
            if(!(s instanceof VarDefinition)){
                s.accept(this, f);
            }
        });
        FunctionType ft = (FunctionType) f.getType();
        if( ft.getReturnType() == VoidType.getInstance() )
            cg.ret(ft.getReturnBytesSum(), f.getLocalBytesSum(), ft.getParamBytesSum());
        return null;
    }

    /*
     *  execute[[WhileStatement: stmnt1 --> expr stmt2*]]()=
     *   string cond = cg.getLabel();
     *   String end = cg.getLabel();
     *   cond <:>
     *   value[[expr]]()
     *   cg.converTo(expr.type,IntType);
     *   <jz> end
     *   stmt2*.forEach(s->execute[[s]])
     *   <jmp> cond
     *   end <:>
     */
    @Override
    public Void visit(WhileStatement w, FuncDefinition param){
        cg.printLine(w.getLine());
        cg.printComment("While");

        String cond = cg.nextLabel();
        String end = cg.nextLabel();

        breakLabels.push(end);

        cg.label(cond);
        w.getWhileExpression().accept(value, null);
        cg.convertTo(w.getWhileExpression().getType(), IntType.getInstance());

        cg.jz(end);
        cg.printComment("While Body");
        for(Statement s: w.getWhileBody()){
            s.accept(this, null);
        }
        cg.jmp(cond);
        cg.label(end);
        breakLabels.pop();
        return null;
    }
    /*
    execute[[IfElseStatement: stmtn1 -->expr stmtn2* stmtnt3*]]() =
    string else = cg.getLabel();
    string end = cg.getLabel();
    value[[expr]]
    cg.convertTo(expr.type, IntType);
    <jz> else
    stmnt2*.forEach(s ->execute[[s]])
    <jmp> end
    else <:>
    stmnt3.forEach(s->execute[[s]])
    end <:>
     */

    @Override
    public Void visit(IfElseStatement ie, FuncDefinition param){
        cg.printLine(ie.getLine());
        cg.printComment("If");
        String elseLabel = cg.nextLabel();
        String endLabel = cg.nextLabel();
        ie.getExpression().accept(value, null);
        cg.convertTo(ie.getExpression().getType(), IntType.getInstance());
        cg.jz(elseLabel);
        cg.printComment("if body");
        for(Statement s: ie.getIfBody()){
            s.accept(this, param);
        }
        cg.jmp(endLabel);
        cg.label(elseLabel);
        cg.printComment("else body");
        for(Statement s : ie.getElseBody()){
            s.accept(this,param);
        }
        cg.label(endLabel);
        return null;
    }
  /*
        execute[[ FunctionInvocation: statement -> expression1 expression2* ]]() =
            value[[(Expression) stmt]] //we reuse the value code template
            if(!(expression1.type.returnType instanceof VoidType))
                <pop> expression1.type.returnType.suffix()
   */
    @Override
    public Void visit(FunctionInvocation f, FuncDefinition param) {
        f.accept(value, null);

        if(((FunctionType)f.getVariable().getType()).getReturnType() != VoidType.getInstance()){
            cg.pop(((FunctionType) f.getVariable().getType()).getReturnType().suffix());
        }

        return null;
    }

    @Override
    public Void visit(BrakeStatement b, FuncDefinition param) {
        cg.printLine(b.getLine());
        cg.printComment("Break");

        cg.jmp(breakLabels.peek());
        return null;
    }
}