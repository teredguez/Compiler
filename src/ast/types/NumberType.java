package ast.types;

import ast.Type;
import ast.Visitor;

public class NumberType implements Type {

    private static final NumberType i = new NumberType();

    private NumberType() {}

    public static NumberType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
