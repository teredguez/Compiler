package ast.statements;

import semantic.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class ReturnStatement extends AbstractLocatable implements Statement {

    private Expression returnExpression;

    public ReturnStatement(int line, int column, Expression returnExpression) {
        super(line, column);
        this.returnExpression = returnExpression;
    }

    public Expression getReturnExpression() {
        return returnExpression;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
