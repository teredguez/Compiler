package codeGeneration;

import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.IntType;
import ast.types.RecordField;
import ast.types.RecordType;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{

    public final CodeGenerator cg;
    public ValueCGVisitor value;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setValue(ValueCGVisitor value) {
        this.value = value;
    }

    /*
     * address[[ Variable: expression -> ID ]]() =
     *   if( expression.definition.scope == 0 )
     *     <pusha> expression.definition.offset
     *   else
     *    <push bp>
     *    <pushi> expression.definition.offset
     *    <addi>
     */
    @Override
    public Void visit(Variable v, Void param) {
        if (v.getDefinition().getScope() == 0)
            cg.pusha(((VarDefinition) v.getDefinition()).getOffset());
        else {
            cg.pushBP();
            cg.push(((VarDefinition) v.getDefinition()).getOffset());
            cg.add(IntType.getInstance());
        }
        return null;
    }

    /*
    address[[FieldAccess: expr1 -> expr2 ID]]() =
       address[[expr2]]()
       <pushi> expression2.type.getField(ID).getOffset()
       <addi>

     */
    @Override
    public Void visit(FieldAccess f, Void param) {
        f.getExpression().accept(this, null);
        RecordType record = (RecordType) f.getExpression().getType();
        RecordField field = record.getField(f.getFieldName());
        cg.push(field.offset);
        cg.add(IntType.getInstance());
        return null;
    }

    /*
    address[[ArrayAccess: exp1 -> expr2 expr3]]()=
        address[[expr2]]
        value [[expr3]]
        cg.convertTo(expr3.type, IntType)
        <pushi> expr1.type.numberOfBytes() --could also be expr2.type.elementType.numberOfBytes()
        <muli>
        <addi>
     */
    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.getExpression1().accept(this,param);
        a.getExpression2().accept(value,param);
        cg.convertTo(a.getExpression2().getType(),IntType.getInstance());
        cg.push(a.getType().numberOfBytes());
        cg.mul(IntType.getInstance());
        cg.add(IntType.getInstance());
        return null;
    }
}






