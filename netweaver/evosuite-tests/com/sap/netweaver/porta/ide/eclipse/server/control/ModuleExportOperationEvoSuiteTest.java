/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.ide.eclipse.server.control.ModuleExportOperation;
import org.eclipse.wst.server.core.IModule;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ModuleExportOperationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        ModuleExportOperation.createDataModel((IModule) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ModuleExportOperation moduleExportOperation0 = null;
      try {
        moduleExportOperation0 = new ModuleExportOperation((IModule) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * module must be EAR or WAR
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        ModuleExportOperation.createDataModelProvider((IModule) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * module must be EAR or WAR
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        ModuleExportOperation.getFileExtension((IModule) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * module must be EAR or WAR
         */
      }
  }
}