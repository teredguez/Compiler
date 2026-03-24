package semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
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
        if(!symbolTable.insert(varDef)){
           new ErrorType("Variable " + varDef.getName() + " already defined", varDef);
        }
        super.visit(varDef, param);
        return null;
    }

    @Override
    public Void visit(Variable v, Void param){
       if(symbolTable.find(v.getName())== null){
           new ErrorType("Definition for variable " + v.getName() + " not found", v);
       }else{
           v.setDefinition(symbolTable.find(v.getName()));
       }
       return null;
    }

}
