package ast.types;

import ast.Type;

public class IntType implements Type {

    private static final IntType i = new IntType();

    private IntType() {}

    public static IntType getInstance() {
        return i;
    }

}
