package ast.types;

import ast.Type;
import ast.definitions.AbstractDefinition;

public class RecordField extends AbstractDefinition {

    public RecordField(int line, int column, String name, Type type) {
        super(line, column,type,name);
    }

}
