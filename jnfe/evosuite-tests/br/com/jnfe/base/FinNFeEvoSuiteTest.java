/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.FinNFe;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FinNFeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FinNFe finNFe0 = FinNFe.AJUSTE;
      char char0 = finNFe0.getValue();
      assertEquals('3', char0);
  }
}
