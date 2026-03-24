package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {

    private boolean lvalue;

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


}
