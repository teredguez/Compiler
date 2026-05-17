package ast.expressions;

import ast.locatables.Expression;
import semantic.Visitor;

public class PowerOperation extends AbstractBinaryOperation{

    public PowerOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2, operator);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
