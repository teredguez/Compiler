package codeGeneration;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;
import ast.statements.LetStatement;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import semantic.AbstractVisitor;

import java.util.List;

public class OffsetVisitor extends AbstractVisitor<Void,Void> {

    private int globalBytesSum = 0;
    private int localBytesSum = 0;

    @Override
    public Void visit(VarDefinition vd, Void param) {
        super.visit(vd, param);
        if(vd.getScope() == 0){
            vd.setOffset(globalBytesSum);
            globalBytesSum+=vd.getType().numberOfBytes();
        }else{
            localBytesSum += vd.getType().numberOfBytes();
            vd.setOffset(-localBytesSum);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType ft, Void param) {
        int paramBytesSum = 4;
        List<VarDefinition> params = ft.getParam();

        //reversed because we need the following param, not the previous
        for(int i = params.size() - 1; i >= 0; i--) {
            VarDefinition varDef = (VarDefinition) params.get(i);
            varDef.setOffset(paramBytesSum);
            paramBytesSum += varDef.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(RecordType rt, Void param) {
        super.visit(rt, param);
        int recordFieldBytesSym = 0;
        for(RecordField rf: rt.getRecordFieldList()){
            rf.setOffset(recordFieldBytesSym);
            recordFieldBytesSym += rf.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FuncDefinition fd, Void param) {
        this.localBytesSum = 0;
        super.visit(fd, param);
        return null;
    }

    @Override
    public Void visit(LetStatement l, Void param) {
        super.visit(l, param);
        if(l.getScope() == 0){
            l.setOffset(globalBytesSum);
            globalBytesSum+=l.getType().numberOfBytes();
        }else{
            localBytesSum += l.getType().numberOfBytes();
            l.setOffset(-localBytesSum);
        }
        return null;
    }
}
