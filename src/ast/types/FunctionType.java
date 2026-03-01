package ast.types;

import ast.Type;
import ast.locatables.Definition;

import java.util.List;

public class FunctionType implements Type {

    private Type returnType;
    private List<Definition> param;

    public FunctionType(Type returnType, List<Definition> param) {
        this.returnType = returnType;
        this.param = param;
    }
}
