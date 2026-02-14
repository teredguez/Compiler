package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class FieldAccess extends AbstractLocatable implements Expression {

    private String fieldName;
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
