/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.nw7.FileUploaderImpl;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FileUploaderImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FileUploaderImpl fileUploaderImpl0 = new FileUploaderImpl("", 45);
      fileUploaderImpl0.setCredentials("", "");
      File[] fileArray0 = new File[1];
      // Undeclared exception!
      try {
        fileUploaderImpl0.upload(fileArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FileUploaderImpl fileUploaderImpl0 = new FileUploaderImpl("4", (-25));
      File[] fileArray0 = new File[12];
      try {
        fileUploaderImpl0.upload(fileArray0);
        fail("Expecting exception: NotAuthorizedException");
      } catch(NotAuthorizedException e) {
        /*
         * (401)Unauthorized
         */
      }
  }
}