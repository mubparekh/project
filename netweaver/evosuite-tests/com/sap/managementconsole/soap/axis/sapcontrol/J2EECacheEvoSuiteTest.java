/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EECache;
import com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class J2EECacheEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TypeDesc typeDesc0 = J2EECache.getTypeDesc();
      assertEquals(false, typeDesc0.hasAttributes());
  }

  @Test
  public void test1()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache("IX$hbBVpXi2AA0(]= ", "IX$hbBVpXi2AA0(]= ", "IX$hbBVpXi2AA0(]= ", 0L, (-1144L), (-1144L), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "IX$hbBVpXi2AA0(]= ", (STATECOLOR) null);
      J2EECache j2EECache1 = new J2EECache("IX$hbBVpXi2AA0(]= ", "IX$hbBVpXi2AA0(]= ", "IX$hbBVpXi2AA0(]= ", (long) 0, (-1144L), 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "IX$hbBVpXi2AA0(]= ", (STATECOLOR) null);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0L, j2EECache0.getSize());
      assertEquals(0, j2EECache0.getInstanceInvalidations());
      assertEquals(0, j2EECache0.getRemoves());
      assertEquals((-1144L), j2EECache0.getAttrSize());
      assertEquals(0, j2EECache0.getChanges());
      assertEquals(0, j2EECache0.getHits());
      assertEquals(0, j2EECache0.getUsedObjects());
      assertEquals((-1144L), j2EECache0.getKeysSize());
      assertEquals(0, j2EECache0.getCachedObjects());
      assertEquals(0, j2EECache0.getGets());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache0.getEvictions());
  }

  @Test
  public void test2()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache1.equals((Object) j2EECache0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setEvictions(395);
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(395, j2EECache0.getEvictions());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setCachename("");
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      J2EECache j2EECache1 = new J2EECache("", "", "", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0, j2EECache1.getPuts());
      assertEquals(0, j2EECache1.getHits());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache1.getCachedObjects());
      assertEquals(0, j2EECache1.getUsedObjects());
      assertEquals(0, j2EECache1.getEvictions());
      assertEquals(0, j2EECache1.getInstanceInvalidations());
      assertEquals(0, j2EECache1.getGets());
  }

  @Test
  public void test5()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setChanges(0);
      assertEquals(0, j2EECache0.getChanges());
  }

  @Test
  public void test6()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setInstanceInvalidations(2);
      assertEquals(2, j2EECache0.getInstanceInvalidations());
  }

  @Test
  public void test7()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setSize((long) 0);
      assertEquals(0, j2EECache0.getCachedObjects());
  }

  @Test
  public void test8()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setAttrSize(222L);
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(222L, j2EECache0.getAttrSize());
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setRemoves(1);
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(1, j2EECache0.getRemoves());
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setCachedObjects(1);
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(1, j2EECache0.getCachedObjects());
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Class<?> class0 = STATECOLOR.class;
      QName qName0 = new QName("qoSIcUgo[", "qoSIcUgo[");
      BeanSerializer beanSerializer0 = (BeanSerializer)J2EECache.getSerializer("qoSIcUgo[", (Class) class0, qName0);
      assertEquals("Axis SAX Mechanism", beanSerializer0.getMechanismType());
  }

  @Test
  public void test12()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setClusterInvalidations(0);
      assertEquals(0, j2EECache0.getClusterInvalidations());
  }

  @Test
  public void test13()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setGets(1);
      assertEquals(1, j2EECache0.getGets());
  }

  @Test
  public void test14()  throws Throwable  {
      Class<?> class0 = Object.class;
      BeanDeserializer beanDeserializer0 = (BeanDeserializer)J2EECache.getDeserializer("Lr<-S", (Class) class0, (QName) null);
      assertEquals("Axis SAX Mechanism", beanDeserializer0.getMechanismType());
  }

  @Test
  public void test15()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setUsedObjects((-1));
      assertEquals(-1, j2EECache0.getUsedObjects());
  }

  @Test
  public void test16()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value3;
      J2EECache j2EECache0 = new J2EECache("qoSIcUgo[", "qoSIcUgo[", "qoSIcUgo[", (long) (-1359), 1599L, 1599L, (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), "qoSIcUgo[", sTATECOLOR0);
      j2EECache0.setKeysSize(1599L);
      assertEquals(-1359, j2EECache0.getHits());
      assertEquals(-1359, j2EECache0.getCachedObjects());
      assertEquals((-1359L), j2EECache0.getSize());
      assertEquals(-1359, j2EECache0.getUsedObjects());
      assertEquals(1599L, j2EECache0.getAttrSize());
      assertEquals(-1359, j2EECache0.getChanges());
      assertEquals(-1359, j2EECache0.getPuts());
      assertEquals(-1359, j2EECache0.getEvictions());
      assertEquals(-1359, j2EECache0.getRemoves());
      assertEquals(-1359, j2EECache0.getInstanceInvalidations());
      assertEquals(-1359, j2EECache0.getGets());
      assertEquals(1599L, j2EECache0.getKeysSize());
  }

  @Test
  public void test17()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value3;
      J2EECache j2EECache0 = new J2EECache("qoSIcUgo[", "qoSIcUgo[", "qoSIcUgo[", (long) (-1359), 1599L, 1599L, (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), "qoSIcUgo[", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) "SAPControl-YELLOW");
      assertEquals(-1359, j2EECache0.getEvictions());
      assertEquals(-1359, j2EECache0.getCachedObjects());
      assertEquals((-1359L), j2EECache0.getSize());
      assertEquals(-1359, j2EECache0.getRemoves());
      assertEquals(-1359, j2EECache0.getChanges());
      assertEquals(1599L, j2EECache0.getAttrSize());
      assertEquals(false, boolean0);
      assertEquals(-1359, j2EECache0.getHits());
      assertEquals(-1359, j2EECache0.getGets());
      assertEquals(-1359, j2EECache0.getInstanceInvalidations());
      assertEquals(1599L, j2EECache0.getKeysSize());
      assertEquals(-1359, j2EECache0.getUsedObjects());
      assertEquals(-1359, j2EECache0.getPuts());
  }

  @Test
  public void test18()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      J2EECache j2EECache1 = new J2EECache("K", "K", "K", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "K", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0, j2EECache1.getHits());
      assertEquals(0, j2EECache1.getRemoves());
      assertEquals(0, j2EECache1.getGets());
      assertEquals(0, j2EECache1.getUsedObjects());
      assertEquals(0, j2EECache1.getCachedObjects());
      assertEquals(0, j2EECache1.getEvictions());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache1.getChanges());
      assertEquals(0, j2EECache1.getPuts());
      assertEquals(0, j2EECache1.getInstanceInvalidations());
  }

  @Test
  public void test19()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      J2EECache j2EECache1 = new J2EECache("V!atYGvu&mz", "o>c\".XHm", "o>c\".XHm", 0L, (long) (-1721), (long) (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), "o>c\".XHm", (STATECOLOR) null);
      boolean boolean0 = j2EECache1.equals((Object) j2EECache0);
      assertEquals(-1721, j2EECache1.getCachedObjects());
      assertEquals(-1721, j2EECache1.getRemoves());
      assertEquals(-1721, j2EECache1.getInstanceInvalidations());
      assertEquals("o>c\".XHm", j2EECache1.getType());
      assertEquals(-1721, j2EECache1.getHits());
      assertEquals(-1721, j2EECache1.getUsedObjects());
      assertEquals(-1721, j2EECache1.getGets());
      assertEquals(-1721, j2EECache1.getEvictions());
      assertEquals(false, boolean0);
      assertEquals(0L, j2EECache1.getSize());
      assertEquals("V!atYGvu&mz", j2EECache1.getCachename());
      assertEquals((-1721L), j2EECache1.getKeysSize());
      assertEquals(-1721, j2EECache1.getChanges());
      assertEquals(-1721, j2EECache1.getPuts());
  }

  @Test
  public void test20()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache("V!atYGvu&mz", "o>c\".XHm", "o>c\".XHm", 0L, (long) (-1721), (long) (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), "o>c\".XHm", (STATECOLOR) null);
      J2EECache j2EECache1 = new J2EECache("V!atYGvu&mz", "V!atYGvu&mz", "V!atYGvu&mz", 0L, (long) (-1721), 0L, (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), (-1721), "o>c\".XHm", (STATECOLOR) null);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(-1721, j2EECache1.getGets());
      assertEquals(false, boolean0);
      assertEquals(-1721, j2EECache1.getPuts());
      assertEquals(-1721, j2EECache1.getRemoves());
      assertEquals(0L, j2EECache1.getKeysSize());
      assertEquals(0L, j2EECache1.getSize());
      assertEquals("o>c\".XHm", j2EECache0.getType());
      assertEquals(-1721, j2EECache1.getInstanceInvalidations());
      assertEquals(-1721, j2EECache1.getChanges());
      assertEquals("V!atYGvu&mz", j2EECache1.getProcessname());
      assertEquals(-1721, j2EECache1.getHits());
      assertEquals(-1721, j2EECache1.getEvictions());
      assertEquals(-1721, j2EECache1.getUsedObjects());
      assertEquals((-1721L), j2EECache1.getAttrSize());
      assertEquals("V!atYGvu&mz", j2EECache1.getType());
      assertEquals("o>c\".XHm", j2EECache0.getProcessname());
      assertEquals(-1721, j2EECache1.getCachedObjects());
  }

  @Test
  public void test21()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setCachename("The Hiearchy.overrideAsNeeded method has been deprecated.");
      j2EECache0.setProcessname("The Hiearchy.overrideAsNeeded method has been deprecated.");
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      J2EECache j2EECache1 = new J2EECache("The Hiearchy.overrideAsNeeded method has been deprecated.", "The Hiearchy.overrideAsNeeded method has been deprecated.", "The Hiearchy.overrideAsNeeded method has been deprecated.", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "The Hiearchy.overrideAsNeeded method has been deprecated.", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0, j2EECache1.getInstanceInvalidations());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache1.getPuts());
      assertEquals(0, j2EECache1.getUsedObjects());
      assertEquals(0, j2EECache1.getEvictions());
      assertEquals(0, j2EECache1.getGets());
      assertEquals(0, j2EECache1.getHits());
      assertEquals(0, j2EECache1.getChanges());
      assertEquals(0, j2EECache1.getCachedObjects());
  }

  @Test
  public void test22()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setType(";");
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(false, boolean0);
      assertFalse(j2EECache1.equals(j2EECache0));
  }

  @Test
  public void test23()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value2;
      J2EECache j2EECache0 = new J2EECache(".E 6Ik30NzQ", ".E 6Ik30NzQ", ".E 6Ik30NzQ", 1073741824L, 1073741824L, 1073741824L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ".E 6Ik30NzQ", sTATECOLOR0);
      J2EECache j2EECache1 = new J2EECache(".E 6Ik30NzQ", ".E 6Ik30NzQ", ".E 6Ik30NzQ", (long) 0, 1073741824L, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ".E 6Ik30NzQ", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0, j2EECache1.getPuts());
      assertEquals(0, j2EECache1.getHits());
      assertEquals(0, j2EECache1.getInstanceInvalidations());
      assertEquals(0, j2EECache1.getChanges());
      assertEquals(1073741824L, j2EECache1.getAttrSize());
      assertEquals(1073741824L, j2EECache0.getKeysSize());
      assertEquals(0, j2EECache1.getUsedObjects());
      assertEquals(0L, j2EECache1.getSize());
      assertEquals(0, j2EECache1.getCachedObjects());
      assertEquals(1073741824L, j2EECache0.getSize());
      assertEquals(0, j2EECache1.getGets());
      assertEquals(false, boolean0);
      assertEquals(0L, j2EECache1.getKeysSize());
  }

  @Test
  public void test24()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      J2EECache j2EECache1 = new J2EECache();
      j2EECache0.setPuts((-1));
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(-1, j2EECache0.getPuts());
      assertEquals(false, boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setType(";");
      j2EECache0.setCachename(";");
      j2EECache0.setProcessname(";");
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      j2EECache0.setHits(1809);
      J2EECache j2EECache1 = new J2EECache(";", ";", ";", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ";", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(1809, j2EECache0.getHits());
      assertEquals(false, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      j2EECache0.setType("");
      j2EECache0.setCachename("");
      j2EECache0.setProcessname("");
      j2EECache0.setUpdateTime("");
      J2EECache j2EECache1 = new J2EECache("", "", "", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(0, j2EECache1.getEvictions());
      assertEquals(0, j2EECache1.getCachedObjects());
      assertEquals(0, j2EECache1.getChanges());
      assertEquals(0, j2EECache1.getGets());
      assertEquals(0, j2EECache1.getInstanceInvalidations());
      assertEquals(0, j2EECache1.getRemoves());
      assertEquals(0, j2EECache1.getHits());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache1.getUsedObjects());
  }

  @Test
  public void test27()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      j2EECache0.setUpdateTime(".E 6Ik30NzQ");
      J2EECache j2EECache1 = new J2EECache();
      boolean boolean0 = j2EECache1.equals((Object) j2EECache0);
      assertEquals(0, j2EECache1.getPuts());
      assertEquals(0, j2EECache1.getGets());
      assertEquals(0, j2EECache1.getHits());
      assertEquals(0, j2EECache1.getCachedObjects());
      assertEquals(0, j2EECache1.getClusterInvalidations());
      assertEquals(false, boolean0);
      assertEquals(0, j2EECache1.getEvictions());
      assertEquals(0, j2EECache1.getChanges());
      assertEquals(0, j2EECache1.getUsedObjects());
      assertEquals(0, j2EECache1.getRemoves());
      assertEquals(0, j2EECache1.getInstanceInvalidations());
  }

  @Test
  public void test28()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      J2EECache j2EECache1 = new J2EECache();
      assertTrue(j2EECache1.equals(j2EECache0));
      
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      j2EECache1.setDispstatus(sTATECOLOR0);
      boolean boolean0 = j2EECache1.equals((Object) j2EECache0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      STATECOLOR sTATECOLOR0 = STATECOLOR.value1;
      j2EECache0.setDispstatus(sTATECOLOR0);
      j2EECache0.setType("");
      j2EECache0.setCachename("");
      j2EECache0.setProcessname("");
      j2EECache0.setUpdateTime("");
      J2EECache j2EECache1 = new J2EECache("", "", "", (long) 0, (long) 0, (long) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", sTATECOLOR0);
      boolean boolean0 = j2EECache0.equals((Object) j2EECache1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      J2EECache j2EECache0 = new J2EECache();
      int int0 = j2EECache0.hashCode();
      assertEquals(1, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      STATECOLOR sTATECOLOR0 = STATECOLOR.value3;
      J2EECache j2EECache0 = new J2EECache("qoSIcUgo[", "qoSIcUgo[", "qoSIcUgo[", (long) (-1359), 1599L, 1599L, (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), (-1359), "qoSIcUgo[", sTATECOLOR0);
      int int0 = j2EECache0.hashCode();
      assertEquals(869081521, int0);
  }
}
