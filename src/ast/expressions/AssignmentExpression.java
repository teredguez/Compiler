package ast.expressions;

import ast.locatables.Expression;
import semantic.Visitor;

public class AssignmentExpression extends AbstractExpression{
    private Expression leftExpression;
    private Expression rightExpression;

    public AssignmentExpression(int line, int column, Expression leftExpression, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
