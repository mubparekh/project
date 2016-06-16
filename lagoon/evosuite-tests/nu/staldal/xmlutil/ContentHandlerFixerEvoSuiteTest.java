/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xmlutil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.BeforeClass;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class ContentHandlerFixerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      contentHandlerFixer0.endPrefixMapping(".jar");
  }

  @Test
  public void test1()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      contentHandlerFixer0.startDocument();
  }

  @Test
  public void test2()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      contentHandlerFixer0.skippedEntity(".jar");
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      char[] charArray0 = new char[8];
      contentHandlerFixer0.characters(charArray0, (-898), (int) '\u0000');
  }

  @Test
  public void test4()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLFilterImpl0, false);
      contentHandlerFixer0.endDocument();
  }

  @Test
  public void test5()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      char[] charArray0 = new char[5];
      contentHandlerFixer0.ignorableWhitespace(charArray0, (int) '{', (int) '\u0000');
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      contentHandlerFixer0.processingInstruction("", "");
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0);
      contentHandlerFixer0.setDocumentLocator((Locator) locator2Impl0);
      assertNull(locator2Impl0.getPublicId());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      attributesImpl0.addAttribute("O|*san ", ",", "", "", "O|*san ");
      contentHandlerFixer0.startElement(",", ",", ",", (Attributes) attributesImpl0);
      assertEquals(1, attributesImpl0.getLength());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, false);
      contentHandlerFixer0.startPrefixMapping("", "O|*?LJau3F");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      contentHandlerFixer0.startElement("O|*?LJau3F", "", "", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test10()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLFilterImpl0, false);
      contentHandlerFixer0.startPrefixMapping(">,_b}wjQSY?-4R8~", ">,_b}wjQSY?-4R8~");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      contentHandlerFixer0.startElement(">,_b}wjQSY?-4R8~", ">,_b}wjQSY?-4R8~", (String) null, (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      contentHandlerFixer0.startPrefixMapping("", ",");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      contentHandlerFixer0.startElement("", "", "", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test12()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      ContentHandlerFixer contentHandlerFixer1 = new ContentHandlerFixer((ContentHandler) contentHandlerFixer0, true, true);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      contentHandlerFixer1.startPrefixMapping("", "");
      contentHandlerFixer1.startElement("", "", "", (Attributes) attributesImpl0);
      assertEquals(0, attributesImpl0.getLength());
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      attributesImpl0.addAttribute("", "O*s-F ", "", "", "");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      contentHandlerFixer0.startElement("", "", "", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  @Test
  public void test14()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLReaderAdapter0);
      ContentHandlerFixer contentHandlerFixer1 = new ContentHandlerFixer((ContentHandler) contentHandlerFixer0, true, true);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      attributesImpl0.addAttribute(".jar", "", "", ".jar", "");
      contentHandlerFixer1.startElement("", "", "", (Attributes) attributesImpl0);
      assertFalse(contentHandlerFixer1.equals(contentHandlerFixer0));
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      attributesImpl0.addAttribute("O|*san ", ",", "", "", "O|*san ");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      contentHandlerFixer0.startElement("O|*san ", ",", "", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler0, false);
      // Undeclared exception!
      try {
        contentHandlerFixer0.endElement("q<`F!W+IxIg33*I", "q<`F!W+IxIg33*I", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * No prefix for q<`F!W+IxIg33*I
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler0, true);
      // Undeclared exception!
      try {
        contentHandlerFixer0.endElement("0`ybu9W.f#PmU", "0`ybu9W.f#PmU", "0`ybu9W.f#PmU");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, true, true);
      // Undeclared exception!
      try {
        contentHandlerFixer0.endElement("", "", "");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) xMLFilterImpl0, false);
      contentHandlerFixer0.startPrefixMapping(">,_b}wjQSY?-4R8~", ">,_b}wjQSY?-4R8~");
      contentHandlerFixer0.endElement(">,_b}wjQSY?-4R8~", ">,_b}wjQSY?-4R8~", (String) null);
  }

  @Test
  public void test20()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, false);
      // Undeclared exception!
      try {
        contentHandlerFixer0.endElement("", "", "");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0, false);
      contentHandlerFixer0.startPrefixMapping("", "O|*?LJau3F");
      // Undeclared exception!
      try {
        contentHandlerFixer0.endElement("", "", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * No prefix for 
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler2_0);
      contentHandlerFixer0.startPrefixMapping("", "W+8pY-\"_ {");
      contentHandlerFixer0.endElement("W+8pY-\"_ {", "W+8pY-\"_ {", "");
  }

  @Test
  public void test23()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerFixer contentHandlerFixer0 = new ContentHandlerFixer((ContentHandler) defaultHandler0, true);
      contentHandlerFixer0.startPrefixMapping("0`ybu9W.f#PmU", "0`ybu9W.f#PmU");
      contentHandlerFixer0.startPrefixMapping("0`ybu9W.f#PmU", "0`ybu9W.f#PmU");
  }
}