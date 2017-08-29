package org.xtext.example.siddhi.ui.syntaxhighlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SiddhiHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String DEFAULT_ID = "default";
	public static final String KEYWORD_ID = "keyword";
	public static final String NUMBER_ID = "number";
	public static final String COMMENT_ID = "comment";
	public static final String PUNCTUATION_ID = "punctuation";
	public static final String STRING_ID = "string";
	public static final String USER_DEFINED_STREAM = "user_defined_stream";
	public static final String ANNOTATION = "annotation";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", NumberTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", CommentTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation", PunctuationTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", StringTextStyle());
		acceptor.acceptDefaultHighlighting(USER_DEFINED_STREAM, "User_defined_stream", UserDefinedSreamTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION, "Annotation",AnnotationTextStyle());
	}

	protected TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		
		return textStyle;
	}
	
	protected TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(16, 135, 255));
		textStyle.setStyle(SWT.BOLD);
		
		return textStyle;
	}

	protected TextStyle NumberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(130, 90, 10));
		
		return textStyle;
	}
	
	protected TextStyle CommentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(17, 150, 30));
		textStyle.setStyle(SWT.ITALIC);
		
		return textStyle;
	}
	
	protected TextStyle PunctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 175, 16));
		
		return textStyle;
	}
	
	protected TextStyle StringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(16, 15, 255));
		
		return textStyle;
	}
	
	protected TextStyle UserDefinedSreamTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(151, 15, 255));
		
		return textStyle;
	}
	
	protected TextStyle AnnotationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(161, 161, 161));
		
		return textStyle;
	}


}
