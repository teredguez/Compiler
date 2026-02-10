package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class IfElseStatement implements Statement {

    private Expression expression;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
