/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import nu.staldal.lagoon.util.ExpressionEvaluator;
import nu.staldal.lagoon.util.TemplateException;
import nu.staldal.lagoon.util.TemplateProcessor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TemplateProcessorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TemplateProcessor templateProcessor0 = new TemplateProcessor();
      assertNotNull(templateProcessor0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        TemplateProcessor.processTemplate('R', 'R', 'R', 'R', "?CT/", (ExpressionEvaluator) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * evaluator is null
         */
      }
  }
}
