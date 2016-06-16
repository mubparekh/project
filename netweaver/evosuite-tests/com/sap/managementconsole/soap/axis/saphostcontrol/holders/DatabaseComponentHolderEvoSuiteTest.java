/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.saphostcontrol.holders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.saphostcontrol.DatabaseComponent;
import com.sap.managementconsole.soap.axis.saphostcontrol.DatabaseStatus;
import com.sap.managementconsole.soap.axis.saphostcontrol.Property;
import com.sap.managementconsole.soap.axis.saphostcontrol.holders.DatabaseComponentHolder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseComponentHolderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Property[] propertyArray0 = new Property[5];
      DatabaseComponent databaseComponent0 = new DatabaseComponent(propertyArray0, (DatabaseStatus) null);
      DatabaseComponentHolder databaseComponentHolder0 = new DatabaseComponentHolder(databaseComponent0);
      assertNotNull(databaseComponentHolder0);
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseComponentHolder databaseComponentHolder0 = new DatabaseComponentHolder();
      assertNotNull(databaseComponentHolder0);
  }
}
