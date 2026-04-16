package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType {

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

    @Override
    public String toString() {
        return "FunctionType";
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable l) {
        if (types.size() != param.size()) {
            return new ErrorType("Wrong number of parameters for function call. Expected " +
                    param.size() + ", got " + types.size(), l);
        }

        for(int i=0; i<param.size(); i++){
            types.get(i).mustPromoteTo(param.get(i).getType(), l);
        }
        return returnType;
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //Allow to have void type as function return type
        if(returnType != VoidType.getInstance())
            returnType.mustBeBuiltIn(l);
    }

    @Override
    public int numberOfBytes() {
        throw new UnsupportedOperationException("Number of Bytes should not be calculated for Function Type");
    }
}
