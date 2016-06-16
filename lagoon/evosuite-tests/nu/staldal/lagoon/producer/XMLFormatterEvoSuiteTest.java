/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.Target;
import nu.staldal.lagoon.producer.XMLFormatter;
import org.junit.BeforeClass;
import org.xml.sax.SAXException;

@RunWith(EvoSuiteRunner.class)
public class XMLFormatterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLFormatter xMLFormatter0 = new XMLFormatter();
      // Undeclared exception!
      try {
        xMLFormatter0.hasBeenUpdated(59977L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XMLFormatter xMLFormatter0 = new XMLFormatter();
      // Undeclared exception!
      try {
        xMLFormatter0.start((OutputStream) null, (Target) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XMLFormatter xMLFormatter0 = new XMLFormatter();
      xMLFormatter0.init();
      assertNull(xMLFormatter0.getEntryName());
  }
}