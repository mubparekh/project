/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.subject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.crypto.Cipher;
import org.jsecurity.io.SerializationException;
import org.jsecurity.io.Serializer;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.web.WebRememberMeManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractRememberMeManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setEncryptionCipherKeyBase64("");
      assertNull(webRememberMeManager0.getCookiePath());
  }

  @Test
  public void test1()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setDecryptionCipherKeyBase64("");
      assertNull(webRememberMeManager0.getCookiePath());
  }

  @Test
  public void test2()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("kvaBO_{t'8G}T*,", "kvaBO_{t'8G}T*,");
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) usernamePasswordToken0, (Object) "", "");
      // Undeclared exception!
      try {
        webRememberMeManager0.rememberIdentity((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class javax.crypto.SunJCE_h
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      // Undeclared exception!
      try {
        webRememberMeManager0.setEncryptionCipherKeyHex("use_tccl");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter u at index 0
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setDecryptionCipherKeyHex("");
      assertEquals("rememberMe", webRememberMeManager0.getCookieName());
  }

  @Test
  public void test5()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCipherKeyBase64("");
      assertEquals(false, webRememberMeManager0.isCookieSecure());
  }

  @Test
  public void test6()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Z&jqQ]X", "Z&jqQ]X");
      // Undeclared exception!
      try {
        webRememberMeManager0.onFailedLogin((AuthenticationToken) usernamePasswordToken0, (AuthenticationException) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      byte[] byteArray0 = webRememberMeManager0.getCipherKey();
      assertNull(byteArray0);
  }

  @Test
  public void test8()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try {
        webRememberMeManager0.deserialize(byteArray0);
        fail("Expecting exception: SerializationException");
      } catch(SerializationException e) {
        /*
         * Unable to deserialze argument byte array.
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      // Undeclared exception!
      try {
        webRememberMeManager0.onLogout((PrincipalCollection) simplePrincipalCollection0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setSerializer((Serializer) null);
      assertEquals(false, webRememberMeManager0.isCookieSecure());
  }

  @Test
  public void test11()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCipherKeyHex("");
      assertEquals("rememberMe", webRememberMeManager0.getCookieName());
  }

  @Test
  public void test12()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      boolean boolean0 = webRememberMeManager0.isRememberMe((AuthenticationToken) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("K83piFwv", charArray0, false);
      boolean boolean0 = webRememberMeManager0.isRememberMe((AuthenticationToken) usernamePasswordToken0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("8", "8", true);
      boolean boolean0 = webRememberMeManager0.isRememberMe((AuthenticationToken) usernamePasswordToken0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("verrides]filp aP '", "verrides]filp aP '");
      webRememberMeManager0.setCipher((Cipher) null);
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) usernamePasswordToken0, (Object) "", "verrides]filp aP '");
      // Undeclared exception!
      try {
        webRememberMeManager0.rememberIdentity((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      // Undeclared exception!
      try {
        webRememberMeManager0.getRememberedPrincipals();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCipher((Cipher) null);
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = webRememberMeManager0.encrypt(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test18()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCipher((Cipher) null);
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = webRememberMeManager0.decrypt(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test
  public void test19()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      // Undeclared exception!
      try {
        webRememberMeManager0.decrypt((byte[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class javax.crypto.SunJCE_h
         */
      }
  }
}
