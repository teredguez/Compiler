package semantic;

import ast.expressions.*;
import ast.statements.Assignment;
import ast.statements.FunctionInvocation;
import ast.statements.InputStatement;
import ast.types.ErrorType;

public class LValueVisitor extends AbstractVisitor<Void,Void>{

    @Override
    public Void visit(Variable v, Void param) {
        v.setLvalue(true);
        return super.visit(v,param);
    }

    @Override
    public Void visit(ArithmeticOperation a, Void param) {
        a.setLvalue(false);
        return super.visit(a,param);
    }

    @Override
    public Void visit(CompareOperation c, Void param) {
        c.setLvalue(false);
        return super.visit(c,param);
    }

    @Override
    public Void visit(LogicOperation l, Void param) {
        l.setLvalue(false);
        return super.visit(l,param);
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        i.setLvalue(false);
        return super.visit(i,param);
    }

    @Override
    public Void visit(NumberLiteral n, Void param) {
        n.setLvalue(false);
        return super.visit(n,param);
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        c.setLvalue(false);
        return super.visit(c,param);
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.setLvalue(false);
        return super.visit(c,param);
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        f.setLvalue(true);
        return super.visit(f,param);
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.setLvalue(true);
        return super.visit(a,param);
    }

    @Override
    public Void visit(UnaryMinus um, Void param) {
        um.setLvalue(false);
        return super.visit(um,param);
    }

    @Override
    public Void visit(UnaryNot un, Void param) {
        un.setLvalue(false);
        return super.visit(un,param);
    }

    @Override
    public Void visit(FunctionInvocation p, Void param) {
        p.setLvalue(false);
        return super.visit( p, param );
    }

    @Override
    public Void visit(Assignment a, Void param) {
        super.visit( a, param );
        if(!a.getLeftExpression().getLvalue()){
            new ErrorType("Invalid value for the left hand side of the assignment ", a.getLeftExpression() );
        }
        return null;
    }

    @Override
    public Void visit(InputStatement p, Void param) {
        super.visit( p, param );
        if(!p.getExpression().getLvalue()){
            new ErrorType("Invalid value for input statement", p.getExpression() );
        }
        return null;
    }

    @Override
    public Void visit(PowerOperation p, Void param) {
        p.setLvalue(false);
        return super.visit(p, param);
    }
}
