/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.pl006.RequestAdapterImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractNFeAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RequestAdapterImpl requestAdapterImpl0 = null;
      try {
        requestAdapterImpl0 = new RequestAdapterImpl();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.pl006.RequestAdapterImpl
         */
      }
  }
}
