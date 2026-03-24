package ast.types;

import ast.Type;
import semantic.Visitor;

public class ArrayType implements Type {

    private int size;
    private Type elementType;

    public ArrayType(int size, Type elementType) {
        this.size = size;
        this.elementType = elementType;
    }

    public int getSize() {
        return size;
    }

    public Type getElementType() {
        return elementType;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
