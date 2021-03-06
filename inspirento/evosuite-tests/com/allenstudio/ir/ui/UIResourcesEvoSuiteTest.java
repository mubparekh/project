/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.UIResources;
import java.util.MissingResourceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UIResourcesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        UIResources.getString("");
        fail("Expecting exception: MissingResourceException");
      } catch(MissingResourceException e) {
        /*
         * Can't find resource for bundle java.util.PropertyResourceBundle, key 
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      UIResources uIResources0 = new UIResources();
      assertNotNull(uIResources0);
  }
}
