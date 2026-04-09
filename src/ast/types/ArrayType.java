package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class ArrayType extends AbstractType {

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

    @Override
    public String toString() {
        return "ArrayType";
    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        if(!(t instanceof IntType)){
            return super.squareBrackets(t, l);
        }
        return this.elementType;
    }

    @Override
    public void mustBeLogical(Locatable l) {
        if(elementType != IntType.getInstance()) {
            super.mustBeLogical(l);
        }
    }
}
