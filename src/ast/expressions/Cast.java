package ast.expressions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class Cast extends AbstractLocatable implements Expression {

    private Expression expression;
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

}
