package ast.definitions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Definition;
import ast.locatables.Statement;

public class VarDefinition extends AbstractLocatable implements Definition, Statement {

    private String name;
    private Type type;

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
