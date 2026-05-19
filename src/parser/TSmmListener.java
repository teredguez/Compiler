// Generated from C:/Users/teres/IdeaProjects/DLPUO294178/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.definitions.*;
import ast.expressions.*;
import ast.locatables.*;
import ast.statements.*;
import ast.types.*;
import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSmmParser}.
 */
public interface TSmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(TSmmParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(TSmmParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(TSmmParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(TSmmParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#expressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFunctionInvocation(TSmmParser.ExpressionFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#expressionFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFunctionInvocation(TSmmParser.ExpressionFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#statementFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterStatementFunctionInvocation(TSmmParser.StatementFunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#statementFunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitStatementFunctionInvocation(TSmmParser.StatementFunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TSmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TSmmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TSmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TSmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainDefinition(TSmmParser.MainDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainDefinition(TSmmParser.MainDefinitionContext ctx);
}