package ast.types;

import ast.Type;
import ast.Visitor;

public class IntType implements Type {

    private static final IntType i = new IntType();

    private IntType() {}

    public static IntType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
