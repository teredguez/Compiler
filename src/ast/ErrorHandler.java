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

    public void showErrors(PrintStream str){
        int i = 1;
        for(ErrorType err: errorsList){
            str.println(i + ". " + err);
            i++;
        }
    }

    public void addError(ErrorType err){
        errorsList.add(err);
    }
}
