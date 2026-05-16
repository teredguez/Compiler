package ast.definitions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Definition;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition {

    int scope;
    private String name;
    private Type type;

    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
