package ast.types;

import ast.Type;
import ast.Visitor;
import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {

    public RecordField(int line, int column, String name, Type type) {
        super(line, column,type,name);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
