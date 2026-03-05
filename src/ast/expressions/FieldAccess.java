package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class FieldAccess extends AbstractLocatable implements Expression {

    private String fieldName;
    private Expression expression;

    public FieldAccess(int line, int column,Expression expression,String fieldName) {
        super(line,column);
        this.expression = expression;
        this.fieldName = fieldName;
    }


}
