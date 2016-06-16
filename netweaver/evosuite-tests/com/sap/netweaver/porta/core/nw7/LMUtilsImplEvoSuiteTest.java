/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEPSTATE;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEProcess;
import com.sap.netweaver.porta.core.ServerState;
import com.sap.netweaver.porta.core.nw7.LMUtilsImpl;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.xml.rpc.ServiceException;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LMUtilsImplEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      URL uRL0 = lMUtilsImpl0.getSAPControlWSUrlByInstance((String) null, 379);
      assertNotNull(uRL0);
      assertEquals("/SAPControl.cgi", uRL0.getPath());
  }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
          lMUtilsImpl0.getSAPControlWSProxy((URL) null);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test2()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      ServerState serverState0 = lMUtilsImpl0.determineServerState((J2EEProcess[]) null);
      assertEquals("Stopped", serverState0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[1];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[0] = j2EEProcess0;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.UNKNOWN, serverState0);
  }

  @Test
  public void test4()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[3] = j2EEProcess0;
      j2EEProcessArray0[4] = j2EEProcess0;
      j2EEProcessArray0[1] = j2EEProcessArray0[3];
      j2EEProcessArray0[2] = j2EEProcess0;
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[5] = j2EEProcess0;
      j2EEProcessArray0[6] = j2EEProcess0;
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcess0;
      j2EEProcessArray0[10] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value1;
      j2EEProcessArray0[11] = j2EEProcessArray0[4];
      j2EEProcessArray0[13] = j2EEProcessArray0[6];
      j2EEProcessArray0[15] = j2EEProcessArray0[8];
      j2EEProcessArray0[16] = j2EEProcessArray0[8];
      j2EEProcessArray0[12] = j2EEProcessArray0[2];
      j2EEProcessArray0[14] = j2EEProcess0;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE0, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2824, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[0] = j2EEProcess1;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.STOPPED, serverState0);
  }

  @Test
  public void test5()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[3] = j2EEProcess0;
      j2EEProcessArray0[4] = j2EEProcess0;
      j2EEProcessArray0[1] = j2EEProcessArray0[3];
      j2EEProcessArray0[2] = j2EEProcess0;
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[5] = j2EEProcess0;
      j2EEProcessArray0[6] = j2EEProcess0;
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcess0;
      j2EEProcessArray0[10] = j2EEProcess0;
      j2EEProcessArray0[11] = j2EEProcessArray0[4];
      j2EEProcessArray0[13] = j2EEProcessArray0[6];
      j2EEProcessArray0[15] = j2EEProcessArray0[8];
      j2EEProcessArray0[16] = j2EEProcessArray0[8];
      j2EEProcessArray0[12] = j2EEProcessArray0[2];
      j2EEProcessArray0[14] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value7;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE0, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2824, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[0] = j2EEProcess1;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.UNKNOWN, serverState0);
  }

  @Test
  public void test6()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[10] = j2EEProcess0;
      j2EEProcessArray0[12] = j2EEProcess0;
      j2EEProcessArray0[14] = j2EEProcess0;
      j2EEProcessArray0[15] = j2EEProcessArray0[7];
      j2EEProcessArray0[16] = j2EEProcess0;
      j2EEProcessArray0[0] = j2EEProcessArray0[7];
      j2EEProcessArray0[1] = j2EEProcess0;
      j2EEProcessArray0[2] = j2EEProcessArray0[0];
      j2EEProcessArray0[3] = j2EEProcessArray0[16];
      j2EEProcessArray0[4] = null;
      j2EEProcessArray0[5] = j2EEProcessArray0[3];
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value3;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2822, "J2EE Server", 2822, "J2EE Server", "dhV$", "dhV$", j2EEPSTATE0, "dhV$", "J2EE Server", "dhV$", 2822, 2822, "J2EE Server", "dhV$");
      j2EEProcessArray0[6] = j2EEProcess1;
      j2EEProcessArray0[4] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcessArray0[16];
      j2EEProcessArray0[11] = j2EEProcessArray0[3];
      j2EEProcessArray0[13] = j2EEProcess0;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.STARTING, serverState0);
  }

  @Test
  public void test7()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[0] = j2EEProcess0;
      j2EEProcessArray0[2] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value5;
      j2EEProcessArray0[1] = j2EEProcessArray0[2];
      j2EEProcessArray0[3] = j2EEProcess0;
      j2EEProcessArray0[4] = j2EEProcessArray0[2];
      j2EEProcessArray0[5] = j2EEProcess0;
      j2EEProcessArray0[6] = j2EEProcessArray0[1];
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[10] = j2EEProcess0;
      j2EEProcessArray0[12] = j2EEProcess0;
      j2EEProcessArray0[15] = j2EEProcess0;
      j2EEProcessArray0[16] = j2EEProcess0;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2820, "J2EE Server", 2820, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE0, "J2EE Server", "J2EE Server", "J2EE Server", 2820, 2820, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcessArray0[5];
      j2EEProcessArray0[11] = j2EEProcess1;
      j2EEProcessArray0[13] = j2EEProcess1;
      j2EEProcessArray0[14] = j2EEProcess0;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.STOPPING, serverState0);
  }

  @Test
  public void test8()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[3] = j2EEProcess0;
      j2EEProcessArray0[4] = j2EEProcess0;
      j2EEProcessArray0[1] = j2EEProcessArray0[3];
      j2EEProcessArray0[2] = j2EEProcess0;
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[5] = j2EEProcess0;
      j2EEProcessArray0[6] = j2EEProcess0;
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value1;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE0, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2870, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[11] = j2EEProcess1;
      j2EEProcessArray0[13] = j2EEProcess1;
      j2EEProcessArray0[14] = j2EEProcess0;
      j2EEProcessArray0[15] = j2EEProcess1;
      j2EEProcessArray0[16] = j2EEProcess1;
      j2EEProcessArray0[10] = j2EEProcess0;
      j2EEProcessArray0[12] = j2EEProcessArray0[2];
      J2EEPSTATE j2EEPSTATE1 = J2EEPSTATE.value7;
      J2EEProcess j2EEProcess2 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE1, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2824, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[0] = j2EEProcess2;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.UNKNOWN, serverState0);
  }

  @Test
  public void test9()  throws Throwable  {
      LMUtilsImpl lMUtilsImpl0 = new LMUtilsImpl();
      J2EEProcess[] j2EEProcessArray0 = new J2EEProcess[17];
      J2EEProcess j2EEProcess0 = new J2EEProcess();
      j2EEProcessArray0[2] = j2EEProcess0;
      j2EEProcessArray0[3] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE0 = J2EEPSTATE.value5;
      j2EEProcessArray0[1] = j2EEProcess0;
      j2EEProcessArray0[4] = j2EEProcess0;
      j2EEProcessArray0[5] = j2EEProcess0;
      j2EEProcessArray0[7] = j2EEProcess0;
      j2EEProcessArray0[8] = j2EEProcess0;
      j2EEProcessArray0[10] = j2EEProcess0;
      j2EEProcessArray0[12] = j2EEProcess0;
      j2EEProcessArray0[13] = j2EEProcess0;
      j2EEProcessArray0[15] = j2EEProcess0;
      j2EEProcessArray0[16] = j2EEProcess0;
      J2EEProcess j2EEProcess1 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE0, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2824, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[6] = j2EEProcess0;
      j2EEProcessArray0[9] = j2EEProcess1;
      j2EEProcessArray0[11] = j2EEProcess1;
      j2EEProcessArray0[14] = j2EEProcess0;
      J2EEPSTATE j2EEPSTATE1 = J2EEPSTATE.value7;
      J2EEProcess j2EEProcess2 = new J2EEProcess(2824, "J2EE Server", 2824, "J2EE Server", "J2EE Server", "J2EE Server", j2EEPSTATE1, "J2EE Server", "J2EE Server", "J2EE Server", 2824, 2824, "J2EE Server", "J2EE Server");
      j2EEProcessArray0[0] = j2EEProcess2;
      ServerState serverState0 = lMUtilsImpl0.determineServerState(j2EEProcessArray0);
      assertEquals(ServerState.UNKNOWN, serverState0);
  }
}
