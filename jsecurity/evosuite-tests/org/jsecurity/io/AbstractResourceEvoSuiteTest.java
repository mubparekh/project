/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import org.jsecurity.io.IniResource;
import org.jsecurity.io.ResourceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractResourceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.err;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) fileInputStream0);
      IniResource iniResource0 = new IniResource((InputStream) bufferedInputStream0);
      assertNull(iniResource0.getCharsetName());
  }

  @Test
  public void test1()  throws Throwable  {
      IniResource iniResource0 = null;
      try {
        iniResource0 = new IniResource("njOa86!");
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Unable to load text resource from the resource path [njOa86!]
         */
      }
  }
}
