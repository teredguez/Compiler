package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class InputStatement extends AbstractLocatable implements Statement {

    private Expression expression;

    public InputStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

}
