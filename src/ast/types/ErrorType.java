package ast.types;

import ast.ErrorHandler;
import ast.Locatable;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {
    private String cause;
    private Locatable location;
    public ErrorType(String cause, Locatable location){
        this.cause = cause;
        this.location = location;
        ErrorHandler.getInstance().addError(this);
    }

    public String toString(){
        return "Error Cause: " + cause + " (Line:"
                + location.getLine() + ", Column:"
                + location.getColumn() + ")";
    }

    public Locatable getLocation() {
        return location;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public void mustBeLogical(Locatable l) {

    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        return this;
    }

    @Override
    public Type arithmetic(Locatable l) {
        return this;
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        return this;
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l) {

    }

    @Override
    public void mustBeBuiltIn(Locatable l) {

    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        return this;
    }

    @Override
    public Type dot(String s, Locatable l) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable l) {
        return this;
    }

    @Override
    public Type logic(Type t, Locatable l) {
        return this;
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public Type canBeCastedTo(Type t, Locatable l) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        throw new UnsupportedOperationException("Number of Bytes should not be calculated for Error Type");
    }

}
