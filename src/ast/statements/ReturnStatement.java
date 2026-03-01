package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class ReturnStatement extends AbstractLocatable implements Statement {

    private Expression returnExpression;

    public ReturnStatement(int line, int column, Expression returnExpression) {
        super(line, column);
        this.returnExpression = returnExpression;
    }

}
