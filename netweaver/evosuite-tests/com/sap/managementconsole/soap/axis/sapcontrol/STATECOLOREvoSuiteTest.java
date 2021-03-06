/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR;
import java.io.ObjectStreamException;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class STATECOLOREvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = STATECOLOR.class;
      EnumDeserializer enumDeserializer0 = (EnumDeserializer)STATECOLOR.getDeserializer("", (Class) class0, (QName) null);
      assertEquals(false, enumDeserializer0.componentsReady());
  }

  @Test
  public void test1()  throws Throwable  {
      try {
        STATECOLOR.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TypeDesc typeDesc0 = STATECOLOR.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test3()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = new STATECOLOR("SAPControl-GREEN");
      assertNotNull(sTATECOLOR0);
      assertEquals("SAPControl-GREEN", sTATECOLOR0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.fromString("SAPControl-GREEN");
      assertNotNull(sTATECOLOR0);
      assertEquals("SAPControl-GREEN", sTATECOLOR0.getValue());
  }

  @Test
  public void test5()  throws Throwable  {
      try {
        STATECOLOR.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      QName qName0 = new QName("8", "8");
      Class<?> class0 = STATECOLOR.class;
      EnumSerializer enumSerializer0 = (EnumSerializer)STATECOLOR.getSerializer("8", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", enumSerializer0.getMechanismType());
  }

  @Test
  public void test7()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      int int0 = sTATECOLOR0.hashCode();
      assertEquals((-1432415819), int0);
  }

  @Test
  public void test8()  throws Throwable  {
      try {
        STATECOLOR.fromValue("\".");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value2;
      boolean boolean0 = sTATECOLOR0.equals((Object) "");
      assertEquals(false, boolean0);
  }
}
