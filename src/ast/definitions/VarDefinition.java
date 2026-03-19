package ast.definitions;

import ast.Type;
import ast.Visitor;
import ast.locatables.Statement;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}