/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.engine.services.dc.wsgate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.engine.services.dc.wsgate.DeployResult;
import com.sap.engine.services.dc.wsgate.UndeployResponse;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UndeployResponseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TypeDesc typeDesc0 = UndeployResponse.getTypeDesc();
      assertNotNull(typeDesc0);
      
      DeployResult deployResult0 = new DeployResult();
      UndeployResponse undeployResponse0 = new UndeployResponse(deployResult0);
      boolean boolean0 = undeployResponse0.equals((Object) typeDesc0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      UndeployResponse undeployResponse0 = new UndeployResponse();
      int int0 = undeployResponse0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = UndeployResponse.class;
      QName qName0 = new QName("1b}");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)UndeployResponse.getDeserializer("1b}", (Class) class0, qName0);
      assertEquals(false, beanDeserializer0.componentsReady());
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = UndeployResponse.class;
      QName qName0 = new QName("1b}");
      BeanSerializer beanSerializer0 = (BeanSerializer)UndeployResponse.getSerializer("1b}", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test4()  throws Throwable  {
      UndeployResponse undeployResponse0 = new UndeployResponse();
      Application[] applicationArray0 = new Application[3];
      DeployResult deployResult0 = new DeployResult(applicationArray0, "1b}", "1b}");
      UndeployResponse undeployResponse1 = new UndeployResponse(deployResult0);
      boolean boolean0 = undeployResponse0.equals((Object) undeployResponse1);
      assertEquals(false, boolean0);
      assertFalse(undeployResponse1.equals(undeployResponse0));
  }

  @Test
  public void test5()  throws Throwable  {
      UndeployResponse undeployResponse0 = new UndeployResponse();
      Application[] applicationArray0 = new Application[3];
      DeployResult deployResult0 = new DeployResult(applicationArray0, "1b}", "1b}");
      UndeployResponse undeployResponse1 = new UndeployResponse(deployResult0);
      assertFalse(undeployResponse1.equals(undeployResponse0));
      
      undeployResponse0.set_return(deployResult0);
      boolean boolean0 = undeployResponse0.equals((Object) undeployResponse1);
      assertTrue(undeployResponse1.equals(undeployResponse0));
      assertTrue(undeployResponse0.equals(undeployResponse1));
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      UndeployResponse undeployResponse0 = new UndeployResponse();
      UndeployResponse undeployResponse1 = new UndeployResponse();
      boolean boolean0 = undeployResponse1.equals((Object) undeployResponse0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      UndeployResponse undeployResponse0 = new UndeployResponse();
      Application[] applicationArray0 = new Application[3];
      DeployResult deployResult0 = new DeployResult(applicationArray0, "1b}", "1b}");
      UndeployResponse undeployResponse1 = new UndeployResponse();
      assertTrue(undeployResponse1.equals(undeployResponse0));
      
      undeployResponse0.set_return(deployResult0);
      boolean boolean0 = undeployResponse0.equals((Object) undeployResponse1);
      assertFalse(undeployResponse0.equals(undeployResponse1));
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      DeployResult deployResult0 = new DeployResult();
      UndeployResponse undeployResponse0 = new UndeployResponse(deployResult0);
      int int0 = undeployResponse0.hashCode();
      assertEquals(2, int0);
  }
}