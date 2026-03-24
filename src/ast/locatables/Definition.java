package ast.locatables;

import ast.Locatable;
import ast.Type;

public interface Definition extends Locatable {

     String getName();
     Type getType();

     int getScope();
     void setScope(int scope);
}
