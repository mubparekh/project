/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authz.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.authz.aop.AuthenticatedAnnotationMethodInterceptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuthenticatedAnnotationMethodInterceptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AuthenticatedAnnotationMethodInterceptor authenticatedAnnotationMethodInterceptor0 = new AuthenticatedAnnotationMethodInterceptor();
  }
}
