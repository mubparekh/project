/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.snippets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.AuthenticationRefusedException;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.Credentials;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SnippetUseDeployManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.INVALID_CREDENTIALS;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertEquals("<pass>", credentials0.getPassword());
  }

  @Test
  public void test1()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertEquals("<pass>", credentials0.getPassword());
  }

  @Test
  public void test2()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.PERMISSION_DENIED;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertNull(credentials0);
  }
}