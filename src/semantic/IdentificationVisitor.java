package semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatables.Definition;
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
    public Void visit(Variable v, Void param) {
        super.visit(v, param);
        Definition def = symbolTable.find(v.getName());

        if (def == null) {
            ErrorType error = new ErrorType("Definition for name '" + v.getName() + "' not found",v);
            def = new VarDefinition(v.getLine(),v.getColumn(),error,v.getName());
        }
        v.setDefinition(def);
        return null;
    }

}
