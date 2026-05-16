package semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatables.Definition;
import ast.statements.LetStatement;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{
    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition funcDef, Void param){
        if(!symbolTable.insert(funcDef)){
            new ErrorType("Function " + funcDef.getName() + " already defined", funcDef);
        }
        symbolTable.set();
        super.visit(funcDef,param);
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(VarDefinition varDef, Void param){
        super.visit(varDef, param);
        if(!symbolTable.insert(varDef)){
           new ErrorType("Variable " + varDef.getName() + " already defined", varDef);
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Void param){
       Definition def = symbolTable.find(v.getName());
       if(def == null){
           new ErrorType("Definition for variable " + v.getName() + " not found", v);
       }else{
           v.setDefinition(def);
       }
       return null;
    }
    @Override
    public Void visit(LetStatement ls, Void param) {
        if (!symbolTable.insert(ls)) {
            new ErrorType("Variable '" + ls.getVar().getName() + "' already defined", ls);
        }else{
            ls.getVar().setDefinition(ls);
        }
        super.visit(ls, param);
        return null;
    }

}
