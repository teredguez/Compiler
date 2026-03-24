package ast.statements;

import semantic.Visitor;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class IfElseStatement extends AbstractLocatable implements Statement {

    private Expression expression;
    private List<Statement> ifBody, elseBody;

    public IfElseStatement(int line, int column, Expression expression, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
