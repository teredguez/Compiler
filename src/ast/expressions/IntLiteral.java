package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class IntLiteral extends AbstractLocatable implements Expression {

    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

}
