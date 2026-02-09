package ast.definitions;

import ast.Type;
import ast.locatables.Definition;
import ast.locatables.Statement;

public class VarDefinition implements Definition, Statement {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
