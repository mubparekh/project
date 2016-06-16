/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Md2Hash;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Md2HashEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "\u0005@\u0001\uFFFD", (Object) "\u0005@\u0001\uFFFD");
      assertEquals("CmYB5i4o/ZZ4Qa7XIf5ggA==", md2Hash0.toBase64());
  }

  @Test
  public void test1()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromBase64String("");
      assertEquals("", md2Hash0.toHex());
  }

  @Test
  public void test2()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromHexString("B7");
      assertEquals("b7", md2Hash0.toHex());
  }
}