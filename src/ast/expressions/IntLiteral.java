package ast.expressions;

import semantic.Visitor;

public class IntLiteral extends AbstractExpression {

    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
