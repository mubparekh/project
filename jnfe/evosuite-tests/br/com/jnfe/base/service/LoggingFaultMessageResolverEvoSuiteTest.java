/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.service.LoggingFaultMessageResolver;
import java.io.IOException;
import org.junit.BeforeClass;
import org.springframework.ws.WebServiceMessage;

@RunWith(EvoSuiteRunner.class)
public class LoggingFaultMessageResolverEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LoggingFaultMessageResolver loggingFaultMessageResolver0 = null;
      try {
        loggingFaultMessageResolver0 = new LoggingFaultMessageResolver();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.LoggingFaultMessageResolver
         */
      }
  }
}
