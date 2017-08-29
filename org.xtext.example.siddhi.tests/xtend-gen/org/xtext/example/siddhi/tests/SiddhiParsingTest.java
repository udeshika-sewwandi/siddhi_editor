/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.siddhi.siddhi.SiddhiQL;
import org.xtext.example.siddhi.tests.SiddhiInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(SiddhiInjectorProvider.class)
@SuppressWarnings("all")
public class SiddhiParsingTest {
  @Inject
  private ParseHelper<SiddhiQL> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final SiddhiQL result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
