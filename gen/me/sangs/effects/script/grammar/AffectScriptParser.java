// Generated from /Volumes/IntelliJ CE Source/EffectScript/src/me/sangs/effects/script/grammar/AffectScript.g4 by ANTLR 4.7
package me.sangs.effects.script.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AffectScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, USE_K=12, SCRIPT_k=13, CREATE_K=14, COMPOSITION_K=15, 
		SET_K=16, TO_K=17, ADD_K=18, TEXT_K=19, OPEN_K=20, SHOW_K=21, MSGBOX_K=22, 
		IMPORT_K=23, FILE_K=24, SELECT=25, SOLID_K=26, APPLY_K=27, EFFECT_K=28, 
		PARAMS_K=29, NEW_K=30, FOLDER_K=31, ANNOTATION_MARK=32, MOVE_K=33, NEW_=34, 
		RECTANGLE_K=35, SETVALUES_FUNC=36, LPAREN=37, RPAREN=38, COLON=39, COMMA=40, 
		LBRACK=41, RBRACK=42, LBRACE=43, RBRACE=44, IF=45, ELSE=46, WHILE=47, 
		VAR=48, EQUAL=49, RETURN=50, PRINT=51, FUNC=52, TYPEINT=53, TYPEFLOAT=54, 
		TYPESTRING=55, TYPEBOOLEAN=56, TRUE=57, FALSE=58, SUB=59, BANG=60, MUL=61, 
		DIV=62, ADD=63, LT=64, LE=65, EQUAL_EQUAL=66, NOT_EQUAL=67, GT=68, GE=69, 
		OR=70, AND=71, DOT=72, LINE_COMMENT=73, COMMENT=74, ID=75, ANNO=76, INT=77, 
		FLOAT=78, STRING=79, WS=80, ERRCHAR=81;
	public static final int
		RULE_affectscript = 0, RULE_usescript = 1, RULE_annotation = 2, RULE_create = 3, 
		RULE_set = 4, RULE_setprop = 5, RULE_add = 6, RULE_setvalues = 7, RULE_open = 8, 
		RULE_msgbox = 9, RULE_move = 10, RULE_new_b = 11, RULE_applyeffect = 12, 
		RULE_returnfunction = 13, RULE_function = 14, RULE_formal_args = 15, RULE_param_args = 16, 
		RULE_annotation_args = 17, RULE_formal_arg = 18, RULE_param_arg = 19, 
		RULE_annotation_arg = 20, RULE_createkeywords = 21, RULE_type = 22, RULE_block = 23, 
		RULE_moduleblock = 24, RULE_setvalblock = 25, RULE_msgblock = 26, RULE_importfile = 27, 
		RULE_allstatement = 28, RULE_statement = 29, RULE_setvalstatement = 30, 
		RULE_setvalexpr = 31, RULE_multivariable = 32, RULE_modulestatement = 33, 
		RULE_vardef = 34, RULE_expr = 35, RULE_setexpr = 36, RULE_operator = 37, 
		RULE_call_expr = 38, RULE_expr_list = 39, RULE_primary = 40;
	public static final String[] ruleNames = {
		"affectscript", "usescript", "annotation", "create", "set", "setprop", 
		"add", "setvalues", "open", "msgbox", "move", "new_b", "applyeffect", 
		"returnfunction", "function", "formal_args", "param_args", "annotation_args", 
		"formal_arg", "param_arg", "annotation_arg", "createkeywords", "type", 
		"block", "moduleblock", "setvalblock", "msgblock", "importfile", "allstatement", 
		"statement", "setvalstatement", "setvalexpr", "multivariable", "modulestatement", 
		"vardef", "expr", "setexpr", "operator", "call_expr", "expr_list", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'question'", "'params'", "'shape'", "'oval'", "'yes'", "'no'", 
		"'>>>'", "'answer'", "'->'", "'rgb'", "'.'", "'use'", "'script'", "'create'", 
		"'composition'", "'set'", "'to'", "'add'", "'text'", "'open'", "'show'", 
		"'messagebox'", "'import'", "'file'", "'select'", "'solid'", "'apply'", 
		"'effect'", "'parameters'", "'new'", "'folder'", "'@'", "'move'", null, 
		"'rectangle'", "'setValues'", "'('", "')'", "':'", "','", "'['", "']'", 
		"'{'", "'}'", "'if'", "'else'", "'while'", "'var'", "'='", "'return'", 
		"'print'", "'func'", "'int'", "'float'", "'string'", "'boolean'", "'true'", 
		"'false'", "'-'", "'!'", "'*'", "'/'", "'+'", "'<'", "'<='", "'=='", "'!='", 
		"'>'", "'>='", "'||'", "'&&'", "' . '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"USE_K", "SCRIPT_k", "CREATE_K", "COMPOSITION_K", "SET_K", "TO_K", "ADD_K", 
		"TEXT_K", "OPEN_K", "SHOW_K", "MSGBOX_K", "IMPORT_K", "FILE_K", "SELECT", 
		"SOLID_K", "APPLY_K", "EFFECT_K", "PARAMS_K", "NEW_K", "FOLDER_K", "ANNOTATION_MARK", 
		"MOVE_K", "NEW_", "RECTANGLE_K", "SETVALUES_FUNC", "LPAREN", "RPAREN", 
		"COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IF", "ELSE", 
		"WHILE", "VAR", "EQUAL", "RETURN", "PRINT", "FUNC", "TYPEINT", "TYPEFLOAT", 
		"TYPESTRING", "TYPEBOOLEAN", "TRUE", "FALSE", "SUB", "BANG", "MUL", "DIV", 
		"ADD", "LT", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "GT", "GE", "OR", "AND", 
		"DOT", "LINE_COMMENT", "COMMENT", "ID", "ANNO", "INT", "FLOAT", "STRING", 
		"WS", "ERRCHAR"
	};
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
	public String getGrammarFileName() { return "AffectScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AffectScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AffectscriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AffectScriptParser.EOF, 0); }
		public List<UsescriptContext> usescript() {
			return getRuleContexts(UsescriptContext.class);
		}
		public UsescriptContext usescript(int i) {
			return getRuleContext(UsescriptContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public List<SetpropContext> setprop() {
			return getRuleContexts(SetpropContext.class);
		}
		public SetpropContext setprop(int i) {
			return getRuleContext(SetpropContext.class,i);
		}
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<SetvaluesContext> setvalues() {
			return getRuleContexts(SetvaluesContext.class);
		}
		public SetvaluesContext setvalues(int i) {
			return getRuleContext(SetvaluesContext.class,i);
		}
		public List<OpenContext> open() {
			return getRuleContexts(OpenContext.class);
		}
		public OpenContext open(int i) {
			return getRuleContext(OpenContext.class,i);
		}
		public List<MsgboxContext> msgbox() {
			return getRuleContexts(MsgboxContext.class);
		}
		public MsgboxContext msgbox(int i) {
			return getRuleContext(MsgboxContext.class,i);
		}
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public List<ApplyeffectContext> applyeffect() {
			return getRuleContexts(ApplyeffectContext.class);
		}
		public ApplyeffectContext applyeffect(int i) {
			return getRuleContext(ApplyeffectContext.class,i);
		}
		public List<ImportfileContext> importfile() {
			return getRuleContexts(ImportfileContext.class);
		}
		public ImportfileContext importfile(int i) {
			return getRuleContext(ImportfileContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<New_bContext> new_b() {
			return getRuleContexts(New_bContext.class);
		}
		public New_bContext new_b(int i) {
			return getRuleContext(New_bContext.class,i);
		}
		public AffectscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAffectscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAffectscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAffectscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectscriptContext affectscript() throws RecognitionException {
		AffectscriptContext _localctx = new AffectscriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_affectscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(82);
					usescript();
					}
					break;
				case 2:
					{
					setState(83);
					annotation();
					}
					break;
				case 3:
					{
					setState(84);
					create();
					}
					break;
				case 4:
					{
					setState(85);
					set();
					}
					break;
				case 5:
					{
					setState(86);
					setprop();
					}
					break;
				case 6:
					{
					setState(87);
					add();
					}
					break;
				case 7:
					{
					setState(88);
					setvalues();
					}
					break;
				case 8:
					{
					setState(89);
					open();
					}
					break;
				case 9:
					{
					setState(90);
					msgbox();
					}
					break;
				case 10:
					{
					setState(91);
					move();
					}
					break;
				case 11:
					{
					setState(92);
					applyeffect();
					}
					break;
				case 12:
					{
					setState(93);
					importfile();
					}
					break;
				case 13:
					{
					setState(94);
					function();
					}
					break;
				case 14:
					{
					setState(95);
					new_b();
					}
					break;
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USE_K) | (1L << SET_K) | (1L << ADD_K) | (1L << OPEN_K) | (1L << SHOW_K) | (1L << APPLY_K) | (1L << MOVE_K) | (1L << SETVALUES_FUNC) | (1L << FUNC))) != 0) || _la==ID || _la==ANNO );
			setState(100);
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

	public static class UsescriptContext extends ParserRuleContext {
		public UsescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usescript; }
	 
		public UsescriptContext() { }
		public void copyFrom(UsescriptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportScriptContext extends UsescriptContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ImportScriptContext(UsescriptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterImportScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitImportScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitImportScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsescriptContext usescript() throws RecognitionException {
		UsescriptContext _localctx = new UsescriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usescript);
		try {
			_localctx = new ImportScriptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(USE_K);
			setState(103);
			match(SCRIPT_k);
			setState(104);
			match(ID);
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	 
		public AnnotationContext() { }
		public void copyFrom(AnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotationsContext extends AnnotationContext {
		public TerminalNode ANNO() { return getToken(AffectScriptParser.ANNO, 0); }
		public Annotation_argsContext annotation_args() {
			return getRuleContext(Annotation_argsContext.class,0);
		}
		public AnnotationsContext(AnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotation);
		try {
			_localctx = new AnnotationsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ANNO);
			setState(107);
			match(LPAREN);
			setState(108);
			annotation_args();
			setState(109);
			match(RPAREN);
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

	public static class CreateContext extends ParserRuleContext {
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
	 
		public CreateContext() { }
		public void copyFrom(CreateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateLayerContext extends CreateContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public CreatekeywordsContext createkeywords() {
			return getRuleContext(CreatekeywordsContext.class,0);
		}
		public CreateLayerContext(CreateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterCreateLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitCreateLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitCreateLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create);
		try {
			_localctx = new CreateLayerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(EQUAL);
			setState(113);
			match(CREATE_K);
			setState(114);
			createkeywords();
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

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	 
		public SetContext() { }
		public void copyFrom(SetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetPropertyContext extends SetContext {
		public List<TerminalNode> ID() { return getTokens(AffectScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AffectScriptParser.ID, i);
		}
		public SetexprContext setexpr() {
			return getRuleContext(SetexprContext.class,0);
		}
		public SetPropertyContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set);
		try {
			_localctx = new SetPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(SET_K);
			setState(117);
			match(ID);
			setState(118);
			setexpr();
			setState(119);
			match(TO_K);
			setState(120);
			match(ID);
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

	public static class SetpropContext extends ParserRuleContext {
		public SetpropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setprop; }
	 
		public SetpropContext() { }
		public void copyFrom(SetpropContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetParametersContext extends SetpropContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public AllstatementContext allstatement() {
			return getRuleContext(AllstatementContext.class,0);
		}
		public SetParametersContext(SetpropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetpropContext setprop() throws RecognitionException {
		SetpropContext _localctx = new SetpropContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setprop);
		try {
			_localctx = new SetParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SET_K);
			setState(123);
			match(PARAMS_K);
			setState(124);
			match(STRING);
			setState(125);
			match(TO_K);
			setState(126);
			match(ID);
			setState(127);
			match(LBRACE);
			setState(128);
			allstatement();
			setState(129);
			match(RBRACE);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddLayerToLayerContext extends AddContext {
		public List<TerminalNode> ID() { return getTokens(AffectScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AffectScriptParser.ID, i);
		}
		public AddLayerToLayerContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAddLayerToLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAddLayerToLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAddLayerToLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		try {
			_localctx = new AddLayerToLayerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ADD_K);
			setState(132);
			match(ID);
			setState(133);
			match(TO_K);
			setState(134);
			match(ID);
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

	public static class SetvaluesContext extends ParserRuleContext {
		public SetvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvalues; }
	 
		public SetvaluesContext() { }
		public void copyFrom(SetvaluesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetValueContext extends SetvaluesContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public SetvalblockContext setvalblock() {
			return getRuleContext(SetvalblockContext.class,0);
		}
		public SetValueContext(SetvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetvaluesContext setvalues() throws RecognitionException {
		SetvaluesContext _localctx = new SetvaluesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setvalues);
		try {
			_localctx = new SetValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(SETVALUES_FUNC);
			setState(137);
			match(ID);
			setState(138);
			setvalblock();
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

	public static class OpenContext extends ParserRuleContext {
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
	 
		public OpenContext() { }
		public void copyFrom(OpenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpenLayerContext extends OpenContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public OpenLayerContext(OpenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterOpenLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitOpenLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitOpenLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_open);
		try {
			_localctx = new OpenLayerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(OPEN_K);
			setState(141);
			match(ID);
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

	public static class MsgboxContext extends ParserRuleContext {
		public MsgboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgbox; }
	 
		public MsgboxContext() { }
		public void copyFrom(MsgboxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowMessageBoxContext extends MsgboxContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public ShowMessageBoxContext(MsgboxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterShowMessageBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitShowMessageBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitShowMessageBox(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowMessageBoxYesOrNoContext extends MsgboxContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public MsgblockContext msgblock() {
			return getRuleContext(MsgblockContext.class,0);
		}
		public ShowMessageBoxYesOrNoContext(MsgboxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterShowMessageBoxYesOrNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitShowMessageBoxYesOrNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitShowMessageBoxYesOrNo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgboxContext msgbox() throws RecognitionException {
		MsgboxContext _localctx = new MsgboxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_msgbox);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ShowMessageBoxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(SHOW_K);
				setState(144);
				match(MSGBOX_K);
				setState(145);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new ShowMessageBoxYesOrNoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(SHOW_K);
				setState(147);
				match(MSGBOX_K);
				setState(148);
				match(STRING);
				setState(149);
				match(SELECT);
				setState(150);
				msgblock();
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

	public static class MoveContext extends ParserRuleContext {
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	 
		public MoveContext() { }
		public void copyFrom(MoveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveReferenceContext extends MoveContext {
		public List<TerminalNode> ID() { return getTokens(AffectScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AffectScriptParser.ID, i);
		}
		public MoveReferenceContext(MoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterMoveReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitMoveReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitMoveReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_move);
		try {
			_localctx = new MoveReferenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(MOVE_K);
			setState(154);
			match(ID);
			setState(155);
			match(TO_K);
			setState(156);
			match(ID);
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

	public static class New_bContext extends ParserRuleContext {
		public New_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_b; }
	 
		public New_bContext() { }
		public void copyFrom(New_bContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewReferenceContext extends New_bContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public TerminalNode NEW_() { return getToken(AffectScriptParser.NEW_, 0); }
		public NewReferenceContext(New_bContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterNewReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitNewReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitNewReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_bContext new_b() throws RecognitionException {
		New_bContext _localctx = new New_bContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_new_b);
		try {
			_localctx = new NewReferenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(EQUAL);
			setState(160);
			match(NEW_);
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

	public static class ApplyeffectContext extends ParserRuleContext {
		public ApplyeffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyeffect; }
	 
		public ApplyeffectContext() { }
		public void copyFrom(ApplyeffectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplyEffectContext extends ApplyeffectContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ApplyEffectContext(ApplyeffectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterApplyEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitApplyEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitApplyEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyeffectContext applyeffect() throws RecognitionException {
		ApplyeffectContext _localctx = new ApplyeffectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_applyeffect);
		try {
			_localctx = new ApplyEffectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(APPLY_K);
			setState(163);
			match(EFFECT_K);
			setState(164);
			match(STRING);
			setState(165);
			match(TO_K);
			setState(166);
			match(ID);
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

	public static class ReturnfunctionContext extends ParserRuleContext {
		public ReturnfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnfunction; }
	 
		public ReturnfunctionContext() { }
		public void copyFrom(ReturnfunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterizedFunctionContext extends ReturnfunctionContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public Param_argsContext param_args() {
			return getRuleContext(Param_argsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterizedFunctionContext(ReturnfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterParameterizedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitParameterizedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitParameterizedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalFunctionContext extends ReturnfunctionContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NormalFunctionContext(ReturnfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnfunctionContext returnfunction() throws RecognitionException {
		ReturnfunctionContext _localctx = new ReturnfunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnfunction);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NormalFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__0);
				setState(169);
				match(ID);
				setState(170);
				block();
				}
				break;
			case 2:
				_localctx = new ParameterizedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__0);
				setState(172);
				match(ID);
				setState(173);
				match(T__1);
				setState(174);
				param_args();
				setState(175);
				block();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(FUNC);
			setState(180);
			match(ID);
			setState(181);
			match(LPAREN);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(182);
				formal_args();
				}
			}

			setState(185);
			match(RPAREN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(186);
				match(COLON);
				setState(187);
				type();
				}
			}

			setState(190);
			block();
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

	public static class Formal_argsContext extends ParserRuleContext {
		public List<Formal_argContext> formal_arg() {
			return getRuleContexts(Formal_argContext.class);
		}
		public Formal_argContext formal_arg(int i) {
			return getRuleContext(Formal_argContext.class,i);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFormal_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFormal_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFormal_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argsContext formal_args() throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formal_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			formal_arg();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				formal_arg();
				}
				}
				setState(199);
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

	public static class Param_argsContext extends ParserRuleContext {
		public List<Param_argContext> param_arg() {
			return getRuleContexts(Param_argContext.class);
		}
		public Param_argContext param_arg(int i) {
			return getRuleContext(Param_argContext.class,i);
		}
		public Param_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterParam_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitParam_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitParam_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_argsContext param_args() throws RecognitionException {
		Param_argsContext _localctx = new Param_argsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			param_arg();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				param_arg();
				}
				}
				setState(207);
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

	public static class Annotation_argsContext extends ParserRuleContext {
		public List<Annotation_argContext> annotation_arg() {
			return getRuleContexts(Annotation_argContext.class);
		}
		public Annotation_argContext annotation_arg(int i) {
			return getRuleContext(Annotation_argContext.class,i);
		}
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public Annotation_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAnnotation_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAnnotation_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAnnotation_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_argsContext annotation_args() throws RecognitionException {
		Annotation_argsContext _localctx = new Annotation_argsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotation_args);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				annotation_arg();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					annotation_arg();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(STRING);
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

	public static class Formal_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Formal_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFormal_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFormal_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFormal_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argContext formal_arg() throws RecognitionException {
		Formal_argContext _localctx = new Formal_argContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(220);
			match(COLON);
			setState(221);
			type();
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

	public static class Param_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public Param_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterParam_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitParam_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitParam_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_argContext param_arg() throws RecognitionException {
		Param_argContext _localctx = new Param_argContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
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

	public static class Annotation_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Annotation_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAnnotation_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAnnotation_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAnnotation_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_argContext annotation_arg() throws RecognitionException {
		Annotation_argContext _localctx = new Annotation_argContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_annotation_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ID);
			setState(226);
			match(EQUAL);
			setState(227);
			expr(0);
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

	public static class CreatekeywordsContext extends ParserRuleContext {
		public CreatekeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createkeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterCreatekeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitCreatekeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitCreatekeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatekeywordsContext createkeywords() throws RecognitionException {
		CreatekeywordsContext _localctx = new CreatekeywordsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_createkeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << COMPOSITION_K) | (1L << TEXT_K) | (1L << SOLID_K) | (1L << FOLDER_K) | (1L << RECTANGLE_K))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeSpecContext extends TypeContext {
		public BooleanTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterBooleanTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitBooleanTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitBooleanTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeSpecContext extends TypeContext {
		public IntTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterIntTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitIntTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitIntTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeSpecContext extends TypeContext {
		public StringTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterStringTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitStringTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitStringTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorTypeSpecContext extends TypeContext {
		public VectorTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterVectorTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitVectorTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitVectorTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeSpecContext extends TypeContext {
		public FloatTypeSpecContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFloatTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFloatTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFloatTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				_localctx = new IntTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(TYPEINT);
				}
				break;
			case TYPEFLOAT:
				_localctx = new FloatTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(TYPEFLOAT);
				}
				break;
			case TYPESTRING:
				_localctx = new StringTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(TYPESTRING);
				}
				break;
			case TYPEBOOLEAN:
				_localctx = new BooleanTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(TYPEBOOLEAN);
				}
				break;
			case LBRACK:
				_localctx = new VectorTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(LBRACK);
				setState(236);
				match(RBRACK);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LBRACE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << LBRACK) | (1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPESTRING) | (1L << TYPEBOOLEAN))) != 0) || _la==ID) {
				{
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(240);
					statement();
					}
					break;
				case 2:
					{
					setState(241);
					vardef();
					}
					break;
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(RBRACE);
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

	public static class ModuleblockContext extends ParserRuleContext {
		public List<ModulestatementContext> modulestatement() {
			return getRuleContexts(ModulestatementContext.class);
		}
		public ModulestatementContext modulestatement(int i) {
			return getRuleContext(ModulestatementContext.class,i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public ModuleblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterModuleblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitModuleblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitModuleblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleblockContext moduleblock() throws RecognitionException {
		ModuleblockContext _localctx = new ModuleblockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_moduleblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LBRACE);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << LBRACK) | (1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPESTRING) | (1L << TYPEBOOLEAN))) != 0) || _la==ID) {
				{
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(250);
					modulestatement();
					}
					break;
				case 2:
					{
					setState(251);
					vardef();
					}
					break;
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RBRACE);
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

	public static class SetvalblockContext extends ParserRuleContext {
		public SetvalstatementContext setvalstatement() {
			return getRuleContext(SetvalstatementContext.class,0);
		}
		public SetvalblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvalblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetvalblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetvalblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetvalblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetvalblockContext setvalblock() throws RecognitionException {
		SetvalblockContext _localctx = new SetvalblockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_setvalblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LBRACE);
			setState(260);
			setvalstatement();
			setState(261);
			match(RBRACE);
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

	public static class MsgblockContext extends ParserRuleContext {
		public List<AllstatementContext> allstatement() {
			return getRuleContexts(AllstatementContext.class);
		}
		public AllstatementContext allstatement(int i) {
			return getRuleContext(AllstatementContext.class,i);
		}
		public MsgblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterMsgblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitMsgblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitMsgblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgblockContext msgblock() throws RecognitionException {
		MsgblockContext _localctx = new MsgblockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_msgblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LBRACE);
			setState(264);
			match(T__4);
			setState(265);
			match(COLON);
			setState(266);
			match(LBRACE);
			setState(267);
			allstatement();
			setState(268);
			match(RBRACE);
			setState(269);
			match(COMMA);
			setState(270);
			match(T__5);
			setState(271);
			match(COLON);
			setState(272);
			match(LBRACE);
			setState(273);
			allstatement();
			setState(274);
			match(RBRACE);
			setState(275);
			match(RBRACE);
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

	public static class ImportfileContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ImportfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterImportfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitImportfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitImportfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportfileContext importfile() throws RecognitionException {
		ImportfileContext _localctx = new ImportfileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(EQUAL);
			setState(279);
			match(IMPORT_K);
			setState(280);
			match(FILE_K);
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

	public static class AllstatementContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SetvaluesContext setvalues() {
			return getRuleContext(SetvaluesContext.class,0);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public MsgboxContext msgbox() {
			return getRuleContext(MsgboxContext.class,0);
		}
		public ImportfileContext importfile() {
			return getRuleContext(ImportfileContext.class,0);
		}
		public SetvalstatementContext setvalstatement() {
			return getRuleContext(SetvalstatementContext.class,0);
		}
		public AllstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAllstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAllstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAllstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllstatementContext allstatement() throws RecognitionException {
		AllstatementContext _localctx = new AllstatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_allstatement);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				create();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				add();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				setvalues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				open();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				move();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				msgbox();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				importfile();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				setvalstatement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementAssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElementAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterElementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitElementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitElementAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnInStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public MultivariableContext multivariable() {
			return getRuleContext(MultivariableContext.class,0);
		}
		public ReturnInStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterReturnInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitReturnInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitReturnInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleAssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSimpleAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSimpleAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSimpleAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAssignContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AffectScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AffectScriptParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterTypeAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitTypeAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitTypeAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAssignFornewInstanceContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(AffectScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AffectScriptParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeAssignFornewInstanceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterTypeAssignFornewInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitTypeAssignFornewInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitTypeAssignFornewInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementAssignForParamsContext extends StatementContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultivariableContext multivariable() {
			return getRuleContext(MultivariableContext.class,0);
		}
		public ElementAssignForParamsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterElementAssignForParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitElementAssignForParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitElementAssignForParams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatementContext extends StatementContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public CallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(IF);
				setState(295);
				match(LPAREN);
				setState(296);
				expr(0);
				setState(297);
				match(RPAREN);
				setState(298);
				statement();
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(299);
					match(ELSE);
					setState(300);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(WHILE);
				setState(304);
				match(LPAREN);
				setState(305);
				expr(0);
				setState(306);
				match(RPAREN);
				setState(307);
				statement();
				}
				break;
			case 3:
				_localctx = new SimpleAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(ID);
				setState(310);
				match(EQUAL);
				setState(311);
				expr(0);
				}
				break;
			case 4:
				_localctx = new TypeAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				type();
				setState(313);
				match(ID);
				setState(314);
				match(EQUAL);
				setState(315);
				expr(0);
				}
				break;
			case 5:
				_localctx = new TypeAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				match(ID);
				setState(318);
				match(ID);
				setState(319);
				match(EQUAL);
				setState(320);
				expr(0);
				}
				break;
			case 6:
				_localctx = new TypeAssignFornewInstanceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(ID);
				setState(322);
				match(ID);
				setState(323);
				match(EQUAL);
				setState(324);
				match(NEW_K);
				setState(325);
				expr(0);
				}
				break;
			case 7:
				_localctx = new ElementAssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				match(ID);
				setState(327);
				match(LBRACK);
				setState(328);
				expr(0);
				setState(329);
				match(RBRACK);
				setState(330);
				match(EQUAL);
				setState(331);
				expr(0);
				}
				break;
			case 8:
				_localctx = new ElementAssignForParamsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				match(ID);
				setState(334);
				match(EQUAL);
				setState(335);
				expr(0);
				setState(336);
				multivariable();
				}
				break;
			case 9:
				_localctx = new CallStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				call_expr();
				}
				break;
			case 10:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				match(T__6);
				setState(340);
				match(LPAREN);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (LPAREN - 37)) | (1L << (LBRACK - 37)) | (1L << (TRUE - 37)) | (1L << (FALSE - 37)) | (1L << (SUB - 37)) | (1L << (BANG - 37)) | (1L << (ID - 37)) | (1L << (INT - 37)) | (1L << (FLOAT - 37)) | (1L << (STRING - 37)))) != 0)) {
					{
					setState(341);
					expr(0);
					}
				}

				setState(344);
				match(RPAREN);
				}
				break;
			case 11:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(345);
				match(T__7);
				setState(346);
				expr(0);
				}
				break;
			case 12:
				_localctx = new ReturnInStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(347);
				match(T__7);
				setState(348);
				match(ID);
				setState(349);
				multivariable();
				}
				break;
			case 13:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(350);
				block();
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

	public static class SetvalstatementContext extends ParserRuleContext {
		public List<SetvalexprContext> setvalexpr() {
			return getRuleContexts(SetvalexprContext.class);
		}
		public SetvalexprContext setvalexpr(int i) {
			return getRuleContext(SetvalexprContext.class,i);
		}
		public SetvalstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvalstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetvalstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetvalstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetvalstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetvalstatementContext setvalstatement() throws RecognitionException {
		SetvalstatementContext _localctx = new SetvalstatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setvalstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			setvalexpr();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354);
				match(COMMA);
				setState(355);
				setvalexpr();
				}
				}
				setState(360);
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

	public static class SetvalexprContext extends ParserRuleContext {
		public SetvalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvalexpr; }
	 
		public SetvalexprContext() { }
		public void copyFrom(SetvalexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetValueStatementByIDContext extends SetvalexprContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public SetexprContext setexpr() {
			return getRuleContext(SetexprContext.class,0);
		}
		public SetValueStatementByIDContext(SetvalexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetValueStatementByID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetValueStatementByID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetValueStatementByID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetValueStatementByKeyContext extends SetvalexprContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public SetexprContext setexpr() {
			return getRuleContext(SetexprContext.class,0);
		}
		public SetValueStatementByKeyContext(SetvalexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetValueStatementByKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetValueStatementByKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetValueStatementByKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetvalexprContext setvalexpr() throws RecognitionException {
		SetvalexprContext _localctx = new SetvalexprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setvalexpr);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new SetValueStatementByIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(ID);
				setState(362);
				match(COLON);
				setState(363);
				setexpr();
				}
				break;
			case STRING:
				_localctx = new SetValueStatementByKeyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(STRING);
				setState(365);
				match(COLON);
				setState(366);
				setexpr();
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

	public static class MultivariableContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultivariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multivariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterMultivariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitMultivariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitMultivariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultivariableContext multivariable() throws RecognitionException {
		MultivariableContext _localctx = new MultivariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multivariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(369);
				match(T__8);
				setState(370);
				expr(0);
				}
				}
				setState(375);
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

	public static class ModulestatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnfunctionContext returnfunction() {
			return getRuleContext(ReturnfunctionContext.class,0);
		}
		public ModulestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterModulestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitModulestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitModulestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModulestatementContext modulestatement() throws RecognitionException {
		ModulestatementContext _localctx = new ModulestatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_modulestatement);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case LBRACK:
			case LBRACE:
			case IF:
			case WHILE:
			case TYPEINT:
			case TYPEFLOAT:
			case TYPESTRING:
			case TYPEBOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				returnfunction();
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ID);
			setState(381);
			match(EQUAL);
			setState(382);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AtomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(385);
				match(SUB);
				setState(386);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				match(BANG);
				setState(388);
				expr(5);
				}
				break;
			case 3:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				call_expr();
				}
				break;
			case 4:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				match(ID);
				setState(391);
				match(LBRACK);
				setState(392);
				expr(0);
				setState(393);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				match(LPAREN);
				setState(396);
				expr(0);
				setState(397);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(402);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(403);
					operator();
					setState(404);
					expr(8);
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class SetexprContext extends ParserRuleContext {
		public SetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexpr; }
	 
		public SetexprContext() { }
		public void copyFrom(SetexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetParameterInValueContext extends SetexprContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public List<SetexprContext> setexpr() {
			return getRuleContexts(SetexprContext.class);
		}
		public SetexprContext setexpr(int i) {
			return getRuleContext(SetexprContext.class,i);
		}
		public SetParameterInValueContext(SetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameterInValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameterInValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameterInValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetParameterINTContext extends SetexprContext {
		public TerminalNode INT() { return getToken(AffectScriptParser.INT, 0); }
		public SetParameterINTContext(SetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameterINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameterINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameterINT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetParameterStringContext extends SetexprContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public SetParameterStringContext(SetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameterString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameterString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetParameterMultipleNumContext extends SetexprContext {
		public List<TerminalNode> INT() { return getTokens(AffectScriptParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AffectScriptParser.INT, i);
		}
		public SetParameterMultipleNumContext(SetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameterMultipleNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameterMultipleNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameterMultipleNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetParameterRGBContext extends SetexprContext {
		public List<TerminalNode> INT() { return getTokens(AffectScriptParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AffectScriptParser.INT, i);
		}
		public SetParameterRGBContext(SetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterSetParameterRGB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitSetParameterRGB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitSetParameterRGB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetexprContext setexpr() throws RecognitionException {
		SetexprContext _localctx = new SetexprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setexpr);
		try {
			int _alt;
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SetParameterINTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(INT);
				}
				break;
			case 2:
				_localctx = new SetParameterMultipleNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(LBRACK);
				setState(413);
				match(INT);
				setState(414);
				match(COMMA);
				setState(415);
				match(INT);
				setState(416);
				match(COMMA);
				setState(417);
				match(INT);
				setState(418);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new SetParameterMultipleNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(LBRACK);
				setState(420);
				match(INT);
				setState(421);
				match(COMMA);
				setState(422);
				match(INT);
				setState(423);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new SetParameterRGBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(T__9);
				setState(425);
				match(LBRACK);
				setState(426);
				match(INT);
				setState(427);
				match(COMMA);
				setState(428);
				match(INT);
				setState(429);
				match(COMMA);
				setState(430);
				match(INT);
				setState(431);
				match(RBRACK);
				}
				break;
			case 5:
				_localctx = new SetParameterStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new SetParameterInValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				match(ID);
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						match(T__10);
						setState(435);
						setexpr();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(AffectScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AffectScriptParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(AffectScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AffectScriptParser.SUB, 0); }
		public TerminalNode GT() { return getToken(AffectScriptParser.GT, 0); }
		public TerminalNode GE() { return getToken(AffectScriptParser.GE, 0); }
		public TerminalNode LT() { return getToken(AffectScriptParser.LT, 0); }
		public TerminalNode LE() { return getToken(AffectScriptParser.LE, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(AffectScriptParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AffectScriptParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(AffectScriptParser.OR, 0); }
		public TerminalNode AND() { return getToken(AffectScriptParser.AND, 0); }
		public TerminalNode DOT() { return getToken(AffectScriptParser.DOT, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (SUB - 59)) | (1L << (MUL - 59)) | (1L << (DIV - 59)) | (1L << (ADD - 59)) | (1L << (LT - 59)) | (1L << (LE - 59)) | (1L << (EQUAL_EQUAL - 59)) | (1L << (NOT_EQUAL - 59)) | (1L << (GT - 59)) | (1L << (GE - 59)) | (1L << (OR - 59)) | (1L << (AND - 59)) | (1L << (DOT - 59)))) != 0)) ) {
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

	public static class Call_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitCall_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ID);
			setState(446);
			match(LPAREN);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (LPAREN - 37)) | (1L << (LBRACK - 37)) | (1L << (TRUE - 37)) | (1L << (FALSE - 37)) | (1L << (SUB - 37)) | (1L << (BANG - 37)) | (1L << (ID - 37)) | (1L << (INT - 37)) | (1L << (FLOAT - 37)) | (1L << (STRING - 37)))) != 0)) {
				{
				setState(447);
				expr_list();
				}
			}

			setState(450);
			match(RPAREN);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expr(0);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				expr(0);
				}
				}
				setState(459);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends PrimaryContext {
		public TerminalNode INT() { return getToken(AffectScriptParser.INT, 0); }
		public IntegerContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends PrimaryContext {
		public TerminalNode FLOAT() { return getToken(AffectScriptParser.FLOAT, 0); }
		public FloatContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends PrimaryContext {
		public TrueLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceDefinitionContext extends PrimaryContext {
		public TerminalNode ID() { return getToken(AffectScriptParser.ID, 0); }
		public ReferenceDefinitionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterReferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitReferenceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitReferenceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends PrimaryContext {
		public TerminalNode STRING() { return getToken(AffectScriptParser.STRING, 0); }
		public StringContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorContext extends PrimaryContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public VectorContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends PrimaryContext {
		public FalseLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffectScriptListener ) ((AffectScriptListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffectScriptVisitor ) return ((AffectScriptVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ReferenceDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(STRING);
				}
				break;
			case LBRACK:
				_localctx = new VectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				match(LBRACK);
				setState(465);
				expr_list();
				setState(466);
				match(RBRACK);
				}
				break;
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				match(FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2c\n\2\r\2\16\2d\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b4"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\20\3\20\3\20\5\20\u00bf\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\7\21\u00c6\n\21\f\21\16\21\u00c9\13\21\3"+
		"\22\3\22\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\23\3\23\3\23\7"+
		"\23\u00d6\n\23\f\23\16\23\u00d9\13\23\3\23\5\23\u00dc\n\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u00f0\n\30\3\31\3\31\3\31\7\31\u00f5\n\31\f\31\16\31\u00f8"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u00ff\n\32\f\32\16\32\u0102\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0127\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0130\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0159\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0162\n\37\3 \3 \3 \7 \u0167\n \f \16 \u016a\13 \3!\3!\3!\3!\3!\3!\5"+
		"!\u0172\n!\3\"\3\"\7\"\u0176\n\"\f\"\16\"\u0179\13\"\3#\3#\5#\u017d\n"+
		"#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0193"+
		"\n%\3%\3%\3%\3%\7%\u0199\n%\f%\16%\u019c\13%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01b7\n&\f&\16&\u01ba"+
		"\13&\5&\u01bc\n&\3\'\3\'\3(\3(\3(\5(\u01c3\n(\3(\3(\3)\3)\3)\7)\u01ca"+
		"\n)\f)\16)\u01cd\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01d9\n*\3*\2\3"+
		"H+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPR\2\4\b\2\5\6\21\21\25\25\34\34!!%%\4\2==?J\2\u01fe\2b\3\2\2\2\4"+
		"h\3\2\2\2\6l\3\2\2\2\bq\3\2\2\2\nv\3\2\2\2\f|\3\2\2\2\16\u0085\3\2\2\2"+
		"\20\u008a\3\2\2\2\22\u008e\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30"+
		"\u00a0\3\2\2\2\32\u00a4\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2 \u00c2"+
		"\3\2\2\2\"\u00ca\3\2\2\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00e1\3\2\2\2"+
		"*\u00e3\3\2\2\2,\u00e7\3\2\2\2.\u00ef\3\2\2\2\60\u00f1\3\2\2\2\62\u00fb"+
		"\3\2\2\2\64\u0105\3\2\2\2\66\u0109\3\2\2\28\u0117\3\2\2\2:\u0126\3\2\2"+
		"\2<\u0161\3\2\2\2>\u0163\3\2\2\2@\u0171\3\2\2\2B\u0177\3\2\2\2D\u017c"+
		"\3\2\2\2F\u017e\3\2\2\2H\u0192\3\2\2\2J\u01bb\3\2\2\2L\u01bd\3\2\2\2N"+
		"\u01bf\3\2\2\2P\u01c6\3\2\2\2R\u01d8\3\2\2\2Tc\5\4\3\2Uc\5\6\4\2Vc\5\b"+
		"\5\2Wc\5\n\6\2Xc\5\f\7\2Yc\5\16\b\2Zc\5\20\t\2[c\5\22\n\2\\c\5\24\13\2"+
		"]c\5\26\f\2^c\5\32\16\2_c\58\35\2`c\5\36\20\2ac\5\30\r\2bT\3\2\2\2bU\3"+
		"\2\2\2bV\3\2\2\2bW\3\2\2\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\"+
		"\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hi\7\16\2\2ij\7\17\2"+
		"\2jk\7M\2\2k\5\3\2\2\2lm\7N\2\2mn\7\'\2\2no\5$\23\2op\7(\2\2p\7\3\2\2"+
		"\2qr\7M\2\2rs\7\63\2\2st\7\20\2\2tu\5,\27\2u\t\3\2\2\2vw\7\22\2\2wx\7"+
		"M\2\2xy\5J&\2yz\7\23\2\2z{\7M\2\2{\13\3\2\2\2|}\7\22\2\2}~\7\37\2\2~\177"+
		"\7Q\2\2\177\u0080\7\23\2\2\u0080\u0081\7M\2\2\u0081\u0082\7-\2\2\u0082"+
		"\u0083\5:\36\2\u0083\u0084\7.\2\2\u0084\r\3\2\2\2\u0085\u0086\7\24\2\2"+
		"\u0086\u0087\7M\2\2\u0087\u0088\7\23\2\2\u0088\u0089\7M\2\2\u0089\17\3"+
		"\2\2\2\u008a\u008b\7&\2\2\u008b\u008c\7M\2\2\u008c\u008d\5\64\33\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7M\2\2\u0090\23\3\2\2\2\u0091"+
		"\u0092\7\27\2\2\u0092\u0093\7\30\2\2\u0093\u009a\7Q\2\2\u0094\u0095\7"+
		"\27\2\2\u0095\u0096\7\30\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7\33\2\2\u0098"+
		"\u009a\5\66\34\2\u0099\u0091\3\2\2\2\u0099\u0094\3\2\2\2\u009a\25\3\2"+
		"\2\2\u009b\u009c\7#\2\2\u009c\u009d\7M\2\2\u009d\u009e\7\23\2\2\u009e"+
		"\u009f\7M\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7M\2\2\u00a1\u00a2\7\63\2\2"+
		"\u00a2\u00a3\7$\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6"+
		"\7\36\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\7M\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\7M\2\2\u00ac\u00b4\5\60\31"+
		"\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\7M\2\2\u00af\u00b0\7\4\2\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b2\5\60\31\2\u00b2\u00b4\3\2\2\2\u00b3\u00aa\3\2\2"+
		"\2\u00b3\u00ad\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\66\2\2\u00b6\u00b7"+
		"\7M\2\2\u00b7\u00b9\7\'\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\7(\2\2\u00bc\u00bd\7)\2"+
		"\2\u00bd\u00bf\5.\30\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\5\60\31\2\u00c1\37\3\2\2\2\u00c2\u00c7\5&\24\2\u00c3"+
		"\u00c4\7*\2\2\u00c4\u00c6\5&\24\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8!\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cf\5(\25\2\u00cb\u00cc\7*\2\2\u00cc\u00ce\5(\25\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0#\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\5*\26\2\u00d3\u00d4"+
		"\7*\2\2\u00d4\u00d6\5*\26\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dc\7Q\2\2\u00db\u00d2\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"%\3\2\2\2\u00dd\u00de\7M\2\2\u00de\u00df\7)\2\2\u00df\u00e0\5.\30\2\u00e0"+
		"\'\3\2\2\2\u00e1\u00e2\7M\2\2\u00e2)\3\2\2\2\u00e3\u00e4\7M\2\2\u00e4"+
		"\u00e5\7\63\2\2\u00e5\u00e6\5H%\2\u00e6+\3\2\2\2\u00e7\u00e8\t\2\2\2\u00e8"+
		"-\3\2\2\2\u00e9\u00f0\7\67\2\2\u00ea\u00f0\78\2\2\u00eb\u00f0\79\2\2\u00ec"+
		"\u00f0\7:\2\2\u00ed\u00ee\7+\2\2\u00ee\u00f0\7,\2\2\u00ef\u00e9\3\2\2"+
		"\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0/\3\2\2\2\u00f1\u00f6\7-\2\2\u00f2\u00f5\5<\37\2\u00f3\u00f5"+
		"\5F$\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\7.\2\2\u00fa\61\3\2\2\2\u00fb\u0100\7-\2\2\u00fc\u00ff"+
		"\5D#\2\u00fd\u00ff\5F$\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7.\2\2\u0104\63\3\2\2\2\u0105\u0106"+
		"\7-\2\2\u0106\u0107\5> \2\u0107\u0108\7.\2\2\u0108\65\3\2\2\2\u0109\u010a"+
		"\7-\2\2\u010a\u010b\7\7\2\2\u010b\u010c\7)\2\2\u010c\u010d\7-\2\2\u010d"+
		"\u010e\5:\36\2\u010e\u010f\7.\2\2\u010f\u0110\7*\2\2\u0110\u0111\7\b\2"+
		"\2\u0111\u0112\7)\2\2\u0112\u0113\7-\2\2\u0113\u0114\5:\36\2\u0114\u0115"+
		"\7.\2\2\u0115\u0116\7.\2\2\u0116\67\3\2\2\2\u0117\u0118\7M\2\2\u0118\u0119"+
		"\7\63\2\2\u0119\u011a\7\31\2\2\u011a\u011b\7\32\2\2\u011b9\3\2\2\2\u011c"+
		"\u0127\5\6\4\2\u011d\u0127\5\b\5\2\u011e\u0127\5\n\6\2\u011f\u0127\5\16"+
		"\b\2\u0120\u0127\5\20\t\2\u0121\u0127\5\22\n\2\u0122\u0127\5\26\f\2\u0123"+
		"\u0127\5\24\13\2\u0124\u0127\58\35\2\u0125\u0127\5> \2\u0126\u011c\3\2"+
		"\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0126"+
		"\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127;\3\2\2\2\u0128\u0129"+
		"\7/\2\2\u0129\u012a\7\'\2\2\u012a\u012b\5H%\2\u012b\u012c\7(\2\2\u012c"+
		"\u012f\5<\37\2\u012d\u012e\7\60\2\2\u012e\u0130\5<\37\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0162\3\2\2\2\u0131\u0132\7\61\2\2\u0132"+
		"\u0133\7\'\2\2\u0133\u0134\5H%\2\u0134\u0135\7(\2\2\u0135\u0136\5<\37"+
		"\2\u0136\u0162\3\2\2\2\u0137\u0138\7M\2\2\u0138\u0139\7\63\2\2\u0139\u0162"+
		"\5H%\2\u013a\u013b\5.\30\2\u013b\u013c\7M\2\2\u013c\u013d\7\63\2\2\u013d"+
		"\u013e\5H%\2\u013e\u0162\3\2\2\2\u013f\u0140\7M\2\2\u0140\u0141\7M\2\2"+
		"\u0141\u0142\7\63\2\2\u0142\u0162\5H%\2\u0143\u0144\7M\2\2\u0144\u0145"+
		"\7M\2\2\u0145\u0146\7\63\2\2\u0146\u0147\7 \2\2\u0147\u0162\5H%\2\u0148"+
		"\u0149\7M\2\2\u0149\u014a\7+\2\2\u014a\u014b\5H%\2\u014b\u014c\7,\2\2"+
		"\u014c\u014d\7\63\2\2\u014d\u014e\5H%\2\u014e\u0162\3\2\2\2\u014f\u0150"+
		"\7M\2\2\u0150\u0151\7\63\2\2\u0151\u0152\5H%\2\u0152\u0153\5B\"\2\u0153"+
		"\u0162\3\2\2\2\u0154\u0162\5N(\2\u0155\u0156\7\t\2\2\u0156\u0158\7\'\2"+
		"\2\u0157\u0159\5H%\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u0162\7(\2\2\u015b\u015c\7\n\2\2\u015c\u0162\5H%\2\u015d"+
		"\u015e\7\n\2\2\u015e\u015f\7M\2\2\u015f\u0162\5B\"\2\u0160\u0162\5\60"+
		"\31\2\u0161\u0128\3\2\2\2\u0161\u0131\3\2\2\2\u0161\u0137\3\2\2\2\u0161"+
		"\u013a\3\2\2\2\u0161\u013f\3\2\2\2\u0161\u0143\3\2\2\2\u0161\u0148\3\2"+
		"\2\2\u0161\u014f\3\2\2\2\u0161\u0154\3\2\2\2\u0161\u0155\3\2\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u0160\3\2\2\2\u0162=\3\2\2\2"+
		"\u0163\u0168\5@!\2\u0164\u0165\7*\2\2\u0165\u0167\5@!\2\u0166\u0164\3"+
		"\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"?\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7M\2\2\u016c\u016d\7)\2\2\u016d"+
		"\u0172\5J&\2\u016e\u016f\7Q\2\2\u016f\u0170\7)\2\2\u0170\u0172\5J&\2\u0171"+
		"\u016b\3\2\2\2\u0171\u016e\3\2\2\2\u0172A\3\2\2\2\u0173\u0174\7\13\2\2"+
		"\u0174\u0176\5H%\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178C\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017d\5<\37\2\u017b\u017d\5\34\17\2\u017c\u017a\3\2\2\2\u017c\u017b\3"+
		"\2\2\2\u017dE\3\2\2\2\u017e\u017f\7M\2\2\u017f\u0180\7\63\2\2\u0180\u0181"+
		"\5H%\2\u0181G\3\2\2\2\u0182\u0183\b%\1\2\u0183\u0184\7=\2\2\u0184\u0193"+
		"\5H%\b\u0185\u0186\7>\2\2\u0186\u0193\5H%\7\u0187\u0193\5N(\2\u0188\u0189"+
		"\7M\2\2\u0189\u018a\7+\2\2\u018a\u018b\5H%\2\u018b\u018c\7,\2\2\u018c"+
		"\u0193\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u018f\5H%\2\u018f\u0190\7(\2"+
		"\2\u0190\u0193\3\2\2\2\u0191\u0193\5R*\2\u0192\u0182\3\2\2\2\u0192\u0185"+
		"\3\2\2\2\u0192\u0187\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u018d\3\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u019a\3\2\2\2\u0194\u0195\f\t\2\2\u0195\u0196\5L"+
		"\'\2\u0196\u0197\5H%\n\u0197\u0199\3\2\2\2\u0198\u0194\3\2\2\2\u0199\u019c"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019bI\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u01bc\7O\2\2\u019e\u019f\7+\2\2\u019f\u01a0\7O\2"+
		"\2\u01a0\u01a1\7*\2\2\u01a1\u01a2\7O\2\2\u01a2\u01a3\7*\2\2\u01a3\u01a4"+
		"\7O\2\2\u01a4\u01bc\7,\2\2\u01a5\u01a6\7+\2\2\u01a6\u01a7\7O\2\2\u01a7"+
		"\u01a8\7*\2\2\u01a8\u01a9\7O\2\2\u01a9\u01bc\7,\2\2\u01aa\u01ab\7\f\2"+
		"\2\u01ab\u01ac\7+\2\2\u01ac\u01ad\7O\2\2\u01ad\u01ae\7*\2\2\u01ae\u01af"+
		"\7O\2\2\u01af\u01b0\7*\2\2\u01b0\u01b1\7O\2\2\u01b1\u01bc\7,\2\2\u01b2"+
		"\u01bc\7Q\2\2\u01b3\u01b8\7M\2\2\u01b4\u01b5\7\r\2\2\u01b5\u01b7\5J&\2"+
		"\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u019d\3\2\2\2\u01bb"+
		"\u019e\3\2\2\2\u01bb\u01a5\3\2\2\2\u01bb\u01aa\3\2\2\2\u01bb\u01b2\3\2"+
		"\2\2\u01bb\u01b3\3\2\2\2\u01bcK\3\2\2\2\u01bd\u01be\t\3\2\2\u01beM\3\2"+
		"\2\2\u01bf\u01c0\7M\2\2\u01c0\u01c2\7\'\2\2\u01c1\u01c3\5P)\2\u01c2\u01c1"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\7(\2\2\u01c5"+
		"O\3\2\2\2\u01c6\u01cb\5H%\2\u01c7\u01c8\7*\2\2\u01c8\u01ca\5H%\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01ccQ\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d9\7M\2\2\u01cf\u01d9"+
		"\7O\2\2\u01d0\u01d9\7P\2\2\u01d1\u01d9\7Q\2\2\u01d2\u01d3\7+\2\2\u01d3"+
		"\u01d4\5P)\2\u01d4\u01d5\7,\2\2\u01d5\u01d9\3\2\2\2\u01d6\u01d9\7;\2\2"+
		"\u01d7\u01d9\7<\2\2\u01d8\u01ce\3\2\2\2\u01d8\u01cf\3\2\2\2\u01d8\u01d0"+
		"\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9S\3\2\2\2 bd\u0099\u00b3\u00b9\u00be\u00c7\u00cf\u00d7"+
		"\u00db\u00ef\u00f4\u00f6\u00fe\u0100\u0126\u012f\u0158\u0161\u0168\u0171"+
		"\u0177\u017c\u0192\u019a\u01b8\u01bb\u01c2\u01cb\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}