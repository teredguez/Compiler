package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class WhileStatement implements Statement {

    private Expression whileExpression;
    private List<Statement> whileBody;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
