// Generated from /Users/owly/Desktop/2. PieceWorks/2. Java/JsonPath4JsonStore/src/main/antlr/JsonPath.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, JSON_STRING=12, NATRUAL_INTEGER=13, IDENTIFIER=14, 
		WILDCARD=15, DIGIT=16, POSITIVEDIGIT=17, LETTER=18, WS=19;
	public static final int
		RULE_jsonBasicPathExpr = 0, RULE_jsonAbsolutePathExpr = 1, RULE_jsonRelativePathExpr = 2, 
		RULE_jsonSteps = 3, RULE_jsonStep = 4, RULE_jsonFilterExpr = 5, RULE_jsonCond = 6, 
		RULE_jsonExistsCond = 7, RULE_jsonObjectStep = 8, RULE_jsonObjectWildcardStep = 9, 
		RULE_jsonObjectFieldNameStep = 10, RULE_jsonDescendentStep = 11, RULE_jsonFieldName = 12, 
		RULE_jsonArrayStep = 13, RULE_jsonArrayWildcardStep = 14, RULE_jsonArraySelectionsStep = 15, 
		RULE_jsonArraySelection = 16, RULE_jsonArrayIndex = 17, RULE_jsonArraySlice = 18;
	public static final String[] ruleNames = {
		"jsonBasicPathExpr", "jsonAbsolutePathExpr", "jsonRelativePathExpr", "jsonSteps", 
		"jsonStep", "jsonFilterExpr", "jsonCond", "jsonExistsCond", "jsonObjectStep", 
		"jsonObjectWildcardStep", "jsonObjectFieldNameStep", "jsonDescendentStep", 
		"jsonFieldName", "jsonArrayStep", "jsonArrayWildcardStep", "jsonArraySelectionsStep", 
		"jsonArraySelection", "jsonArrayIndex", "jsonArraySlice"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'@'", "'[?('", "')]'", "'&&'", "'.'", "'..'", "'['", "']'", 
		"','", "':'", null, null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"JSON_STRING", "NATRUAL_INTEGER", "IDENTIFIER", "WILDCARD", "DIGIT", "POSITIVEDIGIT", 
		"LETTER", "WS"
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
	public String getGrammarFileName() { return "JsonPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonBasicPathExprContext extends ParserRuleContext {
		public JsonAbsolutePathExprContext jsonAbsolutePathExpr() {
			return getRuleContext(JsonAbsolutePathExprContext.class,0);
		}
		public JsonRelativePathExprContext jsonRelativePathExpr() {
			return getRuleContext(JsonRelativePathExprContext.class,0);
		}
		public JsonBasicPathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonBasicPathExpr; }
	}

	public final JsonBasicPathExprContext jsonBasicPathExpr() throws RecognitionException {
		JsonBasicPathExprContext _localctx = new JsonBasicPathExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsonBasicPathExpr);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				jsonAbsolutePathExpr();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				jsonRelativePathExpr();
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

	public static class JsonAbsolutePathExprContext extends ParserRuleContext {
		public JsonStepsContext jsonSteps() {
			return getRuleContext(JsonStepsContext.class,0);
		}
		public JsonAbsolutePathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonAbsolutePathExpr; }
	}

	public final JsonAbsolutePathExprContext jsonAbsolutePathExpr() throws RecognitionException {
		JsonAbsolutePathExprContext _localctx = new JsonAbsolutePathExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jsonAbsolutePathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			jsonSteps();
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

	public static class JsonRelativePathExprContext extends ParserRuleContext {
		public JsonStepsContext jsonSteps() {
			return getRuleContext(JsonStepsContext.class,0);
		}
		public JsonRelativePathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonRelativePathExpr; }
	}

	public final JsonRelativePathExprContext jsonRelativePathExpr() throws RecognitionException {
		JsonRelativePathExprContext _localctx = new JsonRelativePathExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonRelativePathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			jsonSteps();
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

	public static class JsonStepsContext extends ParserRuleContext {
		public List<JsonStepContext> jsonStep() {
			return getRuleContexts(JsonStepContext.class);
		}
		public JsonStepContext jsonStep(int i) {
			return getRuleContext(JsonStepContext.class,i);
		}
		public JsonStepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonSteps; }
	}

	public final JsonStepsContext jsonSteps() throws RecognitionException {
		JsonStepsContext _localctx = new JsonStepsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jsonSteps);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					jsonStep();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class JsonStepContext extends ParserRuleContext {
		public JsonFilterExprContext jsonFilterExpr() {
			return getRuleContext(JsonFilterExprContext.class,0);
		}
		public JsonObjectStepContext jsonObjectStep() {
			return getRuleContext(JsonObjectStepContext.class,0);
		}
		public JsonArrayStepContext jsonArrayStep() {
			return getRuleContext(JsonArrayStepContext.class,0);
		}
		public JsonDescendentStepContext jsonDescendentStep() {
			return getRuleContext(JsonDescendentStepContext.class,0);
		}
		public JsonStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonStep; }
	}

	public final JsonStepContext jsonStep() throws RecognitionException {
		JsonStepContext _localctx = new JsonStepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jsonStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(54);
				jsonObjectStep();
				}
				break;
			case T__7:
				{
				setState(55);
				jsonArrayStep();
				}
				break;
			case T__6:
				{
				setState(56);
				jsonDescendentStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(59);
			jsonFilterExpr();
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

	public static class JsonFilterExprContext extends ParserRuleContext {
		public JsonCondContext jsonCond() {
			return getRuleContext(JsonCondContext.class,0);
		}
		public JsonFilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonFilterExpr; }
	}

	public final JsonFilterExprContext jsonFilterExpr() throws RecognitionException {
		JsonFilterExprContext _localctx = new JsonFilterExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jsonFilterExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__2);
			setState(62);
			jsonCond(0);
			setState(63);
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

	public static class JsonCondContext extends ParserRuleContext {
		public JsonExistsCondContext jsonExistsCond() {
			return getRuleContext(JsonExistsCondContext.class,0);
		}
		public List<JsonCondContext> jsonCond() {
			return getRuleContexts(JsonCondContext.class);
		}
		public JsonCondContext jsonCond(int i) {
			return getRuleContext(JsonCondContext.class,i);
		}
		public JsonCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonCond; }
	}

	public final JsonCondContext jsonCond() throws RecognitionException {
		return jsonCond(0);
	}

	private JsonCondContext jsonCond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JsonCondContext _localctx = new JsonCondContext(_ctx, _parentState);
		JsonCondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_jsonCond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66);
			jsonExistsCond();
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JsonCondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_jsonCond);
					setState(68);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(69);
					match(T__4);
					setState(70);
					jsonCond(2);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class JsonExistsCondContext extends ParserRuleContext {
		public JsonRelativePathExprContext jsonRelativePathExpr() {
			return getRuleContext(JsonRelativePathExprContext.class,0);
		}
		public JsonExistsCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonExistsCond; }
	}

	public final JsonExistsCondContext jsonExistsCond() throws RecognitionException {
		JsonExistsCondContext _localctx = new JsonExistsCondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jsonExistsCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			jsonRelativePathExpr();
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

	public static class JsonObjectStepContext extends ParserRuleContext {
		public JsonObjectWildcardStepContext jsonObjectWildcardStep() {
			return getRuleContext(JsonObjectWildcardStepContext.class,0);
		}
		public JsonObjectFieldNameStepContext jsonObjectFieldNameStep() {
			return getRuleContext(JsonObjectFieldNameStepContext.class,0);
		}
		public JsonObjectStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObjectStep; }
	}

	public final JsonObjectStepContext jsonObjectStep() throws RecognitionException {
		JsonObjectStepContext _localctx = new JsonObjectStepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jsonObjectStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WILDCARD:
				{
				setState(79);
				jsonObjectWildcardStep();
				}
				break;
			case IDENTIFIER:
				{
				setState(80);
				jsonObjectFieldNameStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class JsonObjectWildcardStepContext extends ParserRuleContext {
		public TerminalNode WILDCARD() { return getToken(JsonPathParser.WILDCARD, 0); }
		public JsonObjectWildcardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObjectWildcardStep; }
	}

	public final JsonObjectWildcardStepContext jsonObjectWildcardStep() throws RecognitionException {
		JsonObjectWildcardStepContext _localctx = new JsonObjectWildcardStepContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jsonObjectWildcardStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WILDCARD);
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

	public static class JsonObjectFieldNameStepContext extends ParserRuleContext {
		public JsonFieldNameContext jsonFieldName() {
			return getRuleContext(JsonFieldNameContext.class,0);
		}
		public JsonObjectFieldNameStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObjectFieldNameStep; }
	}

	public final JsonObjectFieldNameStepContext jsonObjectFieldNameStep() throws RecognitionException {
		JsonObjectFieldNameStepContext _localctx = new JsonObjectFieldNameStepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jsonObjectFieldNameStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			jsonFieldName();
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

	public static class JsonDescendentStepContext extends ParserRuleContext {
		public JsonFieldNameContext jsonFieldName() {
			return getRuleContext(JsonFieldNameContext.class,0);
		}
		public JsonDescendentStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonDescendentStep; }
	}

	public final JsonDescendentStepContext jsonDescendentStep() throws RecognitionException {
		JsonDescendentStepContext _localctx = new JsonDescendentStepContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jsonDescendentStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__6);
			setState(88);
			jsonFieldName();
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

	public static class JsonFieldNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonPathParser.IDENTIFIER, 0); }
		public JsonFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonFieldName; }
	}

	public final JsonFieldNameContext jsonFieldName() throws RecognitionException {
		JsonFieldNameContext _localctx = new JsonFieldNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jsonFieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
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

	public static class JsonArrayStepContext extends ParserRuleContext {
		public JsonArrayWildcardStepContext jsonArrayWildcardStep() {
			return getRuleContext(JsonArrayWildcardStepContext.class,0);
		}
		public JsonArraySelectionsStepContext jsonArraySelectionsStep() {
			return getRuleContext(JsonArraySelectionsStepContext.class,0);
		}
		public JsonArrayStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArrayStep; }
	}

	public final JsonArrayStepContext jsonArrayStep() throws RecognitionException {
		JsonArrayStepContext _localctx = new JsonArrayStepContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jsonArrayStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__7);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WILDCARD:
				{
				setState(93);
				jsonArrayWildcardStep();
				}
				break;
			case NATRUAL_INTEGER:
				{
				setState(94);
				jsonArraySelectionsStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(T__8);
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

	public static class JsonArrayWildcardStepContext extends ParserRuleContext {
		public TerminalNode WILDCARD() { return getToken(JsonPathParser.WILDCARD, 0); }
		public JsonArrayWildcardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArrayWildcardStep; }
	}

	public final JsonArrayWildcardStepContext jsonArrayWildcardStep() throws RecognitionException {
		JsonArrayWildcardStepContext _localctx = new JsonArrayWildcardStepContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsonArrayWildcardStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(WILDCARD);
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

	public static class JsonArraySelectionsStepContext extends ParserRuleContext {
		public List<JsonArraySelectionContext> jsonArraySelection() {
			return getRuleContexts(JsonArraySelectionContext.class);
		}
		public JsonArraySelectionContext jsonArraySelection(int i) {
			return getRuleContext(JsonArraySelectionContext.class,i);
		}
		public JsonArraySelectionsStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArraySelectionsStep; }
	}

	public final JsonArraySelectionsStepContext jsonArraySelectionsStep() throws RecognitionException {
		JsonArraySelectionsStepContext _localctx = new JsonArraySelectionsStepContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsonArraySelectionsStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			jsonArraySelection();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(102);
				match(T__9);
				setState(103);
				jsonArraySelection();
				}
				}
				setState(108);
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

	public static class JsonArraySelectionContext extends ParserRuleContext {
		public JsonArrayIndexContext jsonArrayIndex() {
			return getRuleContext(JsonArrayIndexContext.class,0);
		}
		public JsonArraySliceContext jsonArraySlice() {
			return getRuleContext(JsonArraySliceContext.class,0);
		}
		public JsonArraySelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArraySelection; }
	}

	public final JsonArraySelectionContext jsonArraySelection() throws RecognitionException {
		JsonArraySelectionContext _localctx = new JsonArraySelectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsonArraySelection);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				jsonArrayIndex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				jsonArraySlice();
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

	public static class JsonArrayIndexContext extends ParserRuleContext {
		public TerminalNode NATRUAL_INTEGER() { return getToken(JsonPathParser.NATRUAL_INTEGER, 0); }
		public JsonArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArrayIndex; }
	}

	public final JsonArrayIndexContext jsonArrayIndex() throws RecognitionException {
		JsonArrayIndexContext _localctx = new JsonArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsonArrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NATRUAL_INTEGER);
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

	public static class JsonArraySliceContext extends ParserRuleContext {
		public List<TerminalNode> NATRUAL_INTEGER() { return getTokens(JsonPathParser.NATRUAL_INTEGER); }
		public TerminalNode NATRUAL_INTEGER(int i) {
			return getToken(JsonPathParser.NATRUAL_INTEGER, i);
		}
		public JsonArraySliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArraySlice; }
	}

	public final JsonArraySliceContext jsonArraySlice() throws RecognitionException {
		JsonArraySliceContext _localctx = new JsonArraySliceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsonArraySlice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NATRUAL_INTEGER);
			setState(116);
			match(T__10);
			setState(117);
			match(NATRUAL_INTEGER);
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
		case 6:
			return jsonCond_sempred((JsonCondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jsonCond_sempred(JsonCondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\7\5\64\n"+
		"\5\f\5\16\5\67\13\5\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\3\n\3\n\3\n\5\nT\n"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17b\n\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21k\n\21\f\21\16\21n\13\21\3\22\3"+
		"\22\5\22r\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\2\3\16\25\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2o\2*\3\2\2\2\4,\3\2\2\2\6/\3\2"+
		"\2\2\b\65\3\2\2\2\n;\3\2\2\2\f?\3\2\2\2\16C\3\2\2\2\20N\3\2\2\2\22P\3"+
		"\2\2\2\24U\3\2\2\2\26W\3\2\2\2\30Y\3\2\2\2\32\\\3\2\2\2\34^\3\2\2\2\36"+
		"e\3\2\2\2 g\3\2\2\2\"q\3\2\2\2$s\3\2\2\2&u\3\2\2\2(+\5\4\3\2)+\5\6\4\2"+
		"*(\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,-\7\3\2\2-.\5\b\5\2.\5\3\2\2\2/\60\7\4"+
		"\2\2\60\61\5\b\5\2\61\7\3\2\2\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\67\65\3\2\2\28<\5\22\n\2"+
		"9<\5\34\17\2:<\5\30\r\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=>\5\f"+
		"\7\2>\13\3\2\2\2?@\7\5\2\2@A\5\16\b\2AB\7\6\2\2B\r\3\2\2\2CD\b\b\1\2D"+
		"E\5\20\t\2EK\3\2\2\2FG\f\3\2\2GH\7\7\2\2HJ\5\16\b\4IF\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2\2NO\5\6\4\2O\21\3\2\2\2PS\7"+
		"\b\2\2QT\5\24\13\2RT\5\26\f\2SQ\3\2\2\2SR\3\2\2\2T\23\3\2\2\2UV\7\21\2"+
		"\2V\25\3\2\2\2WX\5\32\16\2X\27\3\2\2\2YZ\7\t\2\2Z[\5\32\16\2[\31\3\2\2"+
		"\2\\]\7\20\2\2]\33\3\2\2\2^a\7\n\2\2_b\5\36\20\2`b\5 \21\2a_\3\2\2\2a"+
		"`\3\2\2\2bc\3\2\2\2cd\7\13\2\2d\35\3\2\2\2ef\7\21\2\2f\37\3\2\2\2gl\5"+
		"\"\22\2hi\7\f\2\2ik\5\"\22\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"!\3\2\2\2nl\3\2\2\2or\5$\23\2pr\5&\24\2qo\3\2\2\2qp\3\2\2\2r#\3\2\2\2"+
		"st\7\17\2\2t%\3\2\2\2uv\7\17\2\2vw\7\r\2\2wx\7\17\2\2x\'\3\2\2\2\n*\65"+
		";KSalq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}