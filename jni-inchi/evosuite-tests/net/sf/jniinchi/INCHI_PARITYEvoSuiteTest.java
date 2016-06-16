/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_PARITY;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class INCHI_PARITYEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.EVEN;
      int int0 = iNCHI_PARITY0.getIndx();
      assertEquals(2, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.getValue(0);
      assertEquals(INCHI_PARITY.NONE, iNCHI_PARITY0);
  }

  @Test
  public void test2()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.getValue(2);
      assertEquals(INCHI_PARITY.EVEN, iNCHI_PARITY0);
  }

  @Test
  public void test3()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.getValue(1);
      assertEquals(INCHI_PARITY.ODD, iNCHI_PARITY0);
  }

  @Test
  public void test4()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.getValue(3);
      assertEquals(INCHI_PARITY.UNKNOWN, iNCHI_PARITY0);
  }

  @Test
  public void test5()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.getValue(4);
      assertEquals(INCHI_PARITY.UNDEFINED, iNCHI_PARITY0);
  }

  @Test
  public void test6()  throws Throwable  {
      INCHI_PARITY.getValue((-1042));
  }
}