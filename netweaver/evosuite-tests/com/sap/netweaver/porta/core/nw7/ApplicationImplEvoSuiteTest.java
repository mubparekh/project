/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.netweaver.porta.core.nw7.ApplicationImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ApplicationImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Application application0 = new Application("2f", "2f", "2f", "2f", "2f", "");
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      String string0 = applicationImpl0.getId();
      assertEquals("2f", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Application application0 = new Application();
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      Application application1 = applicationImpl0.getProxy();
      assertNull(application1.getVendor());
  }

  @Test
  public void test2()  throws Throwable  {
      Application application0 = new Application("2f", "2f", "2f", "2f", "2f", "");
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      String string0 = applicationImpl0.getVendor();
      assertEquals("2f", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Application application0 = new Application();
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      // Undeclared exception!
      try {
        applicationImpl0.getStatus();
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Application application0 = new Application("false", "false", "false", "false", "false", "false");
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      int int0 = applicationImpl0.hashCode();
      assertEquals(97196323, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      Application application0 = new Application("false", "false", "false", "false", "false", "false");
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      String string0 = applicationImpl0.getName();
      assertEquals("false", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Application application0 = new Application();
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      String string0 = applicationImpl0.getVersion();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Application application0 = new Application();
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      String string0 = applicationImpl0.getLocation();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Application application0 = new Application();
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      boolean boolean0 = applicationImpl0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      Application application0 = new Application("2f", "2f", "2f", "2f", "2f", "");
      ApplicationImpl applicationImpl0 = new ApplicationImpl(application0);
      boolean boolean0 = applicationImpl0.equals((Object) applicationImpl0);
      assertEquals(true, boolean0);
  }
}
