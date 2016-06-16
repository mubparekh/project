/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xmlutil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import nu.staldal.xmlutil.ContentHandlerAdapter;
import org.junit.BeforeClass;
import org.xml.sax.AttributeList;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.AttributeListImpl;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoSuiteRunner.class)
public class ContentHandlerAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      contentHandlerAdapter0.startDocument();
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler0);
      char[] charArray0 = new char[18];
      contentHandlerAdapter0.ignorableWhitespace(charArray0, 16, 16);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler0);
      contentHandlerAdapter0.endDocument();
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler0);
      char[] charArray0 = new char[18];
      contentHandlerAdapter0.characters(charArray0, 16, 16);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      contentHandlerAdapter0.processingInstruction("S:AmC Y7}[M{", "S:AmC Y7}[M{");
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      contentHandlerAdapter0.setDocumentLocator((Locator) null);
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      AttributeListImpl attributeListImpl0 = new AttributeListImpl();
      attributeListImpl0.addAttribute("xmlns", "xmlns", "xmlns");
      contentHandlerAdapter0.startElement("xmlns", (AttributeList) attributeListImpl0);
      assertEquals(1, attributeListImpl0.getLength());
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      AttributeListImpl attributeListImpl0 = new AttributeListImpl();
      attributeListImpl0.addAttribute("xmlns:a%de`=2e{F$)", "xmlns", "xmlns");
      contentHandlerAdapter0.startElement("xmlns", (AttributeList) attributeListImpl0);
      assertEquals(1, attributeListImpl0.getLength());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler2_0);
      AttributeListImpl attributeListImpl0 = new AttributeListImpl();
      attributeListImpl0.addAttribute("S:AmC Y7}[M{", "S:AmC Y7}[M{", "S:AmC Y7}[M{");
      // Undeclared exception!
      try {
        contentHandlerAdapter0.startElement("S:AmC Y7}[M{", (AttributeList) attributeListImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerAdapter contentHandlerAdapter0 = new ContentHandlerAdapter((ContentHandler) defaultHandler0);
      // Undeclared exception!
      try {
        contentHandlerAdapter0.endElement("%[zT3!' !}BT");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }
}