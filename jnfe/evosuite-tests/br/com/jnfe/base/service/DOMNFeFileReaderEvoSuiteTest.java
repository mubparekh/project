/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.service.DOMNFeFileReader;
import br.com.jnfe.base.service.DOMNFeSignatureHandler;
import br.com.jnfe.base.service.SignatureHandler;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DOMNFeFileReaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DOMNFeFileReader dOMNFeFileReader0 = new DOMNFeFileReader();
      DocumentBuilderFactoryImpl documentBuilderFactoryImpl0 = (DocumentBuilderFactoryImpl)DocumentBuilderFactory.newInstance();
      dOMNFeFileReader0.setDocumentBuilderFactory((DocumentBuilderFactory) documentBuilderFactoryImpl0);
      assertEquals(false, documentBuilderFactoryImpl0.isValidating());
  }

  @Test
  public void test1()  throws Throwable  {
      DOMNFeFileReader dOMNFeFileReader0 = new DOMNFeFileReader();
      DOMNFeSignatureHandler dOMNFeSignatureHandler0 = null;
      try {
        dOMNFeSignatureHandler0 = new DOMNFeSignatureHandler();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class br.com.jnfe.base.service.DOMNFeSignatureHandler
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DOMNFeFileReader dOMNFeFileReader0 = new DOMNFeFileReader();
      try {
        dOMNFeFileReader0.loadAndSign("vS7A!", "vS7A!");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * class path resource [vS7A!] cannot be opened because it does not exist
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DOMNFeFileReader dOMNFeFileReader0 = new DOMNFeFileReader();
      try {
        dOMNFeFileReader0.loadAndSign((InputStream) null, "'S$.zF");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
