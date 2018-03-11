// Generated from QueuingT.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueuingTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VAL=6, ABR_CC=7, CRR_CC=8, NOT=9, 
		MULT=10, DIV=11, MOD=12, MAS=13, MENOS=14, MENQ=15, MENIG=16, MAYQ=17, 
		MAYIG=18, IGL=19, NIGL=20, AND=21, OR=22, EQ=23, COMA=24, PYC=25, CML=26, 
		DIST=27, NODES=28, DESNODO=29, ATRNS=30, ATRSD=31, ARTID=32, CONEX=33, 
		ATRIDS=34, ATRIDE=35, SIM=36, ANLT=37, ID=38, STR=39, SIGINT=40, INT=41, 
		DOBL=42, LETRAS=43, CMT_MULTI=44, CMT_SIMPL=45, ESPACIO=46;
	public static final int
		RULE_codigo = 0, RULE_head = 1, RULE_var = 2, RULE_network_description = 3, 
		RULE_node_description = 4, RULE_node_property = 5, RULE_connection = 6, 
		RULE_id_con = 7, RULE_footer = 8, RULE_stime = 9, RULE_analitics = 10, 
		RULE_property = 11;
	public static final String[] ruleNames = {
		"codigo", "head", "var", "network_description", "node_description", "node_property", 
		"connection", "id_con", "footer", "stime", "analitics", "property"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'avg_customer_system'", "'avg_customer_queue'", "'avgt_customer_system'", 
		"'avgt_customer_queue'", "'queue_distribution'", null, "'['", "']'", "'not'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", 
		"'!='", "'and'", "'or'", "'='", "','", "';'", "'''", null, "'nodes'", 
		"'describe_node'", "'number_of_servers'", "'server_distribution'", "'id'", 
		"'describe_connection'", "'id_start'", "'id_end'", "'simulation_time'", 
		"'analytics'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "VAL", "ABR_CC", "CRR_CC", "NOT", 
		"MULT", "DIV", "MOD", "MAS", "MENOS", "MENQ", "MENIG", "MAYQ", "MAYIG", 
		"IGL", "NIGL", "AND", "OR", "EQ", "COMA", "PYC", "CML", "DIST", "NODES", 
		"DESNODO", "ATRNS", "ATRSD", "ARTID", "CONEX", "ATRIDS", "ATRIDE", "SIM", 
		"ANLT", "ID", "STR", "SIGINT", "INT", "DOBL", "LETRAS", "CMT_MULTI", "CMT_SIMPL", 
		"ESPACIO"
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
	public String getGrammarFileName() { return "QueuingT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueuingTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodigoContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public Network_descriptionContext network_description() {
			return getRuleContext(Network_descriptionContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(24);
			head();
			}
			{
			setState(25);
			network_description();
			}
			{
			setState(26);
			footer();
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

	public static class HeadContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			var();
			setState(29);
			match(EQ);
			setState(30);
			match(INT);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NODES() { return getToken(QueuingTParser.NODES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NODES);
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

	public static class Network_descriptionContext extends ParserRuleContext {
		public List<Node_descriptionContext> node_description() {
			return getRuleContexts(Node_descriptionContext.class);
		}
		public Node_descriptionContext node_description(int i) {
			return getRuleContext(Node_descriptionContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public Network_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_network_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNetwork_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNetwork_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNetwork_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Network_descriptionContext network_description() throws RecognitionException {
		Network_descriptionContext _localctx = new Network_descriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_network_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESNODO || _la==CONEX) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DESNODO:
					{
					setState(34);
					node_description();
					}
					break;
				case CONEX:
					{
					setState(35);
					connection();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
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

	public static class Node_descriptionContext extends ParserRuleContext {
		public TerminalNode DESNODO() { return getToken(QueuingTParser.DESNODO, 0); }
		public TerminalNode ABR_CC() { return getToken(QueuingTParser.ABR_CC, 0); }
		public TerminalNode CRR_CC() { return getToken(QueuingTParser.CRR_CC, 0); }
		public List<Node_propertyContext> node_property() {
			return getRuleContexts(Node_propertyContext.class);
		}
		public Node_propertyContext node_property(int i) {
			return getRuleContext(Node_propertyContext.class,i);
		}
		public Node_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNode_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNode_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNode_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_descriptionContext node_description() throws RecognitionException {
		Node_descriptionContext _localctx = new Node_descriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(DESNODO);
			setState(42);
			match(ABR_CC);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ATRNS) | (1L << ATRSD) | (1L << ARTID) | (1L << ATRIDS) | (1L << ATRIDE))) != 0)) {
				{
				{
				setState(43);
				node_property();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(CRR_CC);
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

	public static class Node_propertyContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode VAL() { return getToken(QueuingTParser.VAL, 0); }
		public Node_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNode_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNode_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNode_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_propertyContext node_property() throws RecognitionException {
		Node_propertyContext _localctx = new Node_propertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_node_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			property();
			setState(52);
			match(EQ);
			setState(53);
			match(VAL);
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

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode CONEX() { return getToken(QueuingTParser.CONEX, 0); }
		public TerminalNode ABR_CC() { return getToken(QueuingTParser.ABR_CC, 0); }
		public TerminalNode CRR_CC() { return getToken(QueuingTParser.CRR_CC, 0); }
		public List<Id_conContext> id_con() {
			return getRuleContexts(Id_conContext.class);
		}
		public Id_conContext id_con(int i) {
			return getRuleContext(Id_conContext.class,i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CONEX);
			setState(56);
			match(ABR_CC);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				id_con();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATRIDS || _la==ATRIDE );
			setState(62);
			match(CRR_CC);
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

	public static class Id_conContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode ATRIDS() { return getToken(QueuingTParser.ATRIDS, 0); }
		public TerminalNode ATRIDE() { return getToken(QueuingTParser.ATRIDE, 0); }
		public TerminalNode ID() { return getToken(QueuingTParser.ID, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public Id_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterId_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitId_con(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitId_con(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_conContext id_con() throws RecognitionException {
		Id_conContext _localctx = new Id_conContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==ATRIDS || _la==ATRIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(EQ);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class FooterContext extends ParserRuleContext {
		public StimeContext stime() {
			return getRuleContext(StimeContext.class,0);
		}
		public List<AnaliticsContext> analitics() {
			return getRuleContexts(AnaliticsContext.class);
		}
		public AnaliticsContext analitics(int i) {
			return getRuleContext(AnaliticsContext.class,i);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_footer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			stime();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(69);
				analitics();
				}
				}
				setState(74);
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

	public static class StimeContext extends ParserRuleContext {
		public TerminalNode SIM() { return getToken(QueuingTParser.SIM, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode ID() { return getToken(QueuingTParser.ID, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public StimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterStime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitStime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitStime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StimeContext stime() throws RecognitionException {
		StimeContext _localctx = new StimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(SIM);
			setState(76);
			match(EQ);
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class AnaliticsContext extends ParserRuleContext {
		public AnaliticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analitics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterAnalitics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitAnalitics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitAnalitics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnaliticsContext analitics() throws RecognitionException {
		AnaliticsContext _localctx = new AnaliticsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_analitics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ATRNS) | (1L << ATRSD) | (1L << ARTID) | (1L << ATRIDS) | (1L << ATRIDE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5\'\n"+
		"\5\f\5\16\5*\13\5\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\6\b=\n\b\r\b\16\b>\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\7\nI\n\n\f\n\16\nL\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2$%\4\2((++\3\2\3\6\5\2\7\7"+
		" \"$%\2N\2\32\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b(\3\2\2\2\n+\3\2\2\2\f"+
		"\65\3\2\2\2\169\3\2\2\2\20B\3\2\2\2\22F\3\2\2\2\24M\3\2\2\2\26Q\3\2\2"+
		"\2\30S\3\2\2\2\32\33\5\4\3\2\33\34\5\b\5\2\34\35\5\22\n\2\35\3\3\2\2\2"+
		"\36\37\5\6\4\2\37 \7\31\2\2 !\7+\2\2!\5\3\2\2\2\"#\7\36\2\2#\7\3\2\2\2"+
		"$\'\5\n\6\2%\'\5\16\b\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)\t\3\2\2\2*(\3\2\2\2+,\7\37\2\2,\60\7\t\2\2-/\5\f\7\2.-\3\2\2\2/"+
		"\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64"+
		"\7\n\2\2\64\13\3\2\2\2\65\66\5\30\r\2\66\67\7\31\2\2\678\7\b\2\28\r\3"+
		"\2\2\29:\7#\2\2:<\7\t\2\2;=\5\20\t\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?@\3\2\2\2@A\7\n\2\2A\17\3\2\2\2BC\t\2\2\2CD\7\31\2\2DE\t\3\2\2"+
		"E\21\3\2\2\2FJ\5\24\13\2GI\5\26\f\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2K\23\3\2\2\2LJ\3\2\2\2MN\7&\2\2NO\7\31\2\2OP\t\3\2\2P\25\3\2\2\2"+
		"QR\t\4\2\2R\27\3\2\2\2ST\t\5\2\2T\31\3\2\2\2\7&(\60>J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}