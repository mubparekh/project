/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.service.SecurityCallBack;
import br.com.jnfe.base.service.SimpleSecurityHandlerBean;
import org.apache.xalan.processor.ProcessorImport;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class SimpleSecurityHandlerBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleSecurityHandlerBean simpleSecurityHandlerBean0 = null;
      try {
        simpleSecurityHandlerBean0 = new SimpleSecurityHandlerBean();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.SimpleSecurityHandlerBean
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleSecurityHandlerBean simpleSecurityHandlerBean0 = null;
      try {
        simpleSecurityHandlerBean0 = new SimpleSecurityHandlerBean("#]jms&?uNqx%yc", "#]jms&?uNqx%yc");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.SimpleSecurityHandlerBean
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleSecurityHandlerBean simpleSecurityHandlerBean0 = null;
      try {
        simpleSecurityHandlerBean0 = new SimpleSecurityHandlerBean("#]jms&?uNqx%yc", "#]jms&?uNqx%yc");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.SimpleSecurityHandlerBean
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleSecurityHandlerBean simpleSecurityHandlerBean0 = null;
      try {
        simpleSecurityHandlerBean0 = new SimpleSecurityHandlerBean();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.SimpleSecurityHandlerBean
         */
      }
  }
}