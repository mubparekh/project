/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.xml.parsers.ParserConfigurationException;
import nu.staldal.lagoon.MyParser;
import org.junit.BeforeClass;
import org.xml.sax.SAXException;

@RunWith(EvoSuiteRunner.class)
public class MyParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MyParser myParser0 = new MyParser();
      boolean boolean0 = myParser0.parse("", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MyParser myParser0 = new MyParser();
      boolean boolean0 = myParser0.parse("", true);
      assertEquals(false, boolean0);
  }
}
