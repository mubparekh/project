/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.ModeloNFe;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ModeloNFeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ModeloNFe modeloNFe0 = ModeloNFe._55;
      String string0 = modeloNFe0.toString();
      assertNotNull(string0);
      assertEquals("55", string0);
  }
}
