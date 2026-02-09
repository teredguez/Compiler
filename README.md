# Programming Language Design – Compiler

This project is part of the **Programming Language Design** course.  
The goal of the project is to implement a **compiler** for a given programming language, following the classical phases of compilation.

---

## 📌 Supported Language Features

The language includes, among others, the following elements:

- **Definitions**
  - Variable definitions (`let`)
  - Function definitions (`function`)
- **Types**
  - Built-in types: `int`, `number`, `char`, `void`
  - Composite types: arrays and records
- **Expressions**
  - Literals
  - Variables
  - Unary and binary operators
  - Type casts (`as`)
  - Function invocations
- **Statements**
  - Assignment
  - Input / output (`input`, `log`)
  - Conditionals (`if / else`)
  - Loops (`while`)
  - `return`

---

## 🏗️ Project Structure

The project follows a standard Maven structure and organizes the AST into separate packages:

