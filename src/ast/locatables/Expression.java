package ast.locatables;

import ast.Locatable;
import ast.Type;

public interface Expression extends Locatable {
    public boolean getLvalue();
    public void setLvalue(boolean lvalue);

    public Type getType();
    public void setType(Type type);
}
