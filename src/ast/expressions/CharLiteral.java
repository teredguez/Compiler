package ast.expressions;

import semantic.Visitor;

public class CharLiteral extends AbstractExpression {

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }


    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
