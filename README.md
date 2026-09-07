# End-to-End Compiler for a Custom Procedural Language

A complete compiler developed in **Java** for a custom procedural language, targeting an **abstract stack machine (P-code)**.

The project implements the full compilation pipeline, from source code to executable stack-machine instructions:

**Lexical Analysis → Syntax Analysis → AST → Semantic Analysis → Code Generation**

## What it includes

* **ANTLR v4** lexer and parser
* **Abstract Syntax Tree (AST)** using the Visitor Pattern
* **Semantic analysis**

  * Symbol identification
  * Type checking
  * L-value validation
* **Memory layout** and offset calculation
* **Code generation** for a stack-based abstract machine
* Support for variables, arrays, records, functions, control flow, expressions and I/O

## Example

```text
let x: int = 10;

function main() {
    log(x);
}
```

The compiler processes the program through all compilation phases and produces the corresponding stack-machine code.

## Tech Stack

* **Java**
* **ANTLR 4**
* Visitor Pattern
* Compiler Design
* Abstract Syntax Trees
* Stack-based code generation

## Key Concepts

This project demonstrates practical knowledge of:

* Compiler architecture
* Lexical and syntactic analysis
* AST design
* Static semantic analysis
* Type systems
* Symbol tables
* Memory management
* Intermediate/target code generation

**Author - Teresa Domínguez Otero**
