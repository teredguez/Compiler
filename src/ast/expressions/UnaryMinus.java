package ast.expressions;

import semantic.Visitor;
import ast.locatables.Expression;

public class UnaryMinus extends AbstractExpression {

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
