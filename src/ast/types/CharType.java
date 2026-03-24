package ast.types;

import ast.Type;
import semantic.Visitor;

public class CharType implements Type {

    private static final CharType i = new CharType();

    private CharType() {}

    public static CharType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
