package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class CompareOperation extends AbstractBinaryOperation  {

    public CompareOperation(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2, operator);
    }

}
