/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.ServerState;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServerStateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ServerState serverState0 = ServerState.UNKNOWN;
      String string0 = serverState0.toString();
      assertEquals("Unknown", string0);
  }
}