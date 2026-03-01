package ast.statements;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;
import ast.locatables.Statement;
import kotlin.collections.EmptyList;

import java.util.ArrayList;
import java.util.List;

public class IfElseStatement extends AbstractLocatable implements Statement {

    private Expression expression;
    private List<Statement> ifBody, elseBody;

    public IfElseStatement(int line, int column, Expression expression, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column);
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public IfElseStatement(int line,int column,  Expression expression, List<Statement> ifBody){
        super(line, column);
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseBody = new ArrayList<Statement>();
    }
}
