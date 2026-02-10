package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class ArrayAccess extends AbstractLocatable implements Expression {

    private Expression expression1;
    private Expression expression2;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
