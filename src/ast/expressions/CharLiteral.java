package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class CharLiteral extends AbstractLocatable implements Expression {

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

}
