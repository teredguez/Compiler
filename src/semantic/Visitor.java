package semantic;
import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<RT,PT> {
    RT visit(Program p, PT param);

    //Expressions
    RT visit(Variable v, PT param);
    RT visit(ArithmeticOperation a, PT param);
    RT visit(CompareOperation c, PT param);
    RT visit(LogicOperation l, PT param);
    RT visit(IntLiteral i, PT param);
    RT visit(NumberLiteral n, PT param);
    RT visit(CharLiteral c, PT param);
    RT visit(Cast c, PT param);
    RT visit(FieldAccess f, PT param);
    RT visit(ArrayAccess a, PT param);
    RT visit(UnaryMinus um, PT param);
    RT visit(UnaryNot un, PT param);

    //Definitions
    RT visit(FuncDefinition fd, PT param);
    RT visit(VarDefinition vd, PT param);

    //Statements
    RT visit(Assignment a, PT param);
    RT visit(FunctionInvocation fi, PT param);
    RT visit(IfElseStatement ie, PT param);
    RT visit(InputStatement is, PT param);
    RT visit(LogStatement log, PT param);
    RT visit(ReturnStatement ret, PT param);
    RT visit(WhileStatement w, PT param);

    //Types
    RT visit(ArrayType a, PT param);
    RT visit(CharType a, PT param);
    RT visit(ErrorType a, PT param);
    RT visit(FunctionType a, PT param);
    RT visit(IntType a, PT param);
    RT visit(NumberType a, PT param);
    RT visit(RecordType a, PT param);
    RT visit(VoidType a, PT param);

    RT visit(RecordField a, PT param);

    RT visit(AssignmentExpression a, PT param);

}
