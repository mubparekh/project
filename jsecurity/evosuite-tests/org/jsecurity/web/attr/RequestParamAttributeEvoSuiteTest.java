/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.web.attr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.jsecurity.web.attr.AbstractWebAttribute;
import org.jsecurity.web.attr.RequestParamAttribute;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RequestParamAttributeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RequestParamAttribute<Integer> requestParamAttribute0 = new RequestParamAttribute<Integer>("o*T2^vF:z&OYca");
      // Undeclared exception!
      try {
        requestParamAttribute0.onStoreValue((Integer) null, (ServletRequest) null, (ServletResponse) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * RequestParamStores are read-only.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RequestParamAttribute<AbstractWebAttribute<Integer>> requestParamAttribute0 = new RequestParamAttribute<AbstractWebAttribute<Integer>>();
      // Undeclared exception!
      try {
        requestParamAttribute0.onRetrieveValue((ServletRequest) null, (ServletResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RequestParamAttribute<AbstractWebAttribute<Integer>> requestParamAttribute0 = new RequestParamAttribute<AbstractWebAttribute<Integer>>();
      requestParamAttribute0.removeValue((ServletRequest) null, (ServletResponse) null);
      assertEquals(false, requestParamAttribute0.isCheckRequestParams());
      assertEquals(false, requestParamAttribute0.isMutable());
  }
}
