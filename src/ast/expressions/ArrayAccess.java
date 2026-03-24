package ast.expressions;

import semantic.Visitor;
import ast.locatables.Expression;

public class ArrayAccess extends AbstractExpression {

    private Expression expression1, expression2;

    public ArrayAccess(int line, int column ,Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1=expression1;
        this.expression2 = expression2;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public Expression getExpression1() {
        return expression1;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return null;
    }
}
