package ast.expressions;

import ast.locatables.Expression;

public class ArithmeticOperation extends AbstractBinaryOperation {

    public ArithmeticOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2, operator);
    }

}
