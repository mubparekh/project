/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.saphostcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.saphostcontrol.ACOperationCode;
import java.io.ObjectStreamException;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ACOperationCodeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ACOperationCode aCOperationCode0 = ACOperationCode.value1;
      String string0 = aCOperationCode0.getValue();
      assertNotNull(string0);
      assertEquals("AC-OP-MOUNT", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      TypeDesc typeDesc0 = ACOperationCode.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = ACOperationCode.class;
      QName qName0 = new QName("", "", "");
      EnumDeserializer enumDeserializer0 = (EnumDeserializer)ACOperationCode.getDeserializer("", (Class) class0, qName0);
      assertEquals(false, enumDeserializer0.componentsReady());
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = ACOperationCode.class;
      QName qName0 = new QName("", "", "");
      EnumSerializer enumSerializer0 = (EnumSerializer)ACOperationCode.getSerializer("", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", enumSerializer0.getMechanismType());
  }

  @Test
  public void test4()  throws Throwable  {
      ACOperationCode aCOperationCode0 = new ACOperationCode("");
      assertNotNull(aCOperationCode0);
      
      ACOperationCode aCOperationCode1 = (ACOperationCode)aCOperationCode0.readResolve();
      assertNotNull(aCOperationCode1);
      
      boolean boolean0 = aCOperationCode0.equals((Object) aCOperationCode1);
      assertEquals(true, boolean0);
      assertEquals("", aCOperationCode0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      ACOperationCode aCOperationCode0 = ACOperationCode.value1;
      ACOperationCode aCOperationCode1 = (ACOperationCode)aCOperationCode0.readResolve();
      assertNotSame(aCOperationCode1, aCOperationCode0);
      assertNotNull(aCOperationCode1);
      assertEquals("AC-OP-MOUNT", aCOperationCode1.getValue());
  }

  @Test
  public void test6()  throws Throwable  {
      ACOperationCode aCOperationCode0 = ACOperationCode.value1;
      int int0 = aCOperationCode0.hashCode();
      assertEquals((-1259522472), int0);
  }

  @Test
  public void test7()  throws Throwable  {
      try {
        ACOperationCode.fromString("c&$M)7y/");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      ACOperationCode aCOperationCode0 = ACOperationCode.value1;
      boolean boolean0 = aCOperationCode0.equals((Object) "AC-OP-MOUNT");
      assertEquals(false, boolean0);
  }
}
