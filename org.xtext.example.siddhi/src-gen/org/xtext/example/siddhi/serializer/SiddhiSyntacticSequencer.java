/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.siddhi.services.SiddhiGrammarAccess;

@SuppressWarnings("all")
public class SiddhiSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SiddhiGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AnonymousStream_OPEN_PARParserRuleCall_0_0_a;
	protected AbstractElementAlias match_AttributeIndex___HyphenMinusKeyword_1_2_0_INT_LITERALParserRuleCall_1_2_1__q;
	protected AbstractElementAlias match_BasicSourceStreamHandlers1_NumberSignKeyword_1_0_0_0_q;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_1_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_3_2_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_1_1_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_1_5_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_1_a;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_3_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_4_2_p;
	protected AbstractElementAlias match_DOUBLE_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q;
	protected AbstractElementAlias match_DOUBLE_LITERAL___FullStopKeyword_1_2_0_DIGITParserRuleCall_1_2_1_a__q;
	protected AbstractElementAlias match_DOUBLE_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q;
	protected AbstractElementAlias match_DOUBLE_LITERAL___HyphenMinusKeyword_1_4_0_or_PlusSignKeyword_1_4_1__q;
	protected AbstractElementAlias match_DOUBLE_LITERAL___HyphenMinusKeyword_2_0_4_1_0_or_PlusSignKeyword_2_0_4_1_1__q;
	protected AbstractElementAlias match_ExecPartition_SemicolonKeyword_10_q;
	protected AbstractElementAlias match_ExecutionPlan_SemicolonKeyword_1_3_q;
	protected AbstractElementAlias match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_1_p;
	protected AbstractElementAlias match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_3_2_p;
	protected AbstractElementAlias match_FLOAT_LITERAL_DIGITParserRuleCall_1_1_a;
	protected AbstractElementAlias match_FLOAT_LITERAL_DIGITParserRuleCall_1_3_p;
	protected AbstractElementAlias match_FLOAT_LITERAL_DIGITParserRuleCall_1_4_2_p;
	protected AbstractElementAlias match_FLOAT_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q;
	protected AbstractElementAlias match_FLOAT_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q;
	protected AbstractElementAlias match_FLOAT_LITERAL___HyphenMinusKeyword_1_4_1_0_or_PlusSignKeyword_1_4_1_1__q;
	protected AbstractElementAlias match_Filter_NumberSignKeyword_0_q;
	protected AbstractElementAlias match_LONG_LITERAL_DIGITParserRuleCall_0_p;
	protected AbstractElementAlias match_PropertySeparator_COLParserRuleCall_2_1_or_DOTParserRuleCall_0_1_or_MINUSParserRuleCall_1_1;
	protected AbstractElementAlias match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_a;
	protected AbstractElementAlias match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_p;
	protected AbstractElementAlias match_SignedDoubleValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q;
	protected AbstractElementAlias match_SignedFloatValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q;
	protected AbstractElementAlias match_SignedLongValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SiddhiGrammarAccess) access;
		match_AnonymousStream_OPEN_PARParserRuleCall_0_0_a = new TokenAlias(true, true, grammarAccess.getAnonymousStreamAccess().getOPEN_PARParserRuleCall_0_0());
		match_AttributeIndex___HyphenMinusKeyword_1_2_0_INT_LITERALParserRuleCall_1_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeIndexAccess().getHyphenMinusKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getAttributeIndexAccess().getINT_LITERALParserRuleCall_1_2_1()));
		match_BasicSourceStreamHandlers1_NumberSignKeyword_1_0_0_0_q = new TokenAlias(false, true, grammarAccess.getBasicSourceStreamHandlers1Access().getNumberSignKeyword_1_0_0_0());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_1_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_0_0_1());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_3_2_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_0_0_3_2());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_1_1_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_1_1());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_1_5_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_1_5());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_1_a = new TokenAlias(true, true, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_2_0_1());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_3_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_2_0_3());
		match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_4_2_p = new TokenAlias(true, false, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_2_0_4_2());
		match_DOUBLE_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getFullStopKeyword_0_0_2_0()), new TokenAlias(true, true, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_0_0_2_1()));
		match_DOUBLE_LITERAL___FullStopKeyword_1_2_0_DIGITParserRuleCall_1_2_1_a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getFullStopKeyword_1_2_0()), new TokenAlias(true, true, grammarAccess.getDOUBLE_LITERALAccess().getDIGITParserRuleCall_1_2_1()));
		match_DOUBLE_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getHyphenMinusKeyword_0_0_3_1_0()), new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getPlusSignKeyword_0_0_3_1_1()));
		match_DOUBLE_LITERAL___HyphenMinusKeyword_1_4_0_or_PlusSignKeyword_1_4_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getHyphenMinusKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getPlusSignKeyword_1_4_1()));
		match_DOUBLE_LITERAL___HyphenMinusKeyword_2_0_4_1_0_or_PlusSignKeyword_2_0_4_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getHyphenMinusKeyword_2_0_4_1_0()), new TokenAlias(false, false, grammarAccess.getDOUBLE_LITERALAccess().getPlusSignKeyword_2_0_4_1_1()));
		match_ExecPartition_SemicolonKeyword_10_q = new TokenAlias(false, true, grammarAccess.getExecPartitionAccess().getSemicolonKeyword_10());
		match_ExecutionPlan_SemicolonKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getExecutionPlanAccess().getSemicolonKeyword_1_3());
		match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_1_p = new TokenAlias(true, false, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_0_0_1());
		match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_3_2_p = new TokenAlias(true, false, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_0_0_3_2());
		match_FLOAT_LITERAL_DIGITParserRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_1_1());
		match_FLOAT_LITERAL_DIGITParserRuleCall_1_3_p = new TokenAlias(true, false, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_1_3());
		match_FLOAT_LITERAL_DIGITParserRuleCall_1_4_2_p = new TokenAlias(true, false, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_1_4_2());
		match_FLOAT_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFLOAT_LITERALAccess().getFullStopKeyword_0_0_2_0()), new TokenAlias(true, true, grammarAccess.getFLOAT_LITERALAccess().getDIGITParserRuleCall_0_0_2_1()));
		match_FLOAT_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFLOAT_LITERALAccess().getHyphenMinusKeyword_0_0_3_1_0()), new TokenAlias(false, false, grammarAccess.getFLOAT_LITERALAccess().getPlusSignKeyword_0_0_3_1_1()));
		match_FLOAT_LITERAL___HyphenMinusKeyword_1_4_1_0_or_PlusSignKeyword_1_4_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFLOAT_LITERALAccess().getHyphenMinusKeyword_1_4_1_0()), new TokenAlias(false, false, grammarAccess.getFLOAT_LITERALAccess().getPlusSignKeyword_1_4_1_1()));
		match_Filter_NumberSignKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFilterAccess().getNumberSignKeyword_0());
		match_LONG_LITERAL_DIGITParserRuleCall_0_p = new TokenAlias(true, false, grammarAccess.getLONG_LITERALAccess().getDIGITParserRuleCall_0());
		match_PropertySeparator_COLParserRuleCall_2_1_or_DOTParserRuleCall_0_1_or_MINUSParserRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPropertySeparatorAccess().getCOLParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getPropertySeparatorAccess().getDOTParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getPropertySeparatorAccess().getMINUSParserRuleCall_1_1()));
		match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_a = new TokenAlias(true, true, grammarAccess.getSequenceSourceChain1Access().getOPEN_PARParserRuleCall_0_0_0());
		match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_p = new TokenAlias(true, false, grammarAccess.getSequenceSourceChain1Access().getOPEN_PARParserRuleCall_0_0_0());
		match_SignedDoubleValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSignedDoubleValueAccess().getHyphenMinusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getSignedDoubleValueAccess().getPlusSignKeyword_0_1()));
		match_SignedFloatValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSignedFloatValueAccess().getHyphenMinusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getSignedFloatValueAccess().getPlusSignKeyword_0_1()));
		match_SignedLongValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSignedLongValueAccess().getHyphenMinusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getSignedLongValueAccess().getPlusSignKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCLOSE_PARRule())
			return getCLOSE_PARToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLOSE_SQARE_BRACKETSRule())
			return getCLOSE_SQARE_BRACKETSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOLRule())
			return getCOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDIGITRule())
			return getDIGITToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINT_LITERALRule())
			return getINT_LITERALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMINUSRule())
			return getMINUSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPEN_PARRule())
			return getOPEN_PARToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPEN_SQARE_BRACKETSRule())
			return getOPEN_SQARE_BRACKETSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTRIPLE_DOTRule())
			return getTRIPLE_DOTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CLOSE_PAR : ')';
	 */
	protected String getCLOSE_PARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * CLOSE_SQARE_BRACKETS : ']';
	 */
	protected String getCLOSE_SQARE_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * COL : ':';
	 */
	protected String getCOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * fragment DIGIT:
	 * 	INT
	 * ;
	 */
	protected String getDIGITToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * DOT : '.';
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * INT_LITERAL:
	 * 	DIGIT+
	 * ;
	 */
	protected String getINT_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * MINUS : '-';
	 */
	protected String getMINUSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * OPEN_PAR : '(';
	 */
	protected String getOPEN_PARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * OPEN_SQARE_BRACKETS : '[';
	 */
	protected String getOPEN_SQARE_BRACKETSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * TRIPLE_DOT : '...';
	 */
	protected String getTRIPLE_DOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "...";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AnonymousStream_OPEN_PARParserRuleCall_0_0_a.equals(syntax))
				emit_AnonymousStream_OPEN_PARParserRuleCall_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AttributeIndex___HyphenMinusKeyword_1_2_0_INT_LITERALParserRuleCall_1_2_1__q.equals(syntax))
				emit_AttributeIndex___HyphenMinusKeyword_1_2_0_INT_LITERALParserRuleCall_1_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BasicSourceStreamHandlers1_NumberSignKeyword_1_0_0_0_q.equals(syntax))
				emit_BasicSourceStreamHandlers1_NumberSignKeyword_1_0_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_1_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_3_2_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_3_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_1_1_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_1_5_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_1_5_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_1_a.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_3_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_4_2_p.equals(syntax))
				emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_4_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q.equals(syntax))
				emit_DOUBLE_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL___FullStopKeyword_1_2_0_DIGITParserRuleCall_1_2_1_a__q.equals(syntax))
				emit_DOUBLE_LITERAL___FullStopKeyword_1_2_0_DIGITParserRuleCall_1_2_1_a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q.equals(syntax))
				emit_DOUBLE_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL___HyphenMinusKeyword_1_4_0_or_PlusSignKeyword_1_4_1__q.equals(syntax))
				emit_DOUBLE_LITERAL___HyphenMinusKeyword_1_4_0_or_PlusSignKeyword_1_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DOUBLE_LITERAL___HyphenMinusKeyword_2_0_4_1_0_or_PlusSignKeyword_2_0_4_1_1__q.equals(syntax))
				emit_DOUBLE_LITERAL___HyphenMinusKeyword_2_0_4_1_0_or_PlusSignKeyword_2_0_4_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExecPartition_SemicolonKeyword_10_q.equals(syntax))
				emit_ExecPartition_SemicolonKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExecutionPlan_SemicolonKeyword_1_3_q.equals(syntax))
				emit_ExecutionPlan_SemicolonKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_1_p.equals(syntax))
				emit_FLOAT_LITERAL_DIGITParserRuleCall_0_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL_DIGITParserRuleCall_0_0_3_2_p.equals(syntax))
				emit_FLOAT_LITERAL_DIGITParserRuleCall_0_0_3_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL_DIGITParserRuleCall_1_1_a.equals(syntax))
				emit_FLOAT_LITERAL_DIGITParserRuleCall_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL_DIGITParserRuleCall_1_3_p.equals(syntax))
				emit_FLOAT_LITERAL_DIGITParserRuleCall_1_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL_DIGITParserRuleCall_1_4_2_p.equals(syntax))
				emit_FLOAT_LITERAL_DIGITParserRuleCall_1_4_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q.equals(syntax))
				emit_FLOAT_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q.equals(syntax))
				emit_FLOAT_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FLOAT_LITERAL___HyphenMinusKeyword_1_4_1_0_or_PlusSignKeyword_1_4_1_1__q.equals(syntax))
				emit_FLOAT_LITERAL___HyphenMinusKeyword_1_4_1_0_or_PlusSignKeyword_1_4_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Filter_NumberSignKeyword_0_q.equals(syntax))
				emit_Filter_NumberSignKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LONG_LITERAL_DIGITParserRuleCall_0_p.equals(syntax))
				emit_LONG_LITERAL_DIGITParserRuleCall_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertySeparator_COLParserRuleCall_2_1_or_DOTParserRuleCall_0_1_or_MINUSParserRuleCall_1_1.equals(syntax))
				emit_PropertySeparator_COLParserRuleCall_2_1_or_DOTParserRuleCall_0_1_or_MINUSParserRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_a.equals(syntax))
				emit_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_p.equals(syntax))
				emit_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SignedDoubleValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q.equals(syntax))
				emit_SignedDoubleValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SignedFloatValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q.equals(syntax))
				emit_SignedFloatValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SignedLongValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q.equals(syntax))
				emit_SignedLongValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     OPEN_PAR*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) from='from'
	 */
	protected void emit_AnonymousStream_OPEN_PARParserRuleCall_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' INT_LITERAL)?
	 *
	 * This ambiguous syntax occurs at:
	 *     last='last' (ambiguity) (rule end)
	 */
	protected void emit_AttributeIndex___HyphenMinusKeyword_1_2_0_INT_LITERALParserRuleCall_1_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) OPEN_SQARE_BRACKETS exp=Expression
	 */
	protected void emit_BasicSourceStreamHandlers1_NumberSignKeyword_1_0_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? (ambiguity) ('.' DIGIT*)? d=D
	 *     (rule start) ('-' | '+')? (ambiguity) ('.' DIGIT*)? e=E
	 *     (rule start) (ambiguity) ('.' DIGIT*)? d=D
	 *     (rule start) (ambiguity) ('.' DIGIT*)? e=E
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E ('-' | '+')? (ambiguity) d=D
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_0_0_3_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? (ambiguity) ('.' DIGIT*)? e=E
	 *     (rule start) (ambiguity) ('.' DIGIT*)? e=E
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E ('-' | '+')? (ambiguity) (rule end)
	 *     e=E ('-' | '+')? (ambiguity) d=D
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_1_5_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? (ambiguity) '.' DIGIT+ (rule start)
	 *     (rule start) ('-' | '+')? (ambiguity) '.' DIGIT+ d=D
	 *     (rule start) ('-' | '+')? (ambiguity) '.' DIGIT+ e=E
	 *     (rule start) (ambiguity) '.' DIGIT+ (rule start)
	 *     (rule start) (ambiguity) '.' DIGIT+ d=D
	 *     (rule start) (ambiguity) '.' DIGIT+ e=E
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? DIGIT* '.' (ambiguity) (rule start)
	 *     (rule start) ('-' | '+')? DIGIT* '.' (ambiguity) d=D
	 *     (rule start) ('-' | '+')? DIGIT* '.' (ambiguity) e=E
	 *     (rule start) DIGIT* '.' (ambiguity) (rule start)
	 *     (rule start) DIGIT* '.' (ambiguity) d=D
	 *     (rule start) DIGIT* '.' (ambiguity) e=E
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E ('-' | '+')? (ambiguity) (rule end)
	 *     e=E ('-' | '+')? (ambiguity) d=D
	 */
	protected void emit_DOUBLE_LITERAL_DIGITParserRuleCall_2_0_4_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' DIGIT*)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? DIGIT+ (ambiguity) d=D
	 *     (rule start) ('-' | '+')? DIGIT+ (ambiguity) e=E
	 *     (rule start) DIGIT+ (ambiguity) d=D
	 *     (rule start) DIGIT+ (ambiguity) e=E
	 */
	protected void emit_DOUBLE_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' DIGIT*)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('-' | '+')? DIGIT+ (ambiguity) e=E
	 *     (rule start) DIGIT+ (ambiguity) e=E
	 */
	protected void emit_DOUBLE_LITERAL___FullStopKeyword_1_2_0_DIGITParserRuleCall_1_2_1_a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' | '+')?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E (ambiguity) DIGIT+ d=D
	 */
	protected void emit_DOUBLE_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' | '+')?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E (ambiguity) DIGIT+ (rule end)
	 *     e=E (ambiguity) DIGIT+ d=D
	 */
	protected void emit_DOUBLE_LITERAL___HyphenMinusKeyword_1_4_0_or_PlusSignKeyword_1_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' | '+')?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E (ambiguity) DIGIT+ (rule end)
	 *     e=E (ambiguity) DIGIT+ d=D
	 */
	protected void emit_DOUBLE_LITERAL___HyphenMinusKeyword_2_0_4_1_0_or_PlusSignKeyword_2_0_4_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     qu+=Query (ambiguity) end='end'
	 */
	protected void emit_ExecPartition_SemicolonKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     defAggregation+=DefinitionAggregation (ambiguity) (rule end)
	 *     defFunction+=DefinitionFunction (ambiguity) (rule end)
	 *     defStream+=DefinitionStream (ambiguity) (rule end)
	 *     defTable+=DefinitionTable (ambiguity) (rule end)
	 *     defTrigger+=DefinitionTrigger (ambiguity) (rule end)
	 *     def_window+=DefinitionWindow (ambiguity) (rule end)
	 *     exElement+=ExecutionElement (ambiguity) (rule end)
	 */
	protected void emit_ExecutionPlan_SemicolonKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('+' | '-')? (ambiguity) ('.' DIGIT*)? e=E
	 *     (rule start) ('+' | '-')? (ambiguity) ('.' DIGIT*)? f=F
	 *     (rule start) (ambiguity) ('.' DIGIT*)? e=E
	 *     (rule start) (ambiguity) ('.' DIGIT*)? f=F
	 */
	protected void emit_FLOAT_LITERAL_DIGITParserRuleCall_0_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E ('-' | '+')? (ambiguity) f=F
	 */
	protected void emit_FLOAT_LITERAL_DIGITParserRuleCall_0_0_3_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('+' | '-')? (ambiguity) '.' DIGIT+ e=E
	 *     (rule start) ('+' | '-')? (ambiguity) '.' DIGIT+ f=F
	 *     (rule start) (ambiguity) '.' DIGIT+ e=E
	 *     (rule start) (ambiguity) '.' DIGIT+ f=F
	 */
	protected void emit_FLOAT_LITERAL_DIGITParserRuleCall_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('+' | '-')? DIGIT* '.' (ambiguity) e=E
	 *     (rule start) ('+' | '-')? DIGIT* '.' (ambiguity) f=F
	 *     (rule start) DIGIT* '.' (ambiguity) e=E
	 *     (rule start) DIGIT* '.' (ambiguity) f=F
	 */
	protected void emit_FLOAT_LITERAL_DIGITParserRuleCall_1_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E ('+' | '-')? (ambiguity) f=F
	 *     e=E ('-' | '+')? (ambiguity) f=F
	 */
	protected void emit_FLOAT_LITERAL_DIGITParserRuleCall_1_4_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' DIGIT*)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('+' | '-')? DIGIT+ (ambiguity) e=E
	 *     (rule start) ('+' | '-')? DIGIT+ (ambiguity) f=F
	 *     (rule start) DIGIT+ (ambiguity) e=E
	 *     (rule start) DIGIT+ (ambiguity) f=F
	 */
	protected void emit_FLOAT_LITERAL___FullStopKeyword_0_0_2_0_DIGITParserRuleCall_0_0_2_1_a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' | '+')?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E (ambiguity) DIGIT+ f=F
	 */
	protected void emit_FLOAT_LITERAL___HyphenMinusKeyword_0_0_3_1_0_or_PlusSignKeyword_0_0_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('+' | '-')?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=E (ambiguity) DIGIT+ f=F
	 */
	protected void emit_FLOAT_LITERAL___HyphenMinusKeyword_1_4_1_0_or_PlusSignKeyword_1_4_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) OPEN_SQARE_BRACKETS exp=Expression
	 */
	protected void emit_Filter_NumberSignKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DIGIT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('+' | '-')? (ambiguity) l=L
	 *     (rule start) (ambiguity) l=L
	 */
	protected void emit_LONG_LITERAL_DIGITParserRuleCall_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DOT | MINUS | COL
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_PropertySeparator_COLParserRuleCall_2_1_or_DOTParserRuleCall_0_1_or_MINUSParserRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     OPEN_PAR*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) OPEN_PAR logicalAbsStatefulSrc=LogicalAbsentStatefulSource
	 *     (rule start) (ambiguity) basicAbsentPatternSource1=BasicAbsentPatternSource
	 *     (rule start) (ambiguity) basicAbsentPatternSource2=BasicAbsentPatternSource
	 *     (rule start) (ambiguity) name=IdNew
	 *     (rule start) (ambiguity) not1='not'
	 *     (rule start) (ambiguity) src=Source
	 *     (rule start) (ambiguity) stdSource+=StandardStatefulSource
	 *     (rule start) (ambiguity) stdSource=StandardStatefulSource
	 *     (rule start) (ambiguity) {SequenceSourceChain.left=}
	 */
	protected void emit_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     OPEN_PAR+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {SequenceSourceChain.left=}
	 */
	protected void emit_SequenceSourceChain1_OPEN_PARParserRuleCall_0_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('-' | '+')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) DIGIT* '.' DIGIT+ (rule start)
	 *     (rule start) (ambiguity) DIGIT* '.' DIGIT+ d=D
	 *     (rule start) (ambiguity) DIGIT* '.' DIGIT+ e=E
	 *     (rule start) (ambiguity) DIGIT+ ('.' DIGIT*)? d=D
	 *     (rule start) (ambiguity) DIGIT+ ('.' DIGIT*)? e=E
	 */
	protected void emit_SignedDoubleValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('+' | '-')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) DIGIT* '.' DIGIT+ e=E
	 *     (rule start) (ambiguity) DIGIT* '.' DIGIT+ f=F
	 *     (rule start) (ambiguity) DIGIT+ ('.' DIGIT*)? e=E
	 *     (rule start) (ambiguity) DIGIT+ ('.' DIGIT*)? f=F
	 */
	protected void emit_SignedFloatValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('+' | '-')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) DIGIT+ l=L
	 */
	protected void emit_SignedLongValue___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
