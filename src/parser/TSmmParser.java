// Generated from C:/Users/teres/IdeaProjects/DLPUO294178/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.definitions.*;
import ast.expressions.*;
import ast.locatables.*;
import ast.statements.*;
import ast.types.*;
import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, WHITES=42, COMMENT=43, INT_CONSTANT=44, 
		CHAR_CONSTANT=45, REAL_CONSTANT=46, ID=47;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefinition = 2, RULE_variables = 3, 
		RULE_funcDefinition = 4, RULE_parameters = 5, RULE_expressionFunctionInvocation = 6, 
		RULE_statementFunctionInvocation = 7, RULE_arguments = 8, RULE_statement = 9, 
		RULE_block = 10, RULE_expression = 11, RULE_simple_type = 12, RULE_type = 13, 
		RULE_mainDefinition = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefinition", "variables", "funcDefinition", 
			"parameters", "expressionFunctionInvocation", "statementFunctionInvocation", 
			"arguments", "statement", "block", "expression", "simple_type", "type", 
			"mainDefinition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "':'", "';'", "','", "'function'", "'('", "')'", "'void'", 
			"'{'", "'}'", "'log'", "'input'", "'='", "'&&='", "'||='", "'while'", 
			"'if'", "'else'", "'return'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", 
			"'*'", "'%'", "'/'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'&&'", "'||'", "'char'", "'int'", "'number'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WHITES", "COMMENT", "INT_CONSTANT", 
			"CHAR_CONSTANT", "REAL_CONSTANT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast = new Program();
		public DefinitionContext definition;
		public MainDefinitionContext mainDefinition;
		public MainDefinitionContext mainDefinition() {
			return getRuleContext(MainDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.ast.addDefinitions(((ProgramContext)_localctx).definition.ast); 
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).mainDefinition = mainDefinition();
			_localctx.ast.addDefinition(((ProgramContext)_localctx).mainDefinition.ast);
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((DefinitionContext)_localctx).varDefinition = varDefinition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).varDefinition.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((DefinitionContext)_localctx).funcDefinition = funcDefinition();
				 _localctx.ast.add(((DefinitionContext)_localctx).funcDefinition.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID;
		public VariablesContext variables;
		public TypeContext type;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			((VarDefinitionContext)_localctx).ID = match(ID);
			setState(52);
			((VarDefinitionContext)_localctx).variables = variables();
			setState(53);
			match(T__1);
			setState(54);
			((VarDefinitionContext)_localctx).type = type();
			setState(55);
			match(T__2);

			        _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).ID.getLine(),((VarDefinitionContext)_localctx).ID.getCharPositionInLine()+1,((VarDefinitionContext)_localctx).type.ast, (((VarDefinitionContext)_localctx).ID!=null?((VarDefinitionContext)_localctx).ID.getText():null)));
			         for(Token id : ((VarDefinitionContext)_localctx).variables.ast) {
			               _localctx.ast.add(new VarDefinition(
			                           id.getLine(),
			                           id.getCharPositionInLine()+1,
			                           ((VarDefinitionContext)_localctx).type.ast,
			                           id.getText() ));}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<Token> ast = new ArrayList<>();
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(58);
				match(T__3);
				setState(59);
				((VariablesContext)_localctx).ID = match(ID);
				 _localctx.ast.add(((VariablesContext)_localctx).ID); 
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefinitionContext extends ParserRuleContext {
		public Definition ast;
		public Type returnType;
		public List<VarDefinition> vars = new ArrayList<>();
		public List<Statement> stmts = new ArrayList<>();
		public List<VarDefinition> params = new ArrayList<>();
		public Token ID;
		public ParametersContext parameters;
		public Simple_typeContext t;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
			setState(67);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(68);
			match(T__5);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(69);
				((FuncDefinitionContext)_localctx).parameters = parameters();
				_localctx.params.addAll(((FuncDefinitionContext)_localctx).parameters.ast);
				}
			}

			setState(74);
			match(T__6);
			setState(75);
			match(T__1);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
				{
				setState(76);
				((FuncDefinitionContext)_localctx).t = simple_type();
				((FuncDefinitionContext)_localctx).returnType = ((FuncDefinitionContext)_localctx).t.ast;
				}
				break;
			case T__7:
				{
				setState(79);
				match(T__7);
				((FuncDefinitionContext)_localctx).returnType =  VoidType.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			match(T__8);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				((FuncDefinitionContext)_localctx).varDefinition = varDefinition();
				_localctx.vars.addAll(((FuncDefinitionContext)_localctx).varDefinition.ast);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882841724992L) != 0)) {
				{
				{
				setState(92);
				((FuncDefinitionContext)_localctx).statement = statement();
				_localctx.stmts.addAll(((FuncDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__9);

			                        ((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(
			                            ((FuncDefinitionContext)_localctx).ID.getLine(),
			                            ((FuncDefinitionContext)_localctx).ID.getCharPositionInLine()+1,
			                            new FunctionType(_localctx.returnType,_localctx.params),
			                            (((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null),
			                            _localctx.vars,
			                            _localctx.stmts
			                        );
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public Token ID;
		public Simple_typeContext simple_type;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<Simple_typeContext> simple_type() {
			return getRuleContexts(Simple_typeContext.class);
		}
		public Simple_typeContext simple_type(int i) {
			return getRuleContext(Simple_typeContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((ParametersContext)_localctx).ID = match(ID);
			setState(104);
			match(T__1);
			setState(105);
			((ParametersContext)_localctx).simple_type = simple_type();
			_localctx.ast.add(new VarDefinition(
			                 ((ParametersContext)_localctx).ID.getLine(),
			                 ((ParametersContext)_localctx).ID.getCharPositionInLine()+1,
			                 ((ParametersContext)_localctx).simple_type.ast,
			                 (((ParametersContext)_localctx).ID!=null?((ParametersContext)_localctx).ID.getText():null)
			                 ));
			            
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(107);
				match(T__3);
				setState(108);
				((ParametersContext)_localctx).ID = match(ID);
				setState(109);
				match(T__1);
				setState(110);
				((ParametersContext)_localctx).simple_type = simple_type();
				_localctx.ast.add(new VarDefinition(
				                  ((ParametersContext)_localctx).ID.getLine(),
				                  ((ParametersContext)_localctx).ID.getCharPositionInLine()+1,
				                  ((ParametersContext)_localctx).simple_type.ast,
				                  (((ParametersContext)_localctx).ID!=null?((ParametersContext)_localctx).ID.getText():null)
				                  ));
				            
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFunctionInvocationContext extends ParserRuleContext {
		public Expression ast;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterExpressionFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitExpressionFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitExpressionFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionFunctionInvocationContext expressionFunctionInvocation() throws RecognitionException {
		ExpressionFunctionInvocationContext _localctx = new ExpressionFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionFunctionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((ExpressionFunctionInvocationContext)_localctx).ID = match(ID);
			setState(119);
			match(T__5);
			setState(120);
			((ExpressionFunctionInvocationContext)_localctx).arguments = arguments();
			setState(121);
			match(T__6);

			            ((ExpressionFunctionInvocationContext)_localctx).ast =  new FunctionInvocation(
			                ((ExpressionFunctionInvocationContext)_localctx).ID.getLine(),
			                ((ExpressionFunctionInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                new Variable(
			                    ((ExpressionFunctionInvocationContext)_localctx).ID.getLine(),
			                    ((ExpressionFunctionInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                    (((ExpressionFunctionInvocationContext)_localctx).ID!=null?((ExpressionFunctionInvocationContext)_localctx).ID.getText():null)),
			                ((ExpressionFunctionInvocationContext)_localctx).arguments.ast);
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementFunctionInvocationContext extends ParserRuleContext {
		public Statement ast;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementFunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementFunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterStatementFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitStatementFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitStatementFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementFunctionInvocationContext statementFunctionInvocation() throws RecognitionException {
		StatementFunctionInvocationContext _localctx = new StatementFunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementFunctionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((StatementFunctionInvocationContext)_localctx).ID = match(ID);
			setState(125);
			match(T__5);
			setState(126);
			((StatementFunctionInvocationContext)_localctx).arguments = arguments();
			setState(127);
			match(T__6);

			                ((StatementFunctionInvocationContext)_localctx).ast =  new FunctionInvocation(
			                    ((StatementFunctionInvocationContext)_localctx).ID.getLine(),
			                    ((StatementFunctionInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                    new Variable(
			                        ((StatementFunctionInvocationContext)_localctx).ID.getLine(),
			                        ((StatementFunctionInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                        (((StatementFunctionInvocationContext)_localctx).ID!=null?((StatementFunctionInvocationContext)_localctx).ID.getText():null)),
			                    ((StatementFunctionInvocationContext)_localctx).arguments.ast
			                );
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882840997952L) != 0)) {
				{
				setState(130);
				((ArgumentsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(132);
					match(T__3);
					setState(133);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<Statement> elseStmts = new ArrayList<>();
		public Token log;
		public ArgumentsContext arguments;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token op;
		public ExpressionContext expression;
		public BlockContext block;
		public BlockContext b1;
		public BlockContext b2;
		public StatementFunctionInvocationContext statementFunctionInvocation;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementFunctionInvocationContext statementFunctionInvocation() {
			return getRuleContext(StatementFunctionInvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((StatementContext)_localctx).log = match(T__10);
				setState(144);
				((StatementContext)_localctx).arguments = arguments();
				setState(145);
				match(T__2);

				            for(Expression e : ((StatementContext)_localctx).arguments.ast){
				                _localctx.ast.add( new LogStatement(
				                        ((StatementContext)_localctx).log.getLine(),
				                        ((StatementContext)_localctx).log.getCharPositionInLine()+1,
				                        e));
				            }
				          
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__11);
				setState(149);
				((StatementContext)_localctx).arguments = arguments();
				setState(150);
				match(T__2);

				           for(Expression e : ((StatementContext)_localctx).arguments.ast){ _localctx.ast.add( new InputStatement(
				                      e.getLine(),
				                      e.getColumn(),
				                      e));
				           }
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				((StatementContext)_localctx).e1 = expression(0);
				setState(154);
				match(T__12);
				setState(155);
				((StatementContext)_localctx).e2 = expression(0);
				setState(156);
				match(T__2);

				            _localctx.ast.add(new Assignment(
				                    ((StatementContext)_localctx).e1.ast.getLine(),
				                    ((StatementContext)_localctx).e1.ast.getColumn(),
				                    ((StatementContext)_localctx).e1.ast,
				                    ((StatementContext)_localctx).e2.ast));
				         
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				((StatementContext)_localctx).e1 = expression(0);
				setState(160);
				((StatementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((StatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				((StatementContext)_localctx).e2 = expression(0);
				setState(162);
				match(T__2);

				            _localctx.ast.add( new CompoundLogicalStatement(
				                            ((StatementContext)_localctx).e1.ast.getLine(),
				                            ((StatementContext)_localctx).e1.ast.getColumn(),
				                            ((StatementContext)_localctx).e1.ast,
				                            ((StatementContext)_localctx).e2.ast,
				                            (((StatementContext)_localctx).op!=null?((StatementContext)_localctx).op.getText():null)));
				         
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(T__15);
				setState(166);
				match(T__5);
				setState(167);
				((StatementContext)_localctx).expression = expression(0);
				setState(168);
				match(T__6);
				setState(169);
				((StatementContext)_localctx).block = block();

				            _localctx.ast.add(new WhileStatement(
				                    ((StatementContext)_localctx).expression.ast.getLine(),
				                    ((StatementContext)_localctx).expression.ast.getColumn(),
				                    ((StatementContext)_localctx).expression.ast,
				                    ((StatementContext)_localctx).block.ast));
				         
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(T__16);
				setState(173);
				match(T__5);
				setState(174);
				((StatementContext)_localctx).expression = expression(0);
				setState(175);
				match(T__6);
				setState(176);
				((StatementContext)_localctx).b1 = block();
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(177);
					match(T__17);
					setState(178);
					((StatementContext)_localctx).b2 = block();
					((StatementContext)_localctx).elseStmts =  ((StatementContext)_localctx).b2.ast;
					}
					break;
				}

				            _localctx.ast.add( new IfElseStatement(
				                    ((StatementContext)_localctx).expression.ast.getLine(),
				                    ((StatementContext)_localctx).expression.ast.getColumn(),
				                    ((StatementContext)_localctx).expression.ast,
				                    ((StatementContext)_localctx).b1.ast,
				                    _localctx.elseStmts));
				         
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(T__18);
				setState(186);
				((StatementContext)_localctx).expression = expression(0);
				setState(187);
				match(T__2);

				            _localctx.ast.add( new ReturnStatement(
				                    ((StatementContext)_localctx).expression.ast.getLine(),
				                    ((StatementContext)_localctx).expression.ast.getLine(),
				                    ((StatementContext)_localctx).expression.ast));
				         
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				((StatementContext)_localctx).statementFunctionInvocation = statementFunctionInvocation();
				setState(191);
				match(T__2);
				_localctx.ast.add(((StatementContext)_localctx).statementFunctionInvocation.ast);
				         
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__10:
			case T__11:
			case T__15:
			case T__16:
			case T__18:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((BlockContext)_localctx).statement = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__8);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882841724992L) != 0)) {
					{
					{
					setState(200);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public ExpressionContext expression;
		public Simple_typeContext simple_type;
		public ExpressionFunctionInvocationContext expressionFunctionInvocation;
		public Token ID;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public Token OP;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ExpressionFunctionInvocationContext expressionFunctionInvocation() {
			return getRuleContext(ExpressionFunctionInvocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(212);
				match(T__5);
				setState(213);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(214);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(217);
				match(T__5);
				setState(218);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(219);
				match(T__22);
				setState(220);
				((ExpressionContext)_localctx).simple_type = simple_type();
				setState(221);
				match(T__6);

				                        ((ExpressionContext)_localctx).ast =  new Cast(
				                            ((ExpressionContext)_localctx).expression.ast.getLine(),
				                            ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                            ((ExpressionContext)_localctx).expression.ast,
				                            ((ExpressionContext)_localctx).simple_type.ast
				                        );
				}
				break;
			case 3:
				{
				setState(224);
				match(T__23);
				setState(225);
				((ExpressionContext)_localctx).expression = expression(11);

				                        ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				                            ((ExpressionContext)_localctx).expression.ast.getLine(),
				                            ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                            ((ExpressionContext)_localctx).expression.ast
				                        );
				}
				break;
			case 4:
				{
				setState(228);
				match(T__24);
				setState(229);
				((ExpressionContext)_localctx).expression = expression(10);

				                        ((ExpressionContext)_localctx).ast =  new UnaryNot(
				                            ((ExpressionContext)_localctx).expression.ast.getLine(),
				                            ((ExpressionContext)_localctx).expression.ast.getColumn(),
				                            ((ExpressionContext)_localctx).expression.ast
				                        );
				}
				break;
			case 5:
				{
				setState(232);
				((ExpressionContext)_localctx).expressionFunctionInvocation = expressionFunctionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expressionFunctionInvocation.ast; 
				}
				break;
			case 6:
				{
				setState(235);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 7:
				{
				setState(237);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(239);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(241);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new NumberLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(246);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);

						                                  ((ExpressionContext)_localctx).ast =  new ArithmeticOperation(
						                                      ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                      ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                      ((ExpressionContext)_localctx).e1.ast,
						                                      ((ExpressionContext)_localctx).e2.ast,
						                                      (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						                                  );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(251);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(252);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);

						                                  ((ExpressionContext)_localctx).ast =  new ArithmeticOperation(
						                                      ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                      ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                      ((ExpressionContext)_localctx).e1.ast,
						                                      ((ExpressionContext)_localctx).e2.ast,
						                                      (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						                                  );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(256);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);

						                                  ((ExpressionContext)_localctx).ast =  new CompareOperation(
						                                      ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                      ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                      ((ExpressionContext)_localctx).e1.ast,
						                                      ((ExpressionContext)_localctx).e2.ast,
						                                      (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						                                  );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);

						                                  ((ExpressionContext)_localctx).ast =  new LogicOperation(
						                                      ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                      ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                      ((ExpressionContext)_localctx).e1.ast,
						                                      ((ExpressionContext)_localctx).e2.ast,
						                                      (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						                                  );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(266);
						match(T__19);
						setState(267);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(268);
						match(T__20);

						                                  ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						                                     ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                     ((ExpressionContext)_localctx).e1.ast.getColumn(),
						                                     ((ExpressionContext)_localctx).e1.ast,
						                                     ((ExpressionContext)_localctx).e2.ast
						                                  );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(272);
						match(T__21);
						setState(273);
						((ExpressionContext)_localctx).ID = match(ID);

						                                  ((ExpressionContext)_localctx).ast =  new FieldAccess(
						                                     ((ExpressionContext)_localctx).e.ast.getLine(),
						                                     ((ExpressionContext)_localctx).e.ast.getColumn(),
						                                     ((ExpressionContext)_localctx).e.ast,
						                                     (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)
						                                  );
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitSimple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_type);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__37);
				 ((Simple_typeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__38);
				 ((Simple_typeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__39);
				 ((Simple_typeContext)_localctx).ast =  NumberType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> recordsList = new ArrayList<RecordField>();
		public Simple_typeContext simple_type;
		public Token n;
		public TypeContext t;
		public Token ID;
		public VariablesContext variables;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((TypeContext)_localctx).simple_type = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__19);
				setState(292);
				((TypeContext)_localctx).n = match(INT_CONSTANT);
				setState(293);
				match(T__20);
				setState(294);
				((TypeContext)_localctx).t = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt(((TypeContext)_localctx).n.getText()), ((TypeContext)_localctx).t.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(T__19);
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					match(T__0);
					setState(299);
					((TypeContext)_localctx).ID = match(ID);
					setState(300);
					((TypeContext)_localctx).variables = variables();
					setState(301);
					match(T__1);
					setState(302);
					((TypeContext)_localctx).t = type();
					setState(303);
					match(T__2);

					              boolean duplicated = false;

					              for (RecordField rf : _localctx.recordsList) {
					                  if (rf.getName().equals(((TypeContext)_localctx).ID.getText())) {
					                      duplicated = true;
					                      new ErrorType(
					                          (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null) + " is already defined in this scope",
					                          rf
					                      );
					                      break;
					                  }
					              }

					              if (!duplicated) {
					                  _localctx.recordsList.add(
					                      new RecordField(
					                          ((TypeContext)_localctx).ID.getLine(),
					                          ((TypeContext)_localctx).ID.getCharPositionInLine() + 1,
					                          ((TypeContext)_localctx).ID.getText(),
					                          ((TypeContext)_localctx).t.ast
					                      )
					                  );
					              }

					              for (Token id : ((TypeContext)_localctx).variables.ast) {
					                  duplicated = false;

					                  for (RecordField rf : _localctx.recordsList) {
					                      if (rf.getName().equals(id.getText())) {
					                          duplicated = true;
					                          new ErrorType(
					                              id.getText() + " is already defined in this scope",
					                              rf
					                          );
					                          break;
					                      }
					                  }

					                  if (!duplicated) {
					                      _localctx.recordsList.add(
					                          new RecordField(
					                              id.getLine(),
					                              id.getCharPositionInLine() + 1,
					                              id.getText(),
					                              ((TypeContext)_localctx).t.ast
					                          )
					                      );
					                  }
					              }
					          
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(310);
				match(T__20);
				 ((TypeContext)_localctx).ast =  new RecordType(_localctx.recordsList); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainDefinitionContext extends ParserRuleContext {
		public Definition ast;
		public Type returnType;
		public List<VarDefinition> vars = new ArrayList<>();
		public List<VarDefinition> params = new ArrayList<>();
		public List<Statement> stmts = new ArrayList<>();
		public Token id;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).enterMainDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TSmmListener ) ((TSmmListener)listener).exitMainDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TSmmVisitor ) return ((TSmmVisitor<? extends T>)visitor).visitMainDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__4);
			setState(316);
			((MainDefinitionContext)_localctx).id = match(T__40);
			setState(317);
			match(T__5);
			setState(318);
			match(T__6);
			setState(319);
			match(T__1);
			setState(320);
			match(T__7);
			((MainDefinitionContext)_localctx).returnType =  VoidType.getInstance();
			setState(322);
			match(T__8);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(323);
				((MainDefinitionContext)_localctx).varDefinition = varDefinition();
				_localctx.vars.addAll(((MainDefinitionContext)_localctx).varDefinition.ast);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882841724992L) != 0)) {
				{
				{
				setState(331);
				((MainDefinitionContext)_localctx).statement = statement();
				_localctx.stmts.addAll(((MainDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__9);

			         ((MainDefinitionContext)_localctx).ast =  new FuncDefinition(((MainDefinitionContext)_localctx).id.getLine(),((MainDefinitionContext)_localctx).id.getCharPositionInLine()+1,
			             new FunctionType(
			                 _localctx.returnType,
			                 _localctx.params),
			             (((MainDefinitionContext)_localctx).id!=null?((MainDefinitionContext)_localctx).id.getText():null),_localctx.vars,_localctx.stmts
			         );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003"+
		"\n\u0003\f\u0003A\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"X\b\u0004\n\u0004\f\u0004[\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0089\b\b\n\b\f\b\u008c\t\b\u0003\b\u008e\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b6\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c3\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cc\b\n\n\n\f\n\u00cf"+
		"\t\n\u0001\n\u0003\n\u00d2\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f4"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0114\b\u000b\n\u000b\f\u000b\u0117\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011f\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0133"+
		"\b\r\u000b\r\f\r\u0134\u0001\r\u0001\r\u0001\r\u0003\r\u013a\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0147"+
		"\b\u000e\n\u000e\f\u000e\u014a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u014f\b\u000e\n\u000e\f\u000e\u0152\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u0016\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005"+
		"\u0001\u0000\u000e\u000f\u0001\u0000\u001a\u001c\u0002\u0000\u0018\u0018"+
		"\u001d\u001d\u0001\u0000\u001e#\u0001\u0000$%\u0170\u0000#\u0001\u0000"+
		"\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000"+
		"\u0006?\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\ng\u0001\u0000"+
		"\u0000\u0000\fv\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000"+
		"\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000"+
		"\u0014\u00d1\u0001\u0000\u0000\u0000\u0016\u00f3\u0001\u0000\u0000\u0000"+
		"\u0018\u011e\u0001\u0000\u0000\u0000\u001a\u0139\u0001\u0000\u0000\u0000"+
		"\u001c\u013b\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000"+
		"\u001f \u0006\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0003\u001c\u000e\u0000\'(\u0006\u0000\uffff\uffff\u0000"+
		"()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*+\u0003\u0004"+
		"\u0002\u0000+,\u0006\u0001\uffff\uffff\u0000,1\u0001\u0000\u0000\u0000"+
		"-.\u0003\b\u0004\u0000./\u0006\u0001\uffff\uffff\u0000/1\u0001\u0000\u0000"+
		"\u00000*\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00001\u0003\u0001"+
		"\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005/\u0000\u000045\u0003"+
		"\u0006\u0003\u000056\u0005\u0002\u0000\u000067\u0003\u001a\r\u000078\u0005"+
		"\u0003\u0000\u000089\u0006\u0002\uffff\uffff\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005/\u0000\u0000<>\u0006\u0003"+
		"\uffff\uffff\u0000=:\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u0005\u0000\u0000CD\u0005"+
		"/\u0000\u0000DH\u0005\u0006\u0000\u0000EF\u0003\n\u0005\u0000FG\u0006"+
		"\u0004\uffff\uffff\u0000GI\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0007"+
		"\u0000\u0000KQ\u0005\u0002\u0000\u0000LM\u0003\u0018\f\u0000MN\u0006\u0004"+
		"\uffff\uffff\u0000NR\u0001\u0000\u0000\u0000OP\u0005\b\u0000\u0000PR\u0006"+
		"\u0004\uffff\uffff\u0000QL\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SY\u0005\t\u0000\u0000TU\u0003\u0004\u0002"+
		"\u0000UV\u0006\u0004\uffff\uffff\u0000VX\u0001\u0000\u0000\u0000WT\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Za\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0003\u0012\t\u0000]^\u0006\u0004\uffff\uffff\u0000^`\u0001"+
		"\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0005\n\u0000\u0000ef\u0006\u0004\uffff"+
		"\uffff\u0000f\t\u0001\u0000\u0000\u0000gh\u0005/\u0000\u0000hi\u0005\u0002"+
		"\u0000\u0000ij\u0003\u0018\f\u0000js\u0006\u0005\uffff\uffff\u0000kl\u0005"+
		"\u0004\u0000\u0000lm\u0005/\u0000\u0000mn\u0005\u0002\u0000\u0000no\u0003"+
		"\u0018\f\u0000op\u0006\u0005\uffff\uffff\u0000pr\u0001\u0000\u0000\u0000"+
		"qk\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u000b\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005/\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u0003"+
		"\u0010\b\u0000yz\u0005\u0007\u0000\u0000z{\u0006\u0006\uffff\uffff\u0000"+
		"{\r\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005\u0006\u0000\u0000"+
		"~\u007f\u0003\u0010\b\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080"+
		"\u0081\u0006\u0007\uffff\uffff\u0000\u0081\u000f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u008a\u0006\b\uffff\uffff\u0000"+
		"\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000"+
		"\u0086\u0087\u0006\b\uffff\uffff\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0084\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u0082\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000b\u0000\u0000"+
		"\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092"+
		"\u0093\u0006\t\uffff\uffff\u0000\u0093\u00c3\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\f\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097"+
		"\u0005\u0003\u0000\u0000\u0097\u0098\u0006\t\uffff\uffff\u0000\u0098\u00c3"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0016\u000b\u0000\u009a\u009b"+
		"\u0005\r\u0000\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005"+
		"\u0003\u0000\u0000\u009d\u009e\u0006\t\uffff\uffff\u0000\u009e\u00c3\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0007"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005"+
		"\u0003\u0000\u0000\u00a3\u00a4\u0006\t\uffff\uffff\u0000\u00a4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0006\u0000\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0005"+
		"\u0007\u0000\u0000\u00a9\u00aa\u0003\u0014\n\u0000\u00aa\u00ab\u0006\t"+
		"\uffff\uffff\u0000\u00ab\u00c3\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0011\u0000\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae\u00af\u0003"+
		"\u0016\u000b\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b5\u0003"+
		"\u0014\n\u0000\u00b1\u00b2\u0005\u0012\u0000\u0000\u00b2\u00b3\u0003\u0014"+
		"\n\u0000\u00b3\u00b4\u0006\t\uffff\uffff\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\t\uffff"+
		"\uffff\u0000\u00b8\u00c3\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0013"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0016\u000b\u0000\u00bb\u00bc\u0005\u0003"+
		"\u0000\u0000\u00bc\u00bd\u0006\t\uffff\uffff\u0000\u00bd\u00c3\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005\u0003"+
		"\u0000\u0000\u00c0\u00c1\u0006\t\uffff\uffff\u0000\u00c1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c2\u008f\u0001\u0000\u0000\u0000\u00c2\u0094\u0001\u0000"+
		"\u0000\u0000\u00c2\u0099\u0001\u0000\u0000\u0000\u00c2\u009f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00a5\u0001\u0000\u0000\u0000\u00c2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000"+
		"\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0012"+
		"\t\u0000\u00c5\u00c6\u0006\n\uffff\uffff\u0000\u00c6\u00d2\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cd\u0005\t\u0000\u0000\u00c8\u00c9\u0003\u0012\t"+
		"\u0000\u00c9\u00ca\u0006\n\uffff\uffff\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0005\n\u0000\u0000\u00d1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00d1\u00c7\u0001\u0000\u0000\u0000\u00d2\u0015\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0006\u000b\uffff\uffff\u0000\u00d4\u00d5\u0005\u0006\u0000"+
		"\u0000\u00d5\u00d6\u0003\u0016\u000b\u0000\u00d6\u00d7\u0005\u0007\u0000"+
		"\u0000\u00d7\u00d8\u0006\u000b\uffff\uffff\u0000\u00d8\u00f4\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0003\u0016"+
		"\u000b\u0000\u00db\u00dc\u0005\u0017\u0000\u0000\u00dc\u00dd\u0003\u0018"+
		"\f\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00df\u0006\u000b\uffff"+
		"\uffff\u0000\u00df\u00f4\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0018"+
		"\u0000\u0000\u00e1\u00e2\u0003\u0016\u000b\u000b\u00e2\u00e3\u0006\u000b"+
		"\uffff\uffff\u0000\u00e3\u00f4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0019\u0000\u0000\u00e5\u00e6\u0003\u0016\u000b\n\u00e6\u00e7\u0006\u000b"+
		"\uffff\uffff\u0000\u00e7\u00f4\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003"+
		"\f\u0006\u0000\u00e9\u00ea\u0006\u000b\uffff\uffff\u0000\u00ea\u00f4\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00f4\u0006\u000b"+
		"\uffff\uffff\u0000\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00f4\u0006\u000b"+
		"\uffff\uffff\u0000\u00ef\u00f0\u0005-\u0000\u0000\u00f0\u00f4\u0006\u000b"+
		"\uffff\uffff\u0000\u00f1\u00f2\u0005.\u0000\u0000\u00f2\u00f4\u0006\u000b"+
		"\uffff\uffff\u0000\u00f3\u00d3\u0001\u0000\u0000\u0000\u00f3\u00d9\u0001"+
		"\u0000\u0000\u0000\u00f3\u00e0\u0001\u0000\u0000\u0000\u00f3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f3\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u0115\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\n\t\u0000\u0000\u00f6\u00f7\u0007\u0001"+
		"\u0000\u0000\u00f7\u00f8\u0003\u0016\u000b\n\u00f8\u00f9\u0006\u000b\uffff"+
		"\uffff\u0000\u00f9\u0114\u0001\u0000\u0000\u0000\u00fa\u00fb\n\b\u0000"+
		"\u0000\u00fb\u00fc\u0007\u0002\u0000\u0000\u00fc\u00fd\u0003\u0016\u000b"+
		"\t\u00fd\u00fe\u0006\u000b\uffff\uffff\u0000\u00fe\u0114\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\n\u0007\u0000\u0000\u0100\u0101\u0007\u0003\u0000\u0000"+
		"\u0101\u0102\u0003\u0016\u000b\b\u0102\u0103\u0006\u000b\uffff\uffff\u0000"+
		"\u0103\u0114\u0001\u0000\u0000\u0000\u0104\u0105\n\u0006\u0000\u0000\u0105"+
		"\u0106\u0007\u0004\u0000\u0000\u0106\u0107\u0003\u0016\u000b\u0007\u0107"+
		"\u0108\u0006\u000b\uffff\uffff\u0000\u0108\u0114\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\n\u000e\u0000\u0000\u010a\u010b\u0005\u0014\u0000\u0000\u010b"+
		"\u010c\u0003\u0016\u000b\u0000\u010c\u010d\u0005\u0015\u0000\u0000\u010d"+
		"\u010e\u0006\u000b\uffff\uffff\u0000\u010e\u0114\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\n\r\u0000\u0000\u0110\u0111\u0005\u0016\u0000\u0000\u0111"+
		"\u0112\u0005/\u0000\u0000\u0112\u0114\u0006\u000b\uffff\uffff\u0000\u0113"+
		"\u00f5\u0001\u0000\u0000\u0000\u0113\u00fa\u0001\u0000\u0000\u0000\u0113"+
		"\u00ff\u0001\u0000\u0000\u0000\u0113\u0104\u0001\u0000\u0000\u0000\u0113"+
		"\u0109\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0114"+
		"\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0017\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011f"+
		"\u0006\f\uffff\uffff\u0000\u011a\u011b\u0005\'\u0000\u0000\u011b\u011f"+
		"\u0006\f\uffff\uffff\u0000\u011c\u011d\u0005(\u0000\u0000\u011d\u011f"+
		"\u0006\f\uffff\uffff\u0000\u011e\u0118\u0001\u0000\u0000\u0000\u011e\u011a"+
		"\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0019"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121\u0122\u0006"+
		"\r\uffff\uffff\u0000\u0122\u013a\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"\u0014\u0000\u0000\u0124\u0125\u0005,\u0000\u0000\u0125\u0126\u0005\u0015"+
		"\u0000\u0000\u0126\u0127\u0003\u001a\r\u0000\u0127\u0128\u0006\r\uffff"+
		"\uffff\u0000\u0128\u013a\u0001\u0000\u0000\u0000\u0129\u0132\u0005\u0014"+
		"\u0000\u0000\u012a\u012b\u0005\u0001\u0000\u0000\u012b\u012c\u0005/\u0000"+
		"\u0000\u012c\u012d\u0003\u0006\u0003\u0000\u012d\u012e\u0005\u0002\u0000"+
		"\u0000\u012e\u012f\u0003\u001a\r\u0000\u012f\u0130\u0005\u0003\u0000\u0000"+
		"\u0130\u0131\u0006\r\uffff\uffff\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u012a\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0015\u0000\u0000"+
		"\u0137\u0138\u0006\r\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u0120\u0001\u0000\u0000\u0000\u0139\u0123\u0001\u0000\u0000\u0000"+
		"\u0139\u0129\u0001\u0000\u0000\u0000\u013a\u001b\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005\u0005\u0000\u0000\u013c\u013d\u0005)\u0000\u0000\u013d"+
		"\u013e\u0005\u0006\u0000\u0000\u013e\u013f\u0005\u0007\u0000\u0000\u013f"+
		"\u0140\u0005\u0002\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0142"+
		"\u0006\u000e\uffff\uffff\u0000\u0142\u0148\u0005\t\u0000\u0000\u0143\u0144"+
		"\u0003\u0004\u0002\u0000\u0144\u0145\u0006\u000e\uffff\uffff\u0000\u0145"+
		"\u0147\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u0150\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0003\u0012\t\u0000\u014c\u014d"+
		"\u0006\u000e\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u014b\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0005\n\u0000\u0000\u0154\u0155\u0006\u000e\uffff\uffff\u0000\u0155"+
		"\u001d\u0001\u0000\u0000\u0000\u0016#0?HQYas\u008a\u008d\u00b5\u00c2\u00cd"+
		"\u00d1\u00f3\u0113\u0115\u011e\u0134\u0139\u0148\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}