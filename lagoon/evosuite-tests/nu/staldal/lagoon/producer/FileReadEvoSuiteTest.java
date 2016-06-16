/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.producer.FileRead;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FileReadEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileRead fileRead0 = new FileRead();
      // Undeclared exception!
      try {
        fileRead0.hasBeenUpdated((-1663L));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * No SourceManager avaliable
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FileRead fileRead0 = new FileRead();
      fileRead0.init();
      assertNull(fileRead0.getEntryName());
  }
}
