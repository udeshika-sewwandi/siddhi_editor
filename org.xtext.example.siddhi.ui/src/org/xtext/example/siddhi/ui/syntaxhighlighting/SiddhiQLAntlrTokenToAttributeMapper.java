package org.xtext.example.siddhi.ui.syntaxhighlighting;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class SiddhiQLAntlrTokenToAttributeMapper extends AbstractAntlrTokenToAttributeIdMapper{
private static final Pattern QUOTED = Pattern.compile("(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$", Pattern.MULTILINE);
private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(tokenName.equals("RULE_INT"))
			return SiddhiHighlightingConfiguration.NUMBER_ID;
		else if(QUOTED.matcher(tokenName).matches())
			return SiddhiHighlightingConfiguration.KEYWORD_ID;
		else if(tokenName.equals("RULE_SL_COMMENT") || tokenName.equals("RULE_ML_COMMENT"))
			return SiddhiHighlightingConfiguration.COMMENT_ID;
		else if(tokenName.equals("RULE_STRING"))
			return SiddhiHighlightingConfiguration.STRING_ID;
		/*else if(tokenName.equals("RULE_ID"))
			return SiddhiHighlightingConfiguration.STRING_ID;*/
		else if(PUNCTUATION.matcher(tokenName).matches())
				return SiddhiHighlightingConfiguration.PUNCTUATION_ID;
		return SiddhiHighlightingConfiguration.DEFAULT_ID;
	}
}