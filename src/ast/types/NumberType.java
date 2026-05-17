package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class NumberType extends AbstractType {

    private static final NumberType i = new NumberType();

    private NumberType() {}

    public static NumberType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "real";
    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType || t instanceof NumberType)
            return this;
        if(t instanceof ErrorType){
            return t;
        }
        return super.arithmetic(t, l);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return this;
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        if(t instanceof IntType || t instanceof CharType || t instanceof NumberType)
            return IntType.getInstance();
        if(t instanceof ErrorType){
            return t;
        }
        return super.comparison(t, l);
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
    public void mustPromoteTo(Type t, Locatable l) {
        if(!(t instanceof NumberType || t instanceof ErrorType))
            super.mustPromoteTo(t, l);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //NumberType is built in
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public Type power(Type t, Locatable l) {
        if(t instanceof CharType || t instanceof IntType || t instanceof ErrorType){
            return this;
        }
        return super.power(t, l);
    }
}
