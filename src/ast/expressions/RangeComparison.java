package ast.expressions;

import ast.locatables.Expression;
import semantic.Visitor;

public class RangeComparison extends AbstractExpression {
    private Expression leftExpression;
    private Expression middleExpression;
    private Expression rightExpression;
    String operator1;
    String operator2;

    public RangeComparison(int line, int column, Expression leftExpression, Expression middleExpression, Expression rightExpression, String operator1,String operator2) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.middleExpression = middleExpression;
        this.rightExpression = rightExpression;
        this.operator1 = operator1;
        this.operator2 = operator2;
    }


    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getMiddleExpression() {
        return middleExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public String getOperator1() {
        return operator1;
    }

    public String getOperator2() {
        return operator2;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
