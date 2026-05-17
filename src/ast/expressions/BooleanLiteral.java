package ast.expressions;

import semantic.Visitor;

public class BooleanLiteral extends AbstractExpression{

    private boolean value;

    public BooleanLiteral(int line, int column, boolean value) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
