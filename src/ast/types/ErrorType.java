package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

public class ErrorType implements Type {
    private String cause;
    private Locatable location;

    public ErrorType(String cause, Locatable location){
        this.cause = cause;
        this.location = location;
    }

    public String toString(){
        return "Error Cause: " + cause + "\nLine:"
                + location.getLine() + ", Column:"
                + location.getColumn();
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
