package semantic;

import ast.Type;
import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.locatables.Expression;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Type>{

    @Override
    public Void visit(IntLiteral i, Type param){
        super.visit(i, param);
        i.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Type param){
        super.visit(c, param);
        c.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(NumberLiteral n, Type param){
        super.visit(n,param);
        n.setType(NumberType.getInstance());
        return null;
    }

    @Override
    public Void visit(Variable v, Type param){
        super.visit(v, param);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(IfElseStatement ie, Type param) {
        super.visit(ie, param);
        ie.getExpression().getType().mustBeLogical(ie);
        return null;
    }

    @Override
    public Void visit(WhileStatement w, Type param) {
        super.visit(w, param);
        w.getWhileExpression().getType().mustBeLogical(w);
        return null;
    }

    @Override
    public Void visit(LogicOperation l, Type param){
        super.visit(l, param);
        l.setType(l.getExpression1().getType().logic(l.getExpression2().getType(),l));
        return null;
    }

    @Override
    public Void visit(ArithmeticOperation a, Type param) {
        super.visit(a, param);
        a.setType(a.getExpression1().getType().arithmetic(a.getExpression2().getType(),a));
        return null;
    }

    @Override
    public Void visit(CompareOperation c, Type param) {
        super.visit(c, param);
        c.setType(c.getExpression1().getType().comparison(c.getExpression2().getType(),c));
        return null;
    }

    @Override
    public Void visit(UnaryMinus um, Type param) {
        super.visit(um, param);
        um.setType(um.getExpression().getType().arithmetic(um));
        return null;
    }

    @Override
    public Void visit(UnaryNot un, Type param) {
        super.visit(un, param);
        un.setType(un.getExpression().getType().logic(un));
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Type param) {
        super.visit(a, param);
        a.setType(a.getExpression1().getType().squareBrackets(a.getExpression2().getType(),a));
        return null;
    }

    @Override
    public Void visit(Assignment a, Type param) {
        super.visit(a, param);
        if (a.getLeftExpression().getType() instanceof ErrorType || a.getLeftExpression().getType() == null) {
            return null;
        }
        a.getRightExpression().getType().mustPromoteTo(a.getLeftExpression().getType(), a);
        return null;
    }

    @Override
    public Void visit(InputStatement is, Type param) {
        super.visit(is, param);
        is.getExpression().getType().mustBeBuiltIn(is);
        return null;
    }

    @Override
    public Void visit(LogStatement log, Type param) {
        super.visit(log, param);
        log.getExpression().getType().mustBeBuiltIn(log);
        return null;
    }

    @Override
    public Void visit(Cast c, Type param) {
        super.visit(c, param);
        c.setType(c.getExpression().getType().canBeCastedTo(c.getType(), c));
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Type param) {
        super.visit(f, param);
        f.setType(f.getExpression().getType().dot(f.getFieldName(),f));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Type param) {
        super.visit(f, param);
        if (!(f.getVariable().getType() instanceof FunctionType)) {
            f.setType(new ErrorType("Cannot invoke a non-function type", f));
            return null;
        }
        f.setType(f.getVariable().getType().parenthesis(f.getExpressionList().stream().map(Expression::getType).toList(), f));
        return null;
    }

    @Override
    public Void visit(ReturnStatement r, Type param) {
        super.visit(r, param);
        r.getReturnExpression().getType().mustPromoteTo(param, r);
        return null;
    }

    @Override
    public Void visit(FuncDefinition f, Type param) {
        FunctionType fType = (FunctionType) f.getType();
        super.visit(f, fType.getReturnType());
        f.getType().mustBeBuiltIn(f);
        return null;
    }

    @Override
    public Void visit(ArithmeticAssignment a, Type param) {
        super.visit(a, param);
        a.getLeftExpression().getType().arithmetic(a.getRightExpression().getType(),a).mustPromoteTo(a.getLeftExpression().getType(),a);
        return null;
    }
}
