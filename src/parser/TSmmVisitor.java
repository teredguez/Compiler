// Generated from C:/Users/teres/IdeaProjects/DLPUO294178/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.definitions.*;
import ast.expressions.*;
import ast.locatables.*;
import ast.statements.*;
import ast.types.*;
import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(TSmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(TSmmParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#expressionFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionFunctionInvocation(TSmmParser.ExpressionFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#statementFunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFunctionInvocation(TSmmParser.StatementFunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TSmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDefinition(TSmmParser.MainDefinitionContext ctx);
}