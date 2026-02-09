package ast.expressions;

import ast.locatables.Expression;

public class ArrayAccess implements Expression {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
