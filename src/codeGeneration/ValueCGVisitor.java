package codeGeneration;

import ast.expressions.*;
import ast.locatables.Expression;
import ast.statements.FunctionInvocation;
import ast.types.FunctionType;
import ast.types.IntType;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{

    public final CodeGenerator cg;
    public AddressCGVisitor address;

    public ValueCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setAddress(AddressCGVisitor address) {
        this.address = address;
    }

    /*
     * value[[ Variable: variable -> ID ]]() =
     *   address[[Variable]]
     *   <load> variable.type.suffix()
     */
    @Override
    public Void visit(Variable v, Void param) {
        v.accept(address, param);
        cg.load(v.getType());
        return null;
    }

    /*
     * value[[ FieldAccess: expression1 -> expression2 ID ]]() =
     *   address[[ expression1 ]]()
     *   <load> expression1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess f, Void param) {
        f.accept(address,param);
        cg.load(f.getType());
        return null;
    }

    /*
     * value[[ ArrayAccess: exp1 -> exp2 exp3 ]]() =
     *   address[[ exp1 ]]()
     *   <load> exp1.type.suffix()
     */
    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.accept(address,param);
        cg.load(a.getType());
        return null;
    }

    /*
     * value[[ IntLiteral: expression -> INT_LITERAL ]]() =
     *   <pushi> expression.value
     */
    @Override
    public Void visit(IntLiteral i, Void param) {
        cg.push(i.getValue());
        return null;
    }

    /*
     * value[[ CharLiteral: expression -> CHAR_LITERAL ]]() =
     *   <pushb> expression.value
     */
    @Override
    public Void visit(CharLiteral c, Void param) {
        cg.push(c.getValue());
        return null;
    }

    /*
     * value[[ NumberLiteral: expression -> NUMBER_LITERAL ]]() =
     *  <pushf> expression.value
     */
    @Override
    public Void visit(NumberLiteral n, Void param) {
        cg.push(n.getValue());
        return null;
    }

    /*
     * value[[ ArithmeticOperation: expression1 -> expression2 expression3 ]]() =
     *   value[[ expression2 ]]()
     *   cg.convertTo(expression2.type, expression1.type)
     *   value[[ expression3 ]]()
     *   cg.convertTo(expression3.type, expression1.type)
     *   cg.arithmetic(expression1.operator, expression1.type)
     */
    @Override
    public Void visit(ArithmeticOperation a, Void param) {
        a.getExpression1().accept(this, param);
        cg.convertTo(a.getExpression1().getType(), a.getType());
        a.getExpression2().accept(this, param);
        cg.convertTo(a.getExpression2().getType(), a.getType());
        cg.arithmetic(a.getOperator(), a.getType());
        return null;
    }

    /*
     * value [[ CompareOperation: expression1 -> expression2 expression3 ]]() =
     *   value[[ expression2 ]]()
     *   cg.convertTo(expression2.type, expression1.type)
     *   value[[ expression3 ]]()
     *   cg.convertTo(expression3.type, expression1.type)
     *   cg.comparison(expression1.operator, expression1.type)
     */
    @Override
    public Void visit(CompareOperation c, Void param) {
        c.getExpression1().accept(this, param);
        cg.convertTo(c.getExpression1().getType(), c.getType());
        c.getExpression2().accept(this, param);
        cg.convertTo(c.getExpression2().getType(), c.getType());
        cg.comparison(c.getOperator(), c.getType());
        return null;
    }

    /*
     * value[[ LogicOperation: expression1 -> expression2 expression3 ]]() =
     *   value[[ expression2 ]]()
     *   value[[ expression3 ]]()
     *   cg.logic(expression1.operator)
     */
    @Override
    public Void visit(LogicOperation l, Void param) {
        l.getExpression1().accept(this, param);
        l.getExpression2().accept(this, param);
        cg.logic(l.getOperator());
        return null;
    }

    /*
     * value[[ Cast: expression1 -> expression2 type ]]() =
     *   value[[expression2]]
     *   cg.convertTo(expression2.type, type)
     */
    @Override
    public Void visit(Cast c, Void param) {
        c.getExpression().accept(this, param);
        cg.convertTo(c.getExpression().getType(), c.getType());
        return null;
    }

    /*
     * value[[ UnaryNot: expression1 -> expression2 ]]() =
     *   value[[expression2]]
     *   cg.convertTo(un.getType(), IntType.getInstance());
     *   <not>
     */
    @Override
    public Void visit(UnaryNot un, Void param) {
        un.getExpression().accept(this, param);
        cg.convertTo(un.getType(), IntType.getInstance());
        cg.not();
        return null;
    }

    /*
     * value[[ UnaryMinus: expression1 -> expression2 ]]() =
     *   value[[ expression2 ]]
     *   cg.convertTo(expression2.type, expression1.type)
     *   <pushi> -1
     *   cg.convertTo(IntType, expression1.type)
     *   <mul> expression1.type.suffix()
     */
    @Override
    public Void visit(UnaryMinus um, Void param) {
        um.getExpression().accept(this, param);
        cg.convertTo(um.getExpression().getType(), um.getType());
        cg.push(-1);
        cg.convertTo(IntType.getInstance(), um.getType());
        cg.mul(um.getType());
        return null;
    }

    /*
     * Invocation here acts as an expression
     * value[[FunctionInvocation: expr1 --> expr2 expr3*]]() =
     *  for(int i=0; i< expr3*.size(); i++){
     *      value[[expr3*.get(i)]]
     *      cg.convertTo(expr3*.get(i).type, expr2.type.params.get(i).type)
     *  }
     *  <call> expr2.name
     */
    @Override
    public Void visit(FunctionInvocation f, Void param) {
        FunctionType functionType = (FunctionType) f.getVariable().getType();

        for (int i = 0; i < f.getExpressionList().size(); i++) {
            Expression argument = f.getExpressionList().get(i);

            argument.accept(this, param);

            cg.convertTo(
                    argument.getType(),
                    functionType.getParam().get(i).getType()
            );
        }
        cg.call(f.getVariable().getName());
        return null;
    }

}

