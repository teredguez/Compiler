package semantic;

import ast.Program;
import ast.Visitor;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractVisitor<RT, PT> implements Visitor<RT, PT> {

    @Override
    public RT visit(Variable v, PT param) {
        return null;
    }

    @Override
    public RT visit(ArithmeticOperation a, PT param) {
        a.getExpression1().accept(this,param);
        a.getExpression2().accept(this,param);
        return null;
    }

    @Override
    public RT visit(CompareOperation c, PT param) {
        c.getExpression1().accept(this,param);
        c.getExpression2().accept(this,param);
        return null;
    }

    @Override
    public RT visit(LogicOperation l, PT param) {
        l.getExpression1().accept(this,param);
        l.getExpression2().accept(this,param);
        return null;
    }

    @Override
    public RT visit(IntLiteral i, PT param) {
        return null;
    }

    @Override
    public RT visit(NumberLiteral n, PT param) {
        return null;
    }

    @Override
    public RT visit(CharLiteral c, PT param) {
        return null;
    }

    @Override
    public RT visit(Cast c, PT param) {
        c.getType().accept(this, param);
        c.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(FieldAccess f, PT param) {
        f.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayAccess a, PT param) {
        a.getExpression1().accept(this,param);
        a.getExpression2().accept(this,param);
        return null;
    }

    @Override
    public RT visit(UnaryMinus um, PT param) {
        um.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(UnaryNot un, PT param) {
        un.getExpression().accept(this,param);
        return null;
    }

    //Definitions

    @Override
    public RT visit(FuncDefinition fd, PT param) {
        fd.getType().accept(this, param);
        for(var definition : fd.getVariableList()){
            definition.accept(this, param);
        }
        for(var statement : fd.getStatementList()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(VarDefinition vd, PT param) {
        vd.getType().accept(this, param);
        return null;
    }

    //Statements
    @Override
    public RT visit(Assignment a, PT param) {
        a.getLeftExpression().accept(this, param);
        a.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(FunctionInvocation fi, PT param) {
        for(var expression : fi.getExpressionList()){
            expression.accept(this, param);
        }
        fi.getVariable().accept(this, param);
        return null;
    }

    @Override
    public RT visit(IfElseStatement ie, PT param) {
        for(var statement : ie.getIfBody()){
            statement.accept(this, param);
        }
        for(var statement : ie.getElseBody()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(InputStatement is, PT param) {
        is.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(LogStatement log, PT param) {
        log.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ReturnStatement ret, PT param) {
        ret.getReturnExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(WhileStatement w, PT param) {
        for(var statement : w.getWhileBody()){
            statement.accept(this, param);
        }
        w.getWhileExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayType a, PT param) {
        a.getElementType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(CharType a, PT param) {
        return null;
    }

    @Override
    public RT visit(ErrorType a, PT param) {
        return null;
    }

    @Override
    public RT visit(FunctionType a, PT param) {
        a.getReturnType().accept(this, param);
        for(var definition : a.getParam()){
            definition.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(IntType a, PT param) {
        return null;
    }

    @Override
    public RT visit(NumberType a, PT param) {
        return null;
    }

    @Override
    public RT visit(RecordType a, PT param) {
        for(var field : a.getRecordFieldList()){
            field.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(VoidType a, PT param) {
        return null;
    }

    @Override
    public RT visit(RecordField a, PT param) {
        return null;
    }

    @Override
    public RT visit(Program p, PT param) {
        for(var definition : p.getDefinitions()) {
            definition.accept(this, param);
        }
        return null;
    }

}
