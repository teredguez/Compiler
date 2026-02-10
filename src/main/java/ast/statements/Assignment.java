package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

public class Assignment implements Statement {

    private Expression leftExpression;
    private Expression rightExpression;


    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
