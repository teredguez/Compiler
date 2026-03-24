package ast.expressions;

import semantic.Visitor;
import ast.locatables.Definition;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
