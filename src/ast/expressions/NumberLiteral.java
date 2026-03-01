package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class NumberLiteral extends AbstractLocatable implements Expression {

    private double value;

    public NumberLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }


}
