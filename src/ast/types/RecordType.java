package ast.types;

import ast.Type;
import semantic.Visitor;

import java.util.List;

public class RecordType implements Type {

    private List<RecordField> recordFieldList;

    public RecordType(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
