package ast;

public interface ASTNode {
    <RT, PT> RT accept(Visitor<RT, PT> v, PT param);

}