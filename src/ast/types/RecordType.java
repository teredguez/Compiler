package ast.types;

import ast.Type;

import java.util.List;

public class RecordType implements Type {

    private List<RecordField> recordFieldList;

    public RecordType(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }
}
