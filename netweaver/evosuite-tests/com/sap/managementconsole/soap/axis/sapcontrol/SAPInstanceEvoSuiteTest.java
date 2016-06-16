/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.SAPInstance;
import com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SAPInstanceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      sAPInstance0.setInstanceNr((-388));
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(-388, sAPInstance0.getInstanceNr());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = SAPInstance.class;
      QName qName0 = QName.valueOf("og'apacheplog4jor.ObjecfRYndx(e");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)SAPInstance.getDeserializer("og'apacheplog4jor.ObjecfRYndx(e", (Class) class0, qName0);
      assertEquals(false, beanDeserializer0.componentsReady());
  }

  @Test
  public void test2()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      sAPInstance0.setFeatures("9");
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertFalse(sAPInstance1.equals(sAPInstance0));
      assertEquals(0, sAPInstance0.getHttpsPort());
      assertEquals(0, sAPInstance0.getInstanceNr());
      assertEquals(0, sAPInstance0.getHttpPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      sAPInstance0.setHttpsPort((-1870));
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(-1870, sAPInstance0.getHttpsPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance("EqR", 170, 170, 170, "EqR", "EqR", (STATECOLOR) null);
      SAPInstance sAPInstance1 = new SAPInstance("EqR", 170, 170, 170, "EqR", "EqR", (STATECOLOR) null);
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(true, boolean0);
      assertEquals(170, sAPInstance1.getHttpPort());
      assertEquals(170, sAPInstance1.getInstanceNr());
      assertEquals(170, sAPInstance1.getHttpsPort());
  }

  @Test
  public void test5()  throws Throwable  {
      Class<?> class0 = SAPInstance.class;
      QName qName0 = new QName("3TQNnPzF~CWe{+d'XO", "3TQNnPzF~CWe{+d'XO");
      BeanSerializer beanSerializer0 = (BeanSerializer)SAPInstance.getSerializer("3TQNnPzF~CWe{+d'XO", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test6()  throws Throwable  {
      TypeDesc typeDesc0 = SAPInstance.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test7()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      sAPInstance0.setHttpPort((-1961));
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(-1961, sAPInstance0.getHttpPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      SAPInstance sAPInstance1 = new SAPInstance();
      assertTrue(sAPInstance1.equals(sAPInstance0));
      
      sAPInstance1.setStartPriority("&LuzFSr=)Zl");
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertFalse(sAPInstance1.equals(sAPInstance0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value4;
      SAPInstance sAPInstance0 = new SAPInstance("F_B>VM", 16, 16, 16, "F_B>VM", "F_B>VM", sTATECOLOR0);
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance1.equals((Object) sAPInstance0);
      assertEquals(16, sAPInstance0.getHttpPort());
      assertEquals(16, sAPInstance0.getInstanceNr());
      assertEquals(false, boolean0);
      assertEquals(16, sAPInstance0.getHttpsPort());
  }

  @Test
  public void test11()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      SAPInstance sAPInstance1 = new SAPInstance();
      assertTrue(sAPInstance1.equals(sAPInstance0));
      
      sAPInstance0.setHostname("SAPControl-RED");
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertFalse(sAPInstance0.equals(sAPInstance1));
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      sAPInstance0.setStartPriority("unregistered00");
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(0, sAPInstance1.getHttpPort());
      assertEquals(0, sAPInstance1.getInstanceNr());
      assertEquals(0, sAPInstance1.getHttpsPort());
      assertEquals(false, boolean0);
      assertFalse(sAPInstance1.equals(sAPInstance0));
  }

  @Test
  public void test14()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value4;
      SAPInstance sAPInstance0 = new SAPInstance("F_B>VM", 16, 16, 16, "F_B>VM", "F_B>VM", sTATECOLOR0);
      sAPInstance0.setFeatures((String) null);
      SAPInstance sAPInstance1 = new SAPInstance("F_B>VM", 16, 16, 16, "F_B>VM", "F_B>VM", sTATECOLOR0);
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(false, boolean0);
      assertEquals(16, sAPInstance0.getHttpsPort());
      assertEquals(16, sAPInstance0.getInstanceNr());
      assertEquals(16, sAPInstance0.getHttpPort());
  }

  @Test
  public void test15()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value3;
      sAPInstance0.setDispstatus(sTATECOLOR0);
      SAPInstance sAPInstance1 = new SAPInstance();
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertFalse(sAPInstance1.equals(sAPInstance0));
      assertEquals(0, sAPInstance0.getInstanceNr());
      assertEquals(0, sAPInstance0.getHttpsPort());
      assertEquals(0, sAPInstance0.getHttpPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      SAPInstance sAPInstance1 = new SAPInstance();
      assertTrue(sAPInstance1.equals(sAPInstance0));
      
      sAPInstance1.setDispstatus(sTATECOLOR0);
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value3;
      sAPInstance0.setDispstatus(sTATECOLOR0);
      SAPInstance sAPInstance1 = new SAPInstance();
      assertFalse(sAPInstance1.equals(sAPInstance0));
      
      sAPInstance1.setDispstatus(sTATECOLOR0);
      boolean boolean0 = sAPInstance0.equals((Object) sAPInstance1);
      assertTrue(sAPInstance1.equals(sAPInstance0));
      assertEquals(true, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      SAPInstance sAPInstance0 = new SAPInstance();
      int int0 = sAPInstance0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value4;
      SAPInstance sAPInstance0 = new SAPInstance("F_B>VM", 16, 16, 16, "F_B>VM", "F_B>VM", sTATECOLOR0);
      int int0 = sAPInstance0.hashCode();
      assertEquals((-1523436556), int0);
  }
}