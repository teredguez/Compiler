package ast.definitions;

import ast.Type;
import ast.locatables.AbstractLocatable;
import ast.locatables.Definition;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition extends AbstractLocatable implements Definition {

    private Type type;
    private String name;
    private List<Statement> statementList;


    @Override
    public String getName() {
        return "";
    }

    @Override
    public Type getType() {
        return type;
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
