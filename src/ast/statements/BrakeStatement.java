package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Statement;
import semantic.Visitor;

public class BrakeStatement extends AbstractLocatable implements Statement {

    public BrakeStatement(int line, int column) {
        super(line, column);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
