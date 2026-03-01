package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class UnaryMinus extends AbstractLocatable implements Expression {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }


}
