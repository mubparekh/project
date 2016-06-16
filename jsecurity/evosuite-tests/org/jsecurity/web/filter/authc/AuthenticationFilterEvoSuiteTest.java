/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.web.filter.authc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.jsecurity.web.filter.authc.BasicHttpAuthenticationFilter;
import org.jsecurity.web.filter.authc.PassThruAuthenticationFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuthenticationFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PassThruAuthenticationFilter passThruAuthenticationFilter0 = new PassThruAuthenticationFilter();
      passThruAuthenticationFilter0.setSuccessUrl("9.-qsY?ja6&#DE");
      assertEquals("9.-qsY?ja6&#DE", passThruAuthenticationFilter0.getSuccessUrl());
  }

  @Test
  public void test1()  throws Throwable  {
      BasicHttpAuthenticationFilter basicHttpAuthenticationFilter0 = new BasicHttpAuthenticationFilter();
      // Undeclared exception!
      try {
        basicHttpAuthenticationFilter0.isAccessAllowed((ServletRequest) null, (ServletResponse) null, (Object) "/login.jsp");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PassThruAuthenticationFilter passThruAuthenticationFilter0 = new PassThruAuthenticationFilter();
      String string0 = passThruAuthenticationFilter0.getSuccessUrl();
      assertEquals("/index.jsp", string0);
      assertNotNull(string0);
  }
}