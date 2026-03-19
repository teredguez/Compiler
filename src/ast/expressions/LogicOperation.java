package ast.expressions;

import ast.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class LogicOperation extends AbstractBinaryOperation {

    public LogicOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2, operator);
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
