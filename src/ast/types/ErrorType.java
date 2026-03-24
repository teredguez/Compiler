package ast.types;

import ast.ErrorHandler;
import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class ErrorType implements Type {
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

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
