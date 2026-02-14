package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class UnaryMinus extends AbstractLocatable implements Expression {

    private Expression expression;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
