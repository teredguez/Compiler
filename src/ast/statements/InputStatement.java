package ast.statements;

import semantic.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class InputStatement extends AbstractLocatable implements Statement {

    private Expression expression;

    public InputStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
