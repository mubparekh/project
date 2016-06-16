/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.saphostcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.saphostcontrol.InstanceOptionsFlags;
import java.io.ObjectStreamException;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InstanceOptionsFlagsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = InstanceOptionsFlags.class;
      QName qName0 = new QName("");
      EnumDeserializer enumDeserializer0 = (EnumDeserializer)InstanceOptionsFlags.getDeserializer(")fSc:(n`+g%^A>!H", (Class) class0, qName0);
      assertEquals(false, enumDeserializer0.componentsReady());
  }

  @Test
  public void test1()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = InstanceOptionsFlags.fromString("");
      instanceOptionsFlags0.getValue();
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = InstanceOptionsFlags.class;
      QName qName0 = new QName("");
      EnumSerializer enumSerializer0 = (EnumSerializer)InstanceOptionsFlags.getSerializer("", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", enumSerializer0.getMechanismType());
  }

  @Test
  public void test3()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = InstanceOptionsFlags.fromString("");
      instanceOptionsFlags0.readResolve();
  }

  @Test
  public void test4()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = InstanceOptionsFlags.value6;
      int int0 = instanceOptionsFlags0.hashCode();
      assertEquals((-1546260531), int0);
  }

  @Test
  public void test5()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = new InstanceOptionsFlags("");
      assertNotNull(instanceOptionsFlags0);
      assertEquals("", instanceOptionsFlags0.getValue());
  }

  @Test
  public void test6()  throws Throwable  {
      TypeDesc typeDesc0 = InstanceOptionsFlags.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test7()  throws Throwable  {
      try {
        InstanceOptionsFlags.fromString(";l=~|\"Z9k\n3E");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = InstanceOptionsFlags.fromString("");
      assertNotNull(instanceOptionsFlags0);
      
      InstanceOptionsFlags instanceOptionsFlags1 = InstanceOptionsFlags.value2;
      boolean boolean0 = instanceOptionsFlags0.equals((Object) instanceOptionsFlags1);
      assertEquals(false, boolean0);
      assertEquals("", instanceOptionsFlags0.getValue());
  }

  @Test
  public void test9()  throws Throwable  {
      InstanceOptionsFlags instanceOptionsFlags0 = InstanceOptionsFlags.value7;
      boolean boolean0 = instanceOptionsFlags0.equals((Object) instanceOptionsFlags0);
      assertEquals(true, boolean0);
  }
}