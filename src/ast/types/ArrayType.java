package ast.types;

import ast.Type;

public class ArrayType implements Type {

    private int size;
    private Type elementType;

    public ArrayType(int size, Type elementType) {
        this.size = size;
        this.elementType = elementType;
    }
}
