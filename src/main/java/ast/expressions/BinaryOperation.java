package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public abstract class BinaryOperation extends AbstractLocatable implements Expression {

    private Expression expression1;
    private Expression expression2;
    private String operator;
}
