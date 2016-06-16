/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.codec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.codec.Hex;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HexEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Hex hex0 = new Hex();
      assertNotNull(hex0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      try {
        Hex.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter \u0000 at index 0
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Hex.encodeToString(byteArray0);
      assertNotNull(string0);
      assertEquals("00000000000000", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try {
        Hex.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = Hex.decode("");
      assertNotNull(byteArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = Hex.toDigit('5', 1);
      assertEquals(5, int0);
  }
}
