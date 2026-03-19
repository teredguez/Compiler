package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public abstract class AbstractBinaryOperation extends AbstractExpression {

    protected Expression expression1, expression2;
    protected String operator;

    public AbstractBinaryOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operator = operator;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }
}

