package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

public class CompareOperation extends BinaryOperation  {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
