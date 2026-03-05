package ast.definitions;

import ast.Type;
import ast.locatables.Statement;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

}