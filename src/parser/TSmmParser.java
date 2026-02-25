// Generated from C:/Users/teres/IdeaProjects/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
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
		T__38=39, WHITES=40, COMMENT=41, INT_CONSTANT=42, CHAR_CONSTANT=43, REAL_CONSTANT=44, 
		ID=45;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefinition = 2, RULE_funcDefinition = 3, 
		RULE_parameters = 4, RULE_functionInvocation = 5, RULE_arguments = 6, 
		RULE_statement = 7, RULE_block = 8, RULE_expression = 9, RULE_simple_type = 10, 
		RULE_type = 11, RULE_mainDefinition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefinition", "funcDefinition", "parameters", 
			"functionInvocation", "arguments", "statement", "block", "expression", 
			"simple_type", "type", "mainDefinition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "','", "':'", "';'", "'function'", "'('", "')'", "'void'", 
			"'{'", "'}'", "'log'", "'input'", "'='", "'while'", "'if'", "'else'", 
			"'return'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'%'", 
			"'/'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'char'", "'int'", "'number'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WHITES", "COMMENT", "INT_CONSTANT", "CHAR_CONSTANT", 
			"REAL_CONSTANT", "ID"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					definition();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
			mainDefinition();
			setState(33);
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
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				varDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				funcDefinition();
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
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(41);
				match(T__1);
				setState(42);
				match(ID);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__2);
			setState(49);
			type();
			setState(50);
			match(T__3);
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
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			match(ID);
			setState(54);
			match(T__5);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55);
				parameters();
				}
			}

			setState(58);
			match(T__6);
			setState(59);
			match(T__2);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				{
				setState(60);
				simple_type();
				}
				break;
			case T__7:
				{
				setState(61);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
			match(T__8);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(65);
				varDefinition();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970710435904L) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__9);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			match(ID);
			setState(80);
			match(T__2);
			setState(81);
			simple_type();
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				match(ID);
				setState(85);
				match(T__2);
				setState(86);
				simple_type();
				}
				}
				setState(91);
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
	public static class FunctionInvocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(T__5);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970710249536L) != 0)) {
				{
				setState(94);
				arguments();
				}
			}

			setState(97);
			match(T__6);
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expression(0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(100);
				match(T__1);
				setState(101);
				expression(0);
				}
				}
				setState(106);
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
	public static class StatementContext extends ParserRuleContext {
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
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__10);
				setState(108);
				expression(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(109);
					match(T__1);
					setState(110);
					expression(0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__11);
				setState(119);
				expression(0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					expression(0);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				expression(0);
				setState(130);
				match(T__12);
				setState(131);
				expression(0);
				setState(132);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__13);
				setState(135);
				match(T__5);
				setState(136);
				expression(0);
				setState(137);
				match(T__6);
				setState(138);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__14);
				setState(141);
				match(T__5);
				setState(142);
				expression(0);
				setState(143);
				match(T__6);
				setState(144);
				block();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(145);
					match(T__15);
					setState(146);
					block();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(T__16);
				setState(150);
				expression(0);
				setState(151);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				functionInvocation();
				setState(154);
				match(T__3);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__16:
			case T__21:
			case T__22:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				statement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__8);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970710435904L) != 0)) {
					{
					{
					setState(160);
					statement();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(170);
				match(T__5);
				setState(171);
				expression(0);
				setState(172);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(174);
				match(T__5);
				setState(175);
				expression(0);
				setState(176);
				match(T__20);
				setState(177);
				type();
				setState(178);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(180);
				match(T__21);
				setState(181);
				expression(11);
				}
				break;
			case 4:
				{
				setState(182);
				match(T__22);
				setState(183);
				expression(10);
				}
				break;
			case 5:
				{
				setState(184);
				functionInvocation();
				}
				break;
			case 6:
				{
				setState(185);
				match(ID);
				}
				break;
			case 7:
				{
				setState(186);
				match(CHAR_CONSTANT);
				}
				break;
			case 8:
				{
				setState(187);
				match(INT_CONSTANT);
				}
				break;
			case 9:
				{
				setState(188);
				match(REAL_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(204);
						match(T__17);
						setState(205);
						expression(0);
						setState(206);
						match(T__18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(209);
						match(T__19);
						setState(210);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TypeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				simple_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__17);
				setState(220);
				match(INT_CONSTANT);
				setState(221);
				match(T__18);
				setState(222);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__17);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(224);
					varDefinition();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				match(T__18);
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
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__4);
			setState(234);
			match(T__38);
			setState(235);
			match(T__5);
			setState(236);
			match(T__6);
			setState(237);
			match(T__2);
			setState(238);
			match(T__7);
			setState(239);
			match(T__8);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(240);
				varDefinition();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970710435904L) != 0)) {
				{
				{
				setState(246);
				statement();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(T__9);
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
		case 9:
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
		"\u0004\u0001-\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003?\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f"+
		"\u0003F\t\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004X\b\u0004"+
		"\n\u0004\f\u0004[\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"`\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0094\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00a2\b\b\n\b\f\b\u00a5\t\b\u0001\b\u0003\b\u00a8"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00be\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d4\b\t\n"+
		"\t\f\t\u00d7\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e2\b\u000b\n"+
		"\u000b\f\u000b\u00e5\t\u000b\u0001\u000b\u0003\u000b\u00e8\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f2"+
		"\b\f\n\f\f\f\u00f5\t\f\u0001\f\u0005\f\u00f8\b\f\n\f\f\f\u00fb\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0001\u0012\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0001\u0000\u0018\u001a\u0002"+
		"\u0000\u0016\u0016\u001b\u001b\u0001\u0000\u001c!\u0001\u0000\"#\u0001"+
		"\u0000$&\u0119\u0000\u001d\u0001\u0000\u0000\u0000\u0002%\u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fc\u0001"+
		"\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a7\u0001"+
		"\u0000\u0000\u0000\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u00d8\u0001"+
		"\u0000\u0000\u0000\u0016\u00e7\u0001\u0000\u0000\u0000\u0018\u00e9\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0003\u0018\f\u0000"+
		"!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#&\u0003\u0004"+
		"\u0002\u0000$&\u0003\u0006\u0003\u0000%#\u0001\u0000\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u0001\u0000"+
		"\u0000(-\u0005-\u0000\u0000)*\u0005\u0002\u0000\u0000*,\u0005-\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000001\u0005\u0003\u0000\u000012\u0003\u0016\u000b\u000023\u0005"+
		"\u0004\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0005\u0000"+
		"\u000056\u0005-\u0000\u000068\u0005\u0006\u0000\u000079\u0003\b\u0004"+
		"\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0007\u0000\u0000;>\u0005\u0003\u0000\u0000<?\u0003"+
		"\u0014\n\u0000=?\u0005\b\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@D\u0005\t\u0000\u0000AC\u0003"+
		"\u0004\u0002\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EJ\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GI\u0003\u000e\u0007\u0000HG\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005\n\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0003\u0014\n\u0000RY\u0001\u0000\u0000\u0000"+
		"ST\u0005\u0002\u0000\u0000TU\u0005-\u0000\u0000UV\u0005\u0003\u0000\u0000"+
		"VX\u0003\u0014\n\u0000WS\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]_\u0005\u0006\u0000"+
		"\u0000^`\u0003\f\u0006\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0007\u0000\u0000b\u000b\u0001"+
		"\u0000\u0000\u0000ch\u0003\u0012\t\u0000de\u0005\u0002\u0000\u0000eg\u0003"+
		"\u0012\t\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u0005\u000b\u0000\u0000lq\u0003\u0012\t\u0000"+
		"mn\u0005\u0002\u0000\u0000np\u0003\u0012\t\u0000om\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0004"+
		"\u0000\u0000u\u009d\u0001\u0000\u0000\u0000vw\u0005\f\u0000\u0000w|\u0003"+
		"\u0012\t\u0000xy\u0005\u0002\u0000\u0000y{\u0003\u0012\t\u0000zx\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u009d\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082\u0083\u0005\r\u0000"+
		"\u0000\u0083\u0084\u0003\u0012\t\u0000\u0084\u0085\u0005\u0004\u0000\u0000"+
		"\u0085\u009d\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000"+
		"\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089"+
		"\u008a\u0005\u0007\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u009d"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d\u008e"+
		"\u0005\u0006\u0000\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u0005"+
		"\u0007\u0000\u0000\u0090\u0093\u0003\u0010\b\u0000\u0091\u0092\u0005\u0010"+
		"\u0000\u0000\u0092\u0094\u0003\u0010\b\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u009d\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000"+
		"\u0097\u0098\u0005\u0004\u0000\u0000\u0098\u009d\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u009d\u0001\u0000\u0000\u0000\u009ck\u0001\u0000\u0000\u0000\u009cv\u0001"+
		"\u0000\u0000\u0000\u009c\u0081\u0001\u0000\u0000\u0000\u009c\u0086\u0001"+
		"\u0000\u0000\u0000\u009c\u008c\u0001\u0000\u0000\u0000\u009c\u0095\u0001"+
		"\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u000f\u0001"+
		"\u0000\u0000\u0000\u009e\u00a8\u0003\u000e\u0007\u0000\u009f\u00a3\u0005"+
		"\t\u0000\u0000\u00a0\u00a2\u0003\u000e\u0007\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\n\u0000"+
		"\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000"+
		"\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00aa\u0006\t\uffff\uffff"+
		"\u0000\u00aa\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0003\u0012\t\u0000"+
		"\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00be\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0"+
		"\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b2\u0003\u0016\u000b\u0000\u00b2"+
		"\u00b3\u0005\u0007\u0000\u0000\u00b3\u00be\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0016\u0000\u0000\u00b5\u00be\u0003\u0012\t\u000b\u00b6\u00b7"+
		"\u0005\u0017\u0000\u0000\u00b7\u00be\u0003\u0012\t\n\u00b8\u00be\u0003"+
		"\n\u0005\u0000\u00b9\u00be\u0005-\u0000\u0000\u00ba\u00be\u0005+\u0000"+
		"\u0000\u00bb\u00be\u0005*\u0000\u0000\u00bc\u00be\u0005,\u0000\u0000\u00bd"+
		"\u00a9\u0001\u0000\u0000\u0000\u00bd\u00ae\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00bd"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00d5\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\n\t\u0000\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1\u00d4"+
		"\u0003\u0012\t\n\u00c2\u00c3\n\b\u0000\u0000\u00c3\u00c4\u0007\u0001\u0000"+
		"\u0000\u00c4\u00d4\u0003\u0012\t\t\u00c5\u00c6\n\u0007\u0000\u0000\u00c6"+
		"\u00c7\u0007\u0002\u0000\u0000\u00c7\u00d4\u0003\u0012\t\b\u00c8\u00c9"+
		"\n\u0006\u0000\u0000\u00c9\u00ca\u0007\u0003\u0000\u0000\u00ca\u00d4\u0003"+
		"\u0012\t\u0007\u00cb\u00cc\n\u000e\u0000\u0000\u00cc\u00cd\u0005\u0012"+
		"\u0000\u0000\u00cd\u00ce\u0003\u0012\t\u0000\u00ce\u00cf\u0005\u0013\u0000"+
		"\u0000\u00cf\u00d4\u0001\u0000\u0000\u0000\u00d0\u00d1\n\r\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0014\u0000\u0000\u00d2\u00d4\u0005-\u0000\u0000\u00d3"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d3\u00c2\u0001\u0000\u0000\u0000\u00d3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d3\u00c8\u0001\u0000\u0000\u0000\u00d3"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u0013\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0004\u0000\u0000\u00d9"+
		"\u0015\u0001\u0000\u0000\u0000\u00da\u00e8\u0003\u0014\n\u0000\u00db\u00dc"+
		"\u0005\u0012\u0000\u0000\u00dc\u00dd\u0005*\u0000\u0000\u00dd\u00de\u0005"+
		"\u0013\u0000\u0000\u00de\u00e8\u0003\u0016\u000b\u0000\u00df\u00e3\u0005"+
		"\u0012\u0000\u0000\u00e0\u00e2\u0003\u0004\u0002\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005"+
		"\u0013\u0000\u0000\u00e7\u00da\u0001\u0000\u0000\u0000\u00e7\u00db\u0001"+
		"\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e8\u0017\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea\u00eb\u0005"+
		"\'\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u00ed\u0005\u0007"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\b\u0000"+
		"\u0000\u00ef\u00f3\u0005\t\u0000\u0000\u00f0\u00f2\u0003\u0004\u0002\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f9\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0003\u000e\u0007\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\n\u0000\u0000\u00fd"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u001d%-8>DJY_hq|\u0093\u009c\u00a3"+
		"\u00a7\u00bd\u00d3\u00d5\u00e3\u00e7\u00f3\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}