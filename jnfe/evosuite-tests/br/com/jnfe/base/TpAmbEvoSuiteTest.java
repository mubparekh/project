/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpAmb;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TpAmbEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TpAmb tpAmb0 = TpAmb.PRODUCAO;
      String string0 = tpAmb0.getValueAsString();
      assertEquals("1", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TpAmb tpAmb0 = TpAmb.PRODUCAO;
      char char0 = tpAmb0.getValue();
      assertEquals('1', char0);
  }
}
