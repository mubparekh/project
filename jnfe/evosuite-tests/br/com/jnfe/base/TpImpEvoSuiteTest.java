/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpImp;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TpImpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TpImp tpImp0 = TpImp.RETRATO;
      char char0 = tpImp0.getValue();
      assertEquals('1', char0);
  }
}
