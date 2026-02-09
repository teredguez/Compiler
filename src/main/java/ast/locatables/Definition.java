package ast.locatables;

import ast.Locatable;
import ast.Type;

public interface Definition extends Locatable {

    public String getName();

    public Type getType();
}
