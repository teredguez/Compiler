package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

public class VoidType extends AbstractType {

    private static final VoidType i = new VoidType();

    private VoidType() {}

    public static VoidType getInstance() {
        return i;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidType";
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        //VoidType is built in
    }
}
