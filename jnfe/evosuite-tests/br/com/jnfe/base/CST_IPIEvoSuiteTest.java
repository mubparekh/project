/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.CST_IPI;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CST_IPIEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_04;
      String string0 = cST_IPI0.getValue();
      assertEquals("04", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_51;
      String string0 = cST_IPI0.getDesc();
      assertEquals("Sa\u00EDda tributada com al\u00EDquota zero", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_04;
      boolean boolean0 = cST_IPI0.isIsento();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_04;
      String string0 = cST_IPI0.getGroup();
      assertEquals("NT", string0);
  }
}