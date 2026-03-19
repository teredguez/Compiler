package ast.types;

import ast.Type;
import ast.Visitor;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType implements Type {

    private Type returnType;
    private List<VarDefinition> param;

    public FunctionType(Type returnType, List<VarDefinition> param) {
        this.returnType = returnType;
        this.param = param;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VarDefinition> getParam() {
        return param;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
