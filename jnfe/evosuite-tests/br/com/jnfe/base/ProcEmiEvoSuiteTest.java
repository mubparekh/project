/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.ProcEmi;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProcEmiEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProcEmi procEmi0 = ProcEmi.APLICATIVO_FISCO;
      char char0 = procEmi0.getValue();
      assertEquals('3', char0);
  }
}
