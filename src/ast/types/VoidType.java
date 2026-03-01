package ast.types;

import ast.Type;

public class VoidType implements Type {

    private static final VoidType i = new VoidType();

    private VoidType() {}

    public static VoidType getInstance() {
        return i;
    }

}
