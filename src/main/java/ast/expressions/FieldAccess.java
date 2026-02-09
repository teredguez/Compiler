package ast.expressions;

import ast.locatables.Expression;

public class FieldAccess implements Expression {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
