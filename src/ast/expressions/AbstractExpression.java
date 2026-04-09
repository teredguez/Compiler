package ast.expressions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {

    private boolean lvalue;
    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public void setLvalue(boolean lvalue) {
        this.lvalue = lvalue;
    }

    @Override
    public boolean getLvalue() {
        return lvalue;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
