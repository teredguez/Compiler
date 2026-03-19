package ast;

import ast.locatables.Definition;
import ast.locatables.Expression;

import java.util.ArrayList;
import java.util.List;
public class Program implements ASTNode {

    private final List<Definition> definitions = new ArrayList<>();

    public Program() {}

    public void addDefinitions(List<Definition> defs) {
        this.definitions.addAll(defs);
    }

    public void addDefinition(Definition def) {
        this.definitions.add(def);
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <RT,PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}