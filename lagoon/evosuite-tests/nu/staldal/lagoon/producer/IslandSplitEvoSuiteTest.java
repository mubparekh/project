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
import nu.staldal.lagoon.producer.IslandSplit;
import org.junit.BeforeClass;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoSuiteRunner.class)
public class IslandSplitEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try {
        islandSplit0.characters(charArray0, (int) '!', (int) '\u0000');
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.skippedEntity("3N E;Ov62");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.endDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      islandSplit0.endPrefixMapping("");
      assertNull(islandSplit0.getEntryName());
  }

  @Test
  public void test4()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.processingInstruction("MP0", "MP0");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try {
        islandSplit0.ignorableWhitespace(charArray0, (int) 'z', (int) 'z');
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.startPrefixMapping(";gM[h;<:qC[BlFEc6&", ";gM[h;<:qC[BlFEc6&");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.hasBeenUpdated(1879L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.startDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.setDocumentLocator((Locator) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      islandSplit0.init();
      // Undeclared exception!
      try {
        islandSplit0.startElement("oo1", "oo1", "oo1", (Attributes) attributesImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}