package ast.statements;

import ast.locatables.Statement;

public class IfElseStatement implements Statement {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
