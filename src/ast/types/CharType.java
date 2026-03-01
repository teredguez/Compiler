package ast.types;

import ast.Type;

public class CharType implements Type {

    private static final CharType i = new CharType();

    private CharType() {}

    public static CharType getInstance() {
        return i;
    }
}
