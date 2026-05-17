package ast.expressions;

import ast.locatables.Expression;
import semantic.Visitor;

public class PrefixIncrement extends AbstractExpression{

    private Expression expression;

    public PrefixIncrement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
