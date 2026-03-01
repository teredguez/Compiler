package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class Assignment extends AbstractLocatable implements Statement {

    private Expression leftExpression,rightExpression;

    public Assignment(int line, int column, Expression leftExpression, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

}
