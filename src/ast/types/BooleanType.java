package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class BooleanType extends AbstractType{

    private static final BooleanType b = new BooleanType();

    private BooleanType() {}

    public static BooleanType getInstance() {
        return b;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "bool";
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //IntType is built in
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
    public void mustPromoteTo(Type t, Locatable l) {
        if(!(t instanceof BooleanType || t instanceof ErrorType))
            super.mustPromoteTo(t, l);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof BooleanType) {
            return this;
        }
        return super.logic(t, l);
    }

    @Override
    public Type canBeCastedTo(Type t, Locatable l) {
        if(t instanceof BooleanType)
            return t;
        if(t instanceof ErrorType){
            return t;
        }
        return super.canBeCastedTo(t,l);
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        if(t instanceof BooleanType)
            return this;
        if(t instanceof ErrorType){
            return t;
        }
        return super.comparison(t, l);
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
