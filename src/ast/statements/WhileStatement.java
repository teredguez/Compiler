package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class WhileStatement extends AbstractLocatable implements Statement {

    private Expression whileExpression;
    private List<Statement> whileBody;

    public WhileStatement(int line, int column, Expression whileExpression, List<Statement> whileBody) {
        super(line, column);
        this.whileExpression = whileExpression;
        this.whileBody = whileBody;
    }

}
