/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.PluginManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PluginManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PluginManager.getInstance();
  }
}
