/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.ICMConnection;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ICMConnectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("5Y@rK-D", "5Y@rK-D", "5Y@rK-D", "5Y@rK-D", "5Y@rK-D", 17, "5Y@rK-D", 17, 17, 17, "5Y@rK-D", 17);
      iCMConnection0.setProtocol((String) null);
      ICMConnection iCMConnection1 = new ICMConnection("5Y@rK-D", "5Y@rK-D", "5Y@rK-D", "5Y@rK-D", (String) null, 17, (String) null, 17, 17, 17, "5Y@rK-D", 17);
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(17, iCMConnection0.getKeepaliveTimeout());
      assertEquals(17, iCMConnection0.getNihdl());
      assertEquals(17, iCMConnection0.getProcTimeout());
      assertEquals(17, iCMConnection0.getPeerPort());
      assertEquals(17, iCMConnection0.getLocalPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", (-29), "' is missing dependencies when loadedvia classloader ", (-29), (-29), (-29), "' is missing dependencies when loadedvia classloader ", 6);
      ICMConnection iCMConnection1 = new ICMConnection("' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", "' is missing dependencies when loadedvia classloader ", (-29), "' is missing dependencies when loadedvia classloader ", (-29), (-29), (-29), "' is missing dependencies when loadedvia classloader ", (-29));
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(false, boolean0);
      assertEquals(-29, iCMConnection0.getKeepaliveTimeout());
      assertEquals(-29, iCMConnection0.getLocalPort());
      assertEquals(-29, iCMConnection0.getPeerPort());
      assertEquals(-29, iCMConnection0.getProcTimeout());
      assertEquals(6, iCMConnection0.getNihdl());
  }

  @Test
  public void test2()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setLocalPort((-9));
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(-9, iCMConnection0.getLocalPort());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = ICMConnection.class;
      QName qName0 = new QName("U", "U");
      BeanSerializer beanSerializer0 = (BeanSerializer)ICMConnection.getSerializer("U", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = ICMConnection.class;
      QName qName0 = new QName("U", "U");
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)ICMConnection.getDeserializer("U", (Class) class0, qName0);
      assertEquals(false, beanDeserializer0.componentsReady());
  }

  @Test
  public void test5()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("U", "U", "U", "U", "U", 1, "U", 1, 1, 1, "U", 1);
      iCMConnection0.setRole("U");
      assertEquals(1, iCMConnection0.getProcTimeout());
      assertEquals(1, iCMConnection0.getLocalPort());
      assertEquals(1, iCMConnection0.getNihdl());
      assertEquals(1, iCMConnection0.getKeepaliveTimeout());
      assertEquals(1, iCMConnection0.getPeerPort());
  }

  @Test
  public void test6()  throws Throwable  {
      TypeDesc typeDesc0 = ICMConnection.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test7()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setPeerPort((-278));
      assertEquals(-278, iCMConnection0.getPeerPort());
  }

  @Test
  public void test8()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setKeepaliveTimeout(961);
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(961, iCMConnection0.getKeepaliveTimeout());
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("3", "3", "3", "3", "3", (-463), "3", (-463), (-463), (-463), "3", (-463));
      iCMConnection0.setRequesttype((String) null);
      ICMConnection iCMConnection1 = new ICMConnection("3", "3", "3", "3", (String) null, (-463), (String) null, (-463), (-463), (-463), "3", (-463));
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(-463, iCMConnection1.getPeerPort());
      assertEquals(-463, iCMConnection1.getLocalPort());
      assertEquals(-463, iCMConnection1.getNihdl());
      assertEquals(-463, iCMConnection1.getProcTimeout());
      assertEquals(false, boolean0);
      assertEquals(-463, iCMConnection1.getKeepaliveTimeout());
  }

  @Test
  public void test10()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setNihdl((-9));
      assertEquals(-9, iCMConnection0.getNihdl());
  }

  @Test
  public void test11()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setConid("h\"/Q`4Mx<<uK5");
      ICMConnection iCMConnection1 = new ICMConnection("h\"/Q`4Mx<<uK5", (String) null, "h\"/Q`4Mx<<uK5", "h\"/Q`4Mx<<uK5", (String) null, 961, (String) null, 961, 961, 961, (String) null, 961);
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(961, iCMConnection1.getPeerPort());
      assertEquals(961, iCMConnection1.getLocalPort());
      assertEquals(false, boolean0);
      assertEquals(961, iCMConnection1.getNihdl());
      assertEquals(961, iCMConnection1.getProcTimeout());
      assertEquals(961, iCMConnection1.getKeepaliveTimeout());
  }

  @Test
  public void test12()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", (-1505), "Xjk s7<EL[", (-1505), (-1505), (-1505), "Xjk s7<EL[", (-1505));
      iCMConnection0.setProcTimeout((-1505));
      assertEquals(-1505, iCMConnection0.getLocalPort());
      assertEquals(-1505, iCMConnection0.getNihdl());
      assertEquals(-1505, iCMConnection0.getKeepaliveTimeout());
      assertEquals(-1505, iCMConnection0.getPeerPort());
      assertEquals(-1505, iCMConnection0.getProcTimeout());
  }

  @Test
  public void test13()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection("", "", "", "", "", (-1254), "", (-1254), (-1254), (-1254), "", (-1254));
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(-1254, iCMConnection1.getPeerPort());
      assertEquals(-1254, iCMConnection1.getKeepaliveTimeout());
      assertEquals(false, boolean0);
      assertEquals(-1254, iCMConnection1.getNihdl());
      assertEquals(-1254, iCMConnection1.getLocalPort());
      assertEquals(-1254, iCMConnection1.getProcTimeout());
  }

  @Test
  public void test15()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection("", "", "", "", "", (-1254), "", (-1254), (-1254), (-1254), "", (-1254));
      boolean boolean0 = iCMConnection1.equals((Object) iCMConnection0);
      assertEquals(-1254, iCMConnection1.getLocalPort());
      assertEquals(-1254, iCMConnection1.getKeepaliveTimeout());
      assertEquals(false, boolean0);
      assertEquals(-1254, iCMConnection1.getNihdl());
      assertEquals(-1254, iCMConnection1.getPeerPort());
      assertEquals(-1254, iCMConnection1.getProcTimeout());
  }

  @Test
  public void test17()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setProtocol("|?w[(d|++Sdgxhy7");
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(false, boolean0);
      assertFalse(iCMConnection1.equals(iCMConnection0));
  }

  @Test
  public void test18()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("'", "'", "'", "4z-:Mk,/3", "'", 14, "4z-:Mk,/3", 14, 14, 14, "'", 14);
      ICMConnection iCMConnection1 = new ICMConnection("'", "'", "4z-:Mk,/3", "4z-:Mk,/3", "'", 14, "'", 14, 14, 14, "'", 14);
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(14, iCMConnection0.getLocalPort());
      assertEquals(14, iCMConnection0.getProcTimeout());
      assertEquals(14, iCMConnection0.getKeepaliveTimeout());
      assertEquals("'", iCMConnection0.getProtocol());
      assertEquals("'", iCMConnection1.getConid());
      assertEquals("'", iCMConnection0.getRole());
      assertEquals(false, boolean0);
      assertEquals("'", iCMConnection0.getConnectionTime());
      assertEquals("'", iCMConnection0.getPeerAddress());
      assertEquals("'", iCMConnection1.getLocalAddress());
      assertEquals(14, iCMConnection0.getPeerPort());
      assertEquals("4z-:Mk,/3", iCMConnection0.getRequesttype());
      assertEquals("'", iCMConnection1.getConnectionTime());
      assertEquals(14, iCMConnection0.getNihdl());
      assertEquals("'", iCMConnection1.getProtocol());
      assertEquals("4z-:Mk,/3", iCMConnection1.getRole());
      assertEquals("'", iCMConnection1.getPeerAddress());
      assertEquals("4z-:Mk,/3", iCMConnection0.getLocalAddress());
      assertEquals("'", iCMConnection0.getConid());
  }

  @Test
  public void test19()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", (-1505), "Xjk s7<EL[", (-1505), (-1505), (-1505), "Xjk s7<EL[", (-1505));
      ICMConnection iCMConnection1 = new ICMConnection("Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", ",t#e}<{h[z%)2", "Xjk s7<EL[", (-1505), "Xjk s7<EL[", (-1505), (-1505), (-1505), "Xjk s7<EL[", (-1505));
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals("Xjk s7<EL[", iCMConnection1.getConid());
      assertEquals("Xjk s7<EL[", iCMConnection1.getRole());
      assertEquals(-1505, iCMConnection1.getPeerPort());
      assertEquals(-1505, iCMConnection1.getKeepaliveTimeout());
      assertEquals("Xjk s7<EL[", iCMConnection1.getProtocol());
      assertEquals(-1505, iCMConnection1.getLocalPort());
      assertEquals(-1505, iCMConnection1.getProcTimeout());
      assertEquals(-1505, iCMConnection1.getNihdl());
      assertEquals("Xjk s7<EL[", iCMConnection1.getConnectionTime());
      assertEquals(false, boolean0);
      assertEquals("Xjk s7<EL[", iCMConnection1.getPeerAddress());
  }

  @Test
  public void test20()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection();
      assertTrue(iCMConnection1.equals(iCMConnection0));
      
      iCMConnection1.setPeerAddress("wvak|ywauj\"Px\"%Cb");
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setPeerAddress("\\#7 qP");
      ICMConnection iCMConnection1 = new ICMConnection((String) null, (String) null, (String) null, (String) null, (String) null, 9, (String) null, 9, 9, 9, (String) null, 9);
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(9, iCMConnection1.getPeerPort());
      assertEquals(false, boolean0);
      assertEquals(9, iCMConnection1.getProcTimeout());
      assertEquals(9, iCMConnection1.getKeepaliveTimeout());
      assertEquals(9, iCMConnection1.getLocalPort());
      assertEquals(9, iCMConnection1.getNihdl());
  }

  @Test
  public void test22()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", (-1505), "Xjk s7<EL[", (-1505), (-1505), (-1505), "Xjk s7<EL[", (-1505));
      ICMConnection iCMConnection1 = new ICMConnection("Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", "Xjk s7<EL[", (-6), "Xjk s7<EL[", (-1505), (-6), (-6), "Xjk s7<EL[", (-1505));
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(-1505, iCMConnection1.getLocalPort());
      assertEquals(-6, iCMConnection1.getProcTimeout());
      assertEquals(false, boolean0);
      assertEquals(-6, iCMConnection1.getKeepaliveTimeout());
      assertEquals(-1505, iCMConnection1.getNihdl());
      assertEquals(-6, iCMConnection1.getPeerPort());
  }

  @Test
  public void test23()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection();
      assertTrue(iCMConnection1.equals(iCMConnection0));
      
      iCMConnection1.setLocalAddress("`6j");
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setLocalAddress("");
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(0, iCMConnection1.getPeerPort());
      assertFalse(iCMConnection1.equals(iCMConnection0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      ICMConnection iCMConnection1 = new ICMConnection();
      assertTrue(iCMConnection1.equals(iCMConnection0));
      
      iCMConnection1.setConnectionTime("t'yEU.`NVMug?dewj");
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      iCMConnection0.setConnectionTime("t'yEU.`NVMug?deej");
      ICMConnection iCMConnection1 = new ICMConnection();
      boolean boolean0 = iCMConnection0.equals((Object) iCMConnection1);
      assertEquals(0, iCMConnection0.getPeerPort());
      assertEquals(0, iCMConnection0.getLocalPort());
      assertEquals(0, iCMConnection0.getProcTimeout());
      assertEquals(0, iCMConnection0.getKeepaliveTimeout());
      assertFalse(iCMConnection1.equals(iCMConnection0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection("3", "3", "3", "3", "3", (-463), "3", (-463), (-463), (-463), "3", (-463));
      int int0 = iCMConnection0.hashCode();
      assertEquals((-1957), int0);
  }

  @Test
  public void test28()  throws Throwable  {
      ICMConnection iCMConnection0 = new ICMConnection();
      int int0 = iCMConnection0.hashCode();
      assertEquals(1, int0);
  }
}