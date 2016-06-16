/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.producer.DirSource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DirSourceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DirSource dirSource0 = new DirSource();
      // Undeclared exception!
      try {
        dirSource0.init();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
