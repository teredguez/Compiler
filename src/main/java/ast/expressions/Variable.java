package ast.expressions;

import ast.locatables.Expression;

public class Variable implements Expression {

    private String name;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
