/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.web.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.servlet.ServletContext;
import org.jsecurity.web.servlet.ServletContextSupport;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServletContextSupportEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      // Undeclared exception!
      try {
        servletContextSupport0.getContextInitParam("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      servletContextSupport0.setServletContext((ServletContext) null);
  }

  @Test
  public void test2()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      // Undeclared exception!
      try {
        servletContextSupport0.removeAttribute("jI");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * ServletContext property must be set via the setServletContext method.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      // Undeclared exception!
      try {
        servletContextSupport0.setAttribute("@T-8Vsgaqc", "@T-8Vsgaqc");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * ServletContext property must be set via the setServletContext method.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      // Undeclared exception!
      try {
        servletContextSupport0.bind("ServletContext property must be set via the setServletContext method.", "ServletContext property must be set via the setServletContext method.", "ServletContext property must be set via the setServletContext method.");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * ServletContext property must be set via the setServletContext method.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ServletContextSupport servletContextSupport0 = new ServletContextSupport();
      // Undeclared exception!
      try {
        servletContextSupport0.bind((String) null, (String) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * null argument cannot be null.
         */
      }
  }
}
