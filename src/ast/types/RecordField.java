package ast.types;

import ast.Type;
import semantic.Visitor;
import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {
    public int offset;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column,type,name);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }


    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
