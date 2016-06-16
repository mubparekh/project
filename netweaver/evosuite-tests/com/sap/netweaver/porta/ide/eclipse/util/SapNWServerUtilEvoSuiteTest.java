/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.ide.eclipse.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleType;
import org.eclipse.wst.server.core.internal.DeletedModule;
import org.eclipse.wst.server.core.internal.ModuleType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SapNWServerUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SapNWServerUtil sapNWServerUtil0 = new SapNWServerUtil();
      assertNotNull(sapNWServerUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      ModuleType moduleType0 = ModuleType.getModuleType("jst.web", "jst.web");
      DeletedModule deletedModule0 = new DeletedModule("jst.web", "jst.web", (IModuleType) moduleType0);
      IModule[] iModuleArray0 = new IModule[6];
      iModuleArray0[0] = (IModule) deletedModule0;
      boolean boolean0 = SapNWServerUtil.areAllDeployableModules(iModuleArray0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ModuleType moduleType0 = new ModuleType("jst.ear", "jst.ear");
      DeletedModule deletedModule0 = new DeletedModule("jst.ear", "jst.ear", (IModuleType) moduleType0);
      boolean boolean0 = SapNWServerUtil.isDeployableModule((IModule) deletedModule0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      ModuleType moduleType0 = ModuleType.getModuleType("jst.web", "jst.web");
      DeletedModule deletedModule0 = new DeletedModule("jst.web", "jst.web", (IModuleType) moduleType0);
      IModule[] iModuleArray0 = new IModule[6];
      iModuleArray0[0] = (IModule) deletedModule0;
      iModuleArray0[1] = (IModule) deletedModule0;
      iModuleArray0[2] = (IModule) deletedModule0;
      iModuleArray0[3] = (IModule) deletedModule0;
      iModuleArray0[4] = (IModule) deletedModule0;
      iModuleArray0[5] = (IModule) deletedModule0;
      boolean boolean0 = SapNWServerUtil.areAllDeployableModules(iModuleArray0);
      assertEquals(true, boolean0);
  }
}