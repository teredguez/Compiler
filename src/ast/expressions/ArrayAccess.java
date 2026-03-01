package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class ArrayAccess extends AbstractLocatable implements Expression {

    private Expression expression1, expression2;

    public ArrayAccess(int line, int column ,Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1=expression1;
        this.expression2 = expression2;
    }


}
