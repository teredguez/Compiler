package ast.expressions;

import ast.locatables.Expression;

public class UnaryNot implements Expression {

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
