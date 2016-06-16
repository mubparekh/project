/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_KEY;
import net.sf.jniinchi.JniInchiException;
import net.sf.jniinchi.JniInchiOutputKey;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JniInchiOutputKeyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.INVALID_STD_INCHI;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "");
      String string0 = jniInchiOutputKey0.getKey();
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.OK;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "");
      INCHI_KEY iNCHI_KEY1 = jniInchiOutputKey0.getReturnStatus();
      assertEquals(0, iNCHI_KEY1.getIndx());
  }

  @Test
  public void test2()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(0, "");
      assertEquals("", jniInchiOutputKey0.getKey());
  }

  @Test
  public void test3()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(318, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Null return status
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.OK;
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Null InChIkey
         */
      }
  }
}