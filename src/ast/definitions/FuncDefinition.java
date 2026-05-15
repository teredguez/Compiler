package ast.definitions;

import ast.Type;
import semantic.Visitor;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition extends AbstractDefinition{

    private List<VarDefinition> variableList;
    private List<Statement> statementList;

    public FuncDefinition(int line, int column, Type type, String name,List<VarDefinition> variableList, List<Statement> statementList) {
        super(line, column,type,name);
        this.statementList = statementList;
        this.variableList = variableList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public List<VarDefinition> getVariableList() {
        return variableList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    public int getLocalBytesSum() {
        if(variableList.isEmpty())
            return 0;
        return -variableList.getLast().getOffset();
    }
}
