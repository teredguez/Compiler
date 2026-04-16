package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractType {

    private static final CharType i = new CharType();

    private CharType() {}

    public static CharType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharType";
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //CharType is built in
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l) {
        if(!(t instanceof IntType || t instanceof CharType || t instanceof NumberType))
            super.mustPromoteTo(t, l);
    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType || t instanceof NumberType)
            return this;
        if(t instanceof ErrorType){
            return t;
        }
        return super.arithmetic(t, l);    }

    @Override
    public Type comparison(Type t, Locatable l) {
        return super.comparison(t, l);
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }
}
