package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class AbstractType implements Type {

    @Override
    public void mustBeLogical(Locatable l) {
        new ErrorType(toString() + " cannot be used in a logical condition", l);
    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        return new ErrorType("Cannot apply arithmetic operation to types " + this + " and " + t, l);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new ErrorType("Unary minus cannot be applied to type " + this, l);
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        return new ErrorType("Cannot compare types " + toString() + " and " + t.toString(), l);
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l) {
        new ErrorType( toString() + " is not promotable to " + t.toString(),l);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        new ErrorType( toString() + " is not a built-in type", l);
    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        return new ErrorType(toString() + " does not support [] ",l);
    }

    @Override
    public Type dot(String s, Locatable l) {
        return new ErrorType("Record has no field named " + s, l);
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable l) {
        return new ErrorType(toString() + " does not support function invocation", l);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        return new ErrorType("Cannot apply logical operation to " + toString() + " and " + t.toString(), l);
    }

    @Override
    public Type logic(Locatable l) {
        return new ErrorType("Operator ! cannot be applied to " + toString(), l);
    }

    @Override
    public Type canBeCastedTo(Type t, Locatable l) {
        return new ErrorType(toString()+ " can not be cast to " + t.toString() , l);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return null;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char suffix(){
        return 0;
    }

    @Override
    public Type ternary(Type t1, Type t2, Locatable l) {
        return new ErrorType("Invalid ternary operands",l);
    }
}
