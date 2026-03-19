package ast.expressions;

import ast.Type;
import ast.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class Cast extends AbstractExpression {

    private Expression expression;
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
