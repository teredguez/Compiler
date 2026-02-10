package ast.statements;

import ast.expressions.Variable;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class FunctionInvocation implements Statement, Expression {

    private String name;
    private Variable variable;
    private List<Expression> expressionList;
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
