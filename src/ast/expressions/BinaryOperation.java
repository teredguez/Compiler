package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public abstract class BinaryOperation extends AbstractLocatable implements Expression {

    protected Expression expression1, expression2;
    protected String operator;

    public BinaryOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operator = operator;
    }
}

