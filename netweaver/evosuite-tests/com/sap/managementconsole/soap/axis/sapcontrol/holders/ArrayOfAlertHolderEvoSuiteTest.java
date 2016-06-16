/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol.holders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.Alert;
import com.sap.managementconsole.soap.axis.sapcontrol.holders.ArrayOfAlertHolder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArrayOfAlertHolderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Alert[] alertArray0 = new Alert[5];
      ArrayOfAlertHolder arrayOfAlertHolder0 = new ArrayOfAlertHolder(alertArray0);
      assertNotNull(arrayOfAlertHolder0);
  }

  @Test
  public void test1()  throws Throwable  {
      ArrayOfAlertHolder arrayOfAlertHolder0 = new ArrayOfAlertHolder();
      assertNotNull(arrayOfAlertHolder0);
  }
}