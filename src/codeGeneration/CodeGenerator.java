package codeGeneration;

import ast.Type;
import ast.types.CharType;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    private int labels = 0;

    public CodeGenerator(String outputFilename, String sourceFileName) throws FileNotFoundException {
        try{
            this.out = new PrintWriter(outputFilename);
        }catch(IOException e){
            System.err.println("Error opening the file "+ outputFilename);
            System.exit(-1);
        }
        this.source(sourceFileName);
    }

    public void mainInv() {
        out.println("\n' Invocation to the main function");
        out.println("call main");
        out.println("halt\n");
        out.flush();
    }

    public void call(String function) {
        out.println("\tcall\t"+function);
        out.flush();
    }

    public void store(Type type){
        out.println("\tstore" + type.suffix());
        out.flush();
    }

    public void load(Type type)
    {
        out.println("\tload" + type.suffix());
        out.flush();
    }

    //PUSH
    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void pusha(int intConstant) {
        out.println("\tpusha\t" + intConstant);
        out.flush();
    }

    public void push(int intConstant) {
        out.println("\tpushi\t" + intConstant);
        out.flush();
    }

    public void push(double realConstant) {
        out.println("\tpushf\t" + realConstant);
        out.flush();
    }
    public void push(char charConstant) {
        out.println("\tpushb\t" + (int) charConstant);
        out.flush();
    }

    public void push(boolean boolConstant) {
        if(boolConstant){
            out.println("\tpushi\t" +  1 );
            out.flush();
        }else{
            out.println("\tpushi\t" +  0 );
            out.flush();
        }
    }

    public void comparison(String operator, Type type) {
        String operation = switch (operator) {
            case ">" -> "gt";
            case "<" -> "lt";
            case ">=" -> "ge";
            case "<=" -> "le";
            case "==" -> "eq";
            case "!=" -> "ne";
            default -> "";
        };
        out.println("\t" + operation + type.suffix());
        out.flush();
    }

    public void logic(String operator) {
        String operation = switch (operator) {
            case "&&" -> "and";
            case "||" -> "or";
            default -> "";
        };
        out.println("\t" + operation);
        out.flush();
    }

    public void arithmetic(String operator, Type type){
        switch(operator){
            case "+": add(type);break;
            case "-": sub(type);break;
            case "*": mul(type);break;
            case "/": div(type);break;
            case "%": mod(type);break;
        }
    }

    public void add(Type type){
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void sub(Type type){
        out.println("\tsub" + type.suffix());
        out.flush();
    }
    public void mul(Type type){
        out.println("\tmul" + type.suffix());
        out.flush();
    }
    public void div(Type type){
        out.println("\tdiv" + type.suffix());
        out.flush();
    }
    public void mod(Type type){
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public void convertTo(Type t1, Type t2) {
        char from = t1.suffix();
        char to = t2.suffix();

        if (from == to)
            return;

        if (from == 'b' && to == 'f') {
            out.println("\tb2i");
            out.println("\ti2f");
        } else if (from == 'f' && to == 'b') {
            out.println("\tf2i");
            out.println("\ti2b");
        } else {
            out.println("\t" + from + "2" + to);
        }

        out.flush();
    }

    public void in(Type type) {
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void enter(int i) {
        out.println("\tenter\t" + i);
        out.flush();
    }

    public void ret(int bytesReturn, int bytesLocals, int bytesParams) {
        this.out.println("\tret\t" + bytesReturn + ", " + bytesLocals + ", " + bytesParams);
        this.out.flush();
    }

    private void source(String inputFileName) {
        this.out.println("\n#source\t" + "\"" + inputFileName + "\"\n");
        this.out.flush();
    }

    public void printComment(String comment) {
        out.println("\t' * " + comment);
        out.flush();
    }

    public void printLine(int line) {
        this.out.println("\n#line\t" + line);
        this.out.flush();
    }

    public String nextLabel() {
        return "label" + this.labels++;
    }

    public void label(String label) {
        out.println(" " + label + ":");
        out.flush();
    }

    public void jmp(String label) {
        out.println("\tjmp\t" + label);
        out.flush();
    }

    public void jz(String label) {
        out.println("\tjz\t" + label);
        out.flush();
    }

    public void jnz(String label) {
        out.println("\tjnz\t" + label);
        out.flush();
    }

    public void pop(char suffix) {
        out.println("\tpop" + suffix);
        out.flush();
    }
}
