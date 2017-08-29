/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.ui;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.xtext.example.siddhi.ui.AbstractSiddhiUiModule;
import org.xtext.example.siddhi.ui.syntaxhighlighting.SiddhiHighlightingConfiguration;
import org.xtext.example.siddhi.ui.syntaxhighlighting.SiddhiSemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class SiddhiUiModule extends AbstractSiddhiUiModule {
  public Class<? extends IHighlightingConfiguration> bindHighlightingConfiguration() {
    return SiddhiHighlightingConfiguration.class;
  }
  
  public Class<? extends DefaultSemanticHighlightingCalculator> bindSemanticHighlightingConfiguration() {
    return SiddhiSemanticHighlightingCalculator.class;
  }
  
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<String>bind(String.class).annotatedWith(Names.named(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)).toInstance(",:");
  }
  
  public SiddhiUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
