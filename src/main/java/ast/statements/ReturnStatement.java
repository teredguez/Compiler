package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

public class ReturnStatement implements Statement {

    private Expression returnExpression;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
