package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;
import semantic.Visitor;

public class CompoundLogicalStatement extends AbstractLocatable implements Statement {

    private Expression expression1;
    private Expression expression2;
    private String operator;

    public CompoundLogicalStatement(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operator = operator;
    }


    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
