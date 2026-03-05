package ast.locatables;

import ast.Locatable;
import ast.Type;

public interface Definition extends Locatable {

     String getName();
     Type getType();
}
