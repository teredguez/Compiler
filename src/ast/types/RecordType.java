package ast.types;

import ast.Locatable;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class RecordType extends AbstractType {

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

    @Override
    public String toString() {
        return "RecordType";
    }

    @Override
    public Type dot(String s, Locatable l) {
        for(int i=0;i < recordFieldList.size(); i++){
            if(recordFieldList.get(i).getName().equals(s)) {
                return recordFieldList.get(i).getType();
            }
        }
        return super.dot(s,l);
    }
}
