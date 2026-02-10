package ast.expressions;

import ast.locatables.Expression;

public class CompareOperation implements Expression {

    private Expression expression1;
    private Expression expression2;
    private String operator;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
