package ast.expressions;

import ast.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class FieldAccess extends AbstractExpression {

    private String fieldName;
    private Expression expression;

    public FieldAccess(int line, int column,Expression expression,String fieldName) {
        super(line,column);
        this.expression = expression;
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
