package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType implements Type {

    private Type returnType;
    private List<VarDefinition> param;

    public FunctionType(Type returnType, List<VarDefinition> param) {
        this.returnType = returnType;
        this.param = param;
    }
}
