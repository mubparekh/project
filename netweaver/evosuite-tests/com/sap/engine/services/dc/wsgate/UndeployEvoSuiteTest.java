/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.engine.services.dc.wsgate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.engine.services.dc.wsgate.Option;
import com.sap.engine.services.dc.wsgate.Undeploy;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UndeployEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Option[] optionArray0 = new Option[1];
      Option option0 = new Option((Object) optionArray0, (Object) optionArray0);
      // Undeclared exception!
      try {
        undeploy0.setOptions((-13), option0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TypeDesc typeDesc0 = Undeploy.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test2()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      // Undeclared exception!
      try {
        undeploy0.getOptions(1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = Undeploy.class;
      QName qName0 = QName.valueOf("<}cgOD|`v:F");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)Undeploy.getDeserializer("<}cgOD|`v:F", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanDeserializer0.getMechanismType());
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = Class.class;
      QName qName0 = new QName("uY02P");
      BeanSerializer beanSerializer0 = (BeanSerializer)Undeploy.getSerializer("uY02P", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test5()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      // Undeclared exception!
      try {
        undeploy0.getApps((-831));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      // Undeclared exception!
      try {
        undeploy0.setApps(2, (Application) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Application[] applicationArray0 = new Application[5];
      undeploy0.setApps(applicationArray0);
      Undeploy undeploy1 = new Undeploy(applicationArray0, (Option[]) null);
      boolean boolean0 = undeploy0.equals((Object) undeploy1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Object object0 = new Object();
      boolean boolean0 = undeploy0.equals(object0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Option[] optionArray0 = new Option[1];
      Undeploy undeploy1 = new Undeploy((Application[]) null, optionArray0);
      boolean boolean0 = undeploy0.equals((Object) undeploy1);
      assertFalse(undeploy1.equals(undeploy0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Undeploy undeploy1 = new Undeploy((Application[]) null, (Option[]) null);
      assertTrue(undeploy1.equals(undeploy0));
      
      Application[] applicationArray0 = new Application[5];
      undeploy1.setApps(applicationArray0);
      boolean boolean0 = undeploy1.equals((Object) undeploy0);
      assertFalse(undeploy1.equals(undeploy0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Application[] applicationArray0 = new Application[4];
      Undeploy undeploy1 = new Undeploy(applicationArray0, (Option[]) null);
      boolean boolean0 = undeploy0.equals((Object) undeploy1);
      assertFalse(undeploy1.equals(undeploy0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Option[] optionArray0 = new Option[2];
      Undeploy undeploy1 = new Undeploy((Application[]) null, (Option[]) null);
      assertTrue(undeploy1.equals(undeploy0));
      
      undeploy0.setOptions(optionArray0);
      boolean boolean0 = undeploy0.equals((Object) undeploy1);
      assertFalse(undeploy1.equals(undeploy0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      Option[] optionArray0 = new Option[5];
      Undeploy undeploy1 = new Undeploy((Application[]) null, optionArray0);
      assertFalse(undeploy1.equals(undeploy0));
      
      undeploy0.setOptions(optionArray0);
      boolean boolean0 = undeploy0.equals((Object) undeploy1);
      assertTrue(undeploy0.equals(undeploy1));
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      Undeploy undeploy0 = new Undeploy();
      int int0 = undeploy0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      Application[] applicationArray0 = new Application[4];
      Application application0 = new Application("uY02P", "uY02P", "uY02P", "uY02P", "uY02P", "uY02P");
      applicationArray0[1] = application0;
      Option[] optionArray0 = new Option[16];
      Undeploy undeploy0 = new Undeploy(applicationArray0, optionArray0);
      int int0 = undeploy0.hashCode();
      assertEquals(664506686, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      Application[] applicationArray0 = new Application[4];
      Option[] optionArray0 = new Option[16];
      Option option0 = new Option();
      optionArray0[2] = option0;
      Undeploy undeploy0 = new Undeploy(applicationArray0, optionArray0);
      int int0 = undeploy0.hashCode();
      assertEquals(2, int0);
  }
}
