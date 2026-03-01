package ast.types;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Definition;

public class RecordField  extends AbstractLocatable implements Definition {

    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
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
