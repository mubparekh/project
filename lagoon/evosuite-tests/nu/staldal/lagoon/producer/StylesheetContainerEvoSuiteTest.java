/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import nu.staldal.lagoon.producer.StylesheetContainer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StylesheetContainerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StylesheetContainer stylesheetContainer0 = new StylesheetContainer(false);
      assertEquals(false, stylesheetContainer0.executeDynamic);
      assertEquals(false, stylesheetContainer0.compileDynamic);
  }
}