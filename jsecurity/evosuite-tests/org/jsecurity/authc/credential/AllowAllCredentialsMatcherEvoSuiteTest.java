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
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.AllowAllCredentialsMatcher;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AllowAllCredentialsMatcherEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AllowAllCredentialsMatcher allowAllCredentialsMatcher0 = new AllowAllCredentialsMatcher();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null);
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      boolean boolean0 = allowAllCredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAuthenticationInfo0);
      assertEquals(true, boolean0);
  }
}