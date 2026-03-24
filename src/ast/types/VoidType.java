package ast.types;

import ast.Type;
import semantic.Visitor;

public class VoidType implements Type {

    private static final VoidType i = new VoidType();

    private VoidType() {}

    public static VoidType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
