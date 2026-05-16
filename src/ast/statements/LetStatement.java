package ast.statements;

import ast.Type;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;
import semantic.Visitor;

public class LetStatement extends VarDefinition {
    private Expression expression;
    private Variable var;

    public LetStatement(int line, int column, Type type, String name, Variable var, Expression expression) {
        super(line, column, type, name);
        this.expression = expression;
        this.var = var;
    }

    public Expression getExpression() {
        return expression;
    }

    public Variable getVar() {
        return var;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
