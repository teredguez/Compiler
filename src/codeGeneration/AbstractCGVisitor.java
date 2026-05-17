package codeGeneration;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import semantic.Visitor;

public class AbstractCGVisitor<TR,TP> implements Visitor<TR, TP>  {

    @Override
    public TR visit(Program p, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(Variable v, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(ArithmeticOperation a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(CompareOperation c, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(LogicOperation l, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(IntLiteral i, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(NumberLiteral n, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(CharLiteral c, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(Cast c, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(FieldAccess f, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(UnaryMinus um, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(UnaryNot un, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(FuncDefinition fd, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(VarDefinition vd, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(Assignment a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(FunctionInvocation fi, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(IfElseStatement ie, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(InputStatement is, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(LogStatement log, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(ReturnStatement ret, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(WhileStatement w, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(ArrayType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(CharType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(ErrorType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(FunctionType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(IntType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(NumberType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(RecordType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(VoidType a, TP param) {
        throw new UnsupportedOperationException("");

    }

    @Override
    public TR visit(RecordField a, TP param) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public TR visit(PowerOperation p, TP param)  {
        throw new UnsupportedOperationException("");
    }
}
