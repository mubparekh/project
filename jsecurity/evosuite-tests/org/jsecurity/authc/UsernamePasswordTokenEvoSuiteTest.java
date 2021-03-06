/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UsernamePasswordTokenEvoSuiteTest {

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
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, charArray0, false);
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test1()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getCredentials();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test2()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jA>N$J\u0000\nQ`zWY%Aw", "jA>N$J\u0000\nQ`zWY%Aw");
      usernamePasswordToken0.setUsername("jA>N$J\u0000\nQ`zWY%Aw");
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - jA>N$J\u0000\nQ`zWY%Aw, rememberMe=false", usernamePasswordToken0.toString());
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test3()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jA>N$J\u0000\nQ`zWY%Aw", "jA>N$J\u0000\nQ`zWY%Aw");
      char[] charArray0 = new char[2];
      usernamePasswordToken0.setPassword(charArray0);
      assertEquals(false, usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - jA>N$J\u0000\nQ`zWY%Aw, rememberMe=false", usernamePasswordToken0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getPrincipal();
      assertEquals(false, usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[1];
      Inet4Address inet4Address0 = (Inet4Address)InetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, (InetAddress) inet4Address0);
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test6()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLocalHost();
          UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", (InetAddress) inet4Address0);
          usernamePasswordToken0.setRememberMe(false);
          assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (localhost/127.0.0.1)", usernamePasswordToken0.toString());
          assertEquals(false, usernamePasswordToken0.isRememberMe());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test8()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.getInetAddress();
      assertEquals(false, usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[3];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jA>N$J\u0000\nQ`zWY%Aw", charArray0);
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      assertEquals(false, usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jA>N$J\u0000\nQ`zWY%Aw", "jA>N$J\u0000\nQ`zWY%Aw");
      usernamePasswordToken0.clear();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", usernamePasswordToken0.toString());
      assertEquals(false, usernamePasswordToken0.isRememberMe());
  }

  @Test
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertNotNull(string0);
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  @Test
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          char[] charArray0 = new char[3];
          Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLocalHost();
          UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("lT-^!)fY", charArray0, false, (InetAddress) inet4Address0);
          String string0 = usernamePasswordToken0.toString();
          assertEquals("org.jsecurity.authc.UsernamePasswordToken - lT-^!)fY, rememberMe=false (localhost/127.0.0.1)", string0);
          assertNotNull(string0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
