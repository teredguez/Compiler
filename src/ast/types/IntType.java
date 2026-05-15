package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class IntType extends AbstractType {

    private static final IntType i = new IntType();

    private IntType() {}

    public static IntType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //IntType is built in
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l) {
        if(!(t instanceof IntType || t instanceof NumberType || t instanceof ErrorType))
            super.mustPromoteTo(t, l);
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType || t instanceof NumberType)
            return this;
        if(t instanceof ErrorType){
            return t;
        }
        return super.comparison(t, l);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return this;
    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType )
            return IntType.getInstance();
        if (t instanceof NumberType)
            return NumberType.getInstance();
        if(t instanceof ErrorType){
            return t;
        }
        return super.arithmetic(t, l);
    }

    @Override
    public void mustBeLogical(Locatable l) {
        //It is logical
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public Type canBeCastedTo(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType || t instanceof NumberType)
            return t;
        if(t instanceof ErrorType){
            return t;
        }
        return super.canBeCastedTo(t,l);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof IntType || t instanceof CharType) {
            return this;
        }
        return super.logic(t, l);
    }
    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }
}
