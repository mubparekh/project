/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.ide.eclipse.server.runtime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime;
import com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime;
import java.io.File;
import org.eclipse.core.runtime.Status;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SapNWRuntimeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SapNW720Runtime sapNW720Runtime0 = new SapNW720Runtime();
      // Undeclared exception!
      try {
        sapNW720Runtime0.setCacheJars(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SapNW710Runtime sapNW710Runtime0 = new SapNW710Runtime();
      // Undeclared exception!
      try {
        sapNW710Runtime0.validateName("5FS(_-~");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/eclipse/core/internal/utils/Messages
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SapNW710Runtime sapNW710Runtime0 = new SapNW710Runtime();
      // Undeclared exception!
      try {
        sapNW710Runtime0.doesCacheJars();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SapNW720Runtime sapNW720Runtime0 = new SapNW720Runtime();
      // Undeclared exception!
      try {
        sapNW720Runtime0.getCacheLocation();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SapNW710Runtime sapNW710Runtime0 = new SapNW710Runtime();
      File file0 = new File("");
      Status status0 = (Status)sapNW710Runtime0.validateClasspath(file0);
      assertNotNull(status0);
      
      Status status1 = (Status)sapNW710Runtime0.validateClasspath(file0);
      assertNotNull(status1);
      assertEquals("Status ERROR: com.sap.netweaver.porta.ide.eclipse code=0 File does not exist: /j2ee/cluster/bin/ext/ec~java~jsf/lib/ec~java~jsf_api.jar null", status1.toString());
      assertSame(status1, status0);
  }
}
