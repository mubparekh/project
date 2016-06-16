/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.Target;
import nu.staldal.lagoon.producer.LSSITransformer;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

@RunWith(EvoSuiteRunner.class)
public class LSSITransformerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LSSITransformer lSSITransformer0 = new LSSITransformer();
      lSSITransformer0.init();
      assertEquals(0, lSSITransformer0.getPosition());
  }

  @Test
  public void test1()  throws Throwable  {
      LSSITransformer lSSITransformer0 = new LSSITransformer();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      // Undeclared exception!
      try {
        lSSITransformer0.start((ContentHandler) defaultHandler2_0, (Target) null);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * No SourceManager avaliable
         */
      }
  }
}
