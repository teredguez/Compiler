package ast.statements;

import ast.Type;
import semantic.Visitor;
import ast.expressions.Variable;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractLocatable implements Statement, Expression {

    private Variable variable;
    private List<Expression> expressionList;
    private Type type;

    public FunctionInvocation(int line, int column, Variable variable, List<Expression> expressionList) {
        super(line, column);
        this.variable = variable;
        this.expressionList = expressionList;
    }

    @Override
    public boolean getLvalue() {
        return false;
    }

    @Override
    public void setLvalue(boolean lvalue) {

    }

    public Variable getVariable() {
        return variable;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
