package ast;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static final ErrorHandler i = new ErrorHandler();
    private List<ErrorType> errorsList = new ArrayList<ErrorType>();

    private ErrorHandler(){}

    public static ErrorHandler getInstance(){
        return i;
    }

    public boolean anyError(){
        return !errorsList.isEmpty();
    }

    public void showErrors(PrintStream str) {
        //Orders the errors by line
        errorsList.sort((e1, e2) -> {
            if (e1.getLocation().getLine() != e2.getLocation().getLine()) {
                return Integer.compare(e1.getLocation().getLine(), e2.getLocation().getLine());
            }
            return Integer.compare(e1.getLocation().getColumn(), e2.getLocation().getColumn());
        });

        int count = 1;
        for (ErrorType err : errorsList) {
            str.println(count + ". " + err);
            count++;
        }
    }

    public void addError(ErrorType err){
        errorsList.add(err);
    }
}
