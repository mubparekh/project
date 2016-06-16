/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import nu.staldal.lagoon.core.SourceManager;
import nu.staldal.lagoon.core.Target;
import nu.staldal.lagoon.producer.LSSIHandler;
import org.junit.BeforeClass;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class LSSIHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      char[] charArray0 = new char[9];
      lSSIHandler0.ignorableWhitespace(charArray0, (int) '\u0084', (int) '\u0084');
  }

  @Test
  public void test1()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      lSSIHandler0.endDocument();
  }

  @Test
  public void test2()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      lSSIHandler0.startDocument();
  }

  @Test
  public void test3()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) treeSet0);
      lSSIHandler0.endPrefixMapping("");
  }

  @Test
  public void test4()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) linkedHashSet0);
      lSSIHandler0.skippedEntity("||Fdk(hXd+a=Wc2Q");
  }

  @Test
  public void test5()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) treeSet0);
      lSSIHandler0.startPrefixMapping("", "");
  }

  @Test
  public void test6()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) linkedHashSet0);
      Locator2Impl locator2Impl0 = new Locator2Impl();
      lSSIHandler0.setDocumentLocator((Locator) locator2Impl0);
      assertEquals(0, locator2Impl0.getLineNumber());
  }

  @Test
  public void test7()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      char[] charArray0 = new char[9];
      lSSIHandler0.characters(charArray0, (int) '\u0000', (int) '\u0000');
  }

  @Test
  public void test8()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      lSSIHandler0.processingInstruction("http://staldal.nu/Lagoon/LSSI", "http://staldal.nu/Lagoon/LSSI");
  }

  @Test
  public void test9()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      lSSIHandler0.startElement("include", "include", "include", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test10()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try {
        lSSIHandler0.startElement("http://staldal.nu/Lagoon/LSSI", "http://staldal.nu/Lagoon/LSSI", "http://staldal.nu/Lagoon/LSSI", (Attributes) attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      } catch(SAXParseException e) {
        /*
         * Unknown LSSI element: http://staldal.nu/Lagoon/LSSI
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try {
        lSSIHandler0.startElement("http://staldal.nu/Lagoon/LSSI", "include", "http://staldal.nu/Lagoon/LSSI", (Attributes) attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      } catch(SAXParseException e) {
        /*
         * lssi:include missing parameter
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      lSSIHandler0.startElement("http://staldal.nu/Lagoon/LSSI", "date", "date", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test13()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try {
        lSSIHandler0.startElement("http://staldal.nu/Lagoon/LSSI", "lastmod", "http://staldal.nu/Lagoon/LSSI", (Attributes) attributes2Impl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) treeSet0);
      lSSIHandler0.endElement("", "", "");
  }

  @Test
  public void test15()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      LSSIHandler lSSIHandler0 = new LSSIHandler((SourceManager) null, (ContentHandler) xMLFilterImpl0, (Target) null, (Set) null);
      lSSIHandler0.endElement("http://staldal.nu/Lagoon/LSSI", "http://staldal.nu/Lagoon/LSSI", "http://staldal.nu/Lagoon/LSSI");
  }
}
