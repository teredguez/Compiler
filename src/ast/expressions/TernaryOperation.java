package ast.expressions;

import ast.locatables.Expression;
import semantic.Visitor;

public class TernaryOperation extends AbstractExpression{

    private Expression condition;
    private Expression ifTrue;
    private Expression ifFalse;

    public TernaryOperation(int line, int column, Expression condition, Expression ifTrue, Expression ifFalse) {
        super(line, column);
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getIfTrue() {
        return ifTrue;
    }

    public Expression getIfFalse() {
        return ifFalse;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);    }
}
