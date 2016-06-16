/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.SimpleAuthorizingAccount;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.HashtableCache;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleAccountRealmEvoSuiteTest {

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
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("To*T8|");
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      HashtableCache hashtableCache0 = (HashtableCache)hashtableCacheManager0.getCache("To*T8|");
      simpleAccountRealm0.setAuthorizationCache((Cache) hashtableCache0);
      boolean boolean0 = simpleAccountRealm0.accountExists("To*T8|");
      assertEquals("To*T8|", simpleAccountRealm0.getName());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      // Undeclared exception!
      try {
        simpleAccountRealm0.addAccount("", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      // Undeclared exception!
      try {
        simpleAccountRealm0.hasRole((PrincipalCollection) simplePrincipalCollection0, "+2A|ofg\"}/-dz");
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      simpleAccountRealm0.afterAuthorizationCacheSet();
      boolean boolean0 = simpleAccountRealm0.roleExists("Sb");
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_39", simpleAccountRealm0.getName());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("To*T8|");
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      HashtableCache hashtableCache0 = (HashtableCache)hashtableCacheManager0.getCache("To*T8|");
      simpleAccountRealm0.setAuthorizationCache((Cache) hashtableCache0);
      String[] stringArray0 = new String[23];
      simpleAccountRealm0.addAccount("To*T8|", "To*T8|", stringArray0);
      boolean boolean0 = simpleAccountRealm0.accountExists("To*T8|");
      assertEquals("To*T8|", simpleAccountRealm0.getName());
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Set<String> set0 = SimpleAccountRealm.toSet((String) null, (String) null);
      assertNull(set0);
  }

  @Test
  public void test6()  throws Throwable  {
      Set<String> set0 = SimpleAccountRealm.toSet(",z*^r8|", ",z*^r8|");
      assertEquals(7, set0.size());
      assertNotNull(set0);
  }

  @Test
  public void test7()  throws Throwable  {
      Set<String> set0 = SimpleAccountRealm.toSet("", "");
      assertNull(set0);
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("To*T8|");
          HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
          HashtableCache hashtableCache0 = (HashtableCache)hashtableCacheManager0.getCache("To*T8|");
          simpleAccountRealm0.setAuthorizationCache((Cache) hashtableCache0);
          String[] stringArray0 = new String[23];
          simpleAccountRealm0.addAccount("To*T8|", "To*T8|", stringArray0);
          Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLocalHost();
          UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("To*T8|", "To*T8|", (InetAddress) inet4Address0);
          SimpleAuthorizingAccount simpleAuthorizingAccount0 = (SimpleAuthorizingAccount)simpleAccountRealm0.getAuthenticationInfo((AuthenticationToken) usernamePasswordToken0);
          assertNotNull(simpleAuthorizingAccount0);
          assertEquals("To*T8|", simpleAccountRealm0.getName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
