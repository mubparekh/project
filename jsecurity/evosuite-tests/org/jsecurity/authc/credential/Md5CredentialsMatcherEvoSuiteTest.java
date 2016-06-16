/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.Md5CredentialsMatcher;
import org.jsecurity.crypto.hash.Md5Hash;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class Md5CredentialsMatcherEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Md5CredentialsMatcher md5CredentialsMatcher0 = new Md5CredentialsMatcher();
      Md5Hash md5Hash0 = (Md5Hash)md5CredentialsMatcher0.newHashInstance();
      assertNotNull(md5Hash0);
  }

  @Test
  public void test1()  throws Throwable  {
      Md5CredentialsMatcher md5CredentialsMatcher0 = new Md5CredentialsMatcher();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false);
      // Undeclared exception!
      try {
        md5CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}