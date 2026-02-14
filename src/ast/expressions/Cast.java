package ast.expressions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class Cast extends AbstractLocatable implements Expression {

    private Expression expression;
    private Type type;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
