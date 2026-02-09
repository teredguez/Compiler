package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

public class LogStatement implements Statement {

    private Expression expression;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
