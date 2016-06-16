/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.datatransfer.DataFlavor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import javax.activation.DataSource;
import nu.staldal.xtree.XTreeXMLDataContentHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XTreeXMLDataContentHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      // Undeclared exception!
      try {
        xTreeXMLDataContentHandler0.getContent((DataSource) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      DataFlavor[] dataFlavorArray0 = xTreeXMLDataContentHandler0.getTransferDataFlavors();
      assertNotNull(dataFlavorArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(145);
      // Undeclared exception!
      try {
        xTreeXMLDataContentHandler0.writeTo((Object) xTreeXMLDataContentHandler0, "text/xml", (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * nu.staldal.xtree.XTreeXMLDataContentHandler cannot be cast to nu.staldal.xtree.Node
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try {
        xTreeXMLDataContentHandler0.writeTo((Object) xTreeXMLDataContentHandler0, "pa`5o/*jDl", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * nu.staldal.xtree.XTreeXMLDataContentHandler cannot be cast to nu.staldal.xtree.Node
         */
      }
  }
}