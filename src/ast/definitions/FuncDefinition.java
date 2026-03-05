package ast.definitions;

import ast.Type;
import ast.locatables.Definition;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition extends AbstractDefinition{

    private List<Statement> statementList;
    private List<VarDefinition> variableList;

    public FuncDefinition(int line, int column, Type type, String name,List<VarDefinition> variableList, List<Statement> statementList) {
        super(line, column,type,name);
        this.statementList = statementList;
        this.variableList = variableList;
    }

}
