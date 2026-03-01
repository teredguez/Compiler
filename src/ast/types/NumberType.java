package ast.types;

import ast.Type;

public class NumberType implements Type {

    private static final NumberType i = new NumberType();

    private NumberType() {}

    public static NumberType getInstance() {
        return i;
    }
}
