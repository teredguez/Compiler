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
    private List<Definition> variableList;

    public FuncDefinition(int line, int column, Type type, String name,List<Definition> variableList, List<Statement> statementList) {
        super(line, column);
        this.type = type;
        this.name = name;
        this.statementList = statementList;
        this.variableList = variableList;
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
