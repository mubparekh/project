/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import bierse.view.KeyMapComboBoxModel;
import bierse.view.MyKeyMap;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class KeyMapComboBoxModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      KeyMapComboBoxModel keyMapComboBoxModel0 = new KeyMapComboBoxModel();
      assertEquals(12, keyMapComboBoxModel0.getSize());
  }

  @Test
  public void test1()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(112);
      assertEquals("F1", myKeyMap0.getText());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test2()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(114);
      assertNotNull(myKeyMap0);
      assertEquals(114, myKeyMap0.getCode());
  }

  @Test
  public void test3()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(113);
      assertEquals("F2", myKeyMap0.toString());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test4()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(115);
      assertEquals("F4", myKeyMap0.getText());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test5()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(116);
      assertNotNull(myKeyMap0);
      assertEquals("F5", myKeyMap0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(117);
      assertEquals(117, myKeyMap0.getCode());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test7()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(118);
      assertNotNull(myKeyMap0);
      assertEquals("F7", myKeyMap0.getText());
  }

  @Test
  public void test8()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(119);
      assertNotNull(myKeyMap0);
      assertEquals("F8", myKeyMap0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(120);
      assertNotNull(myKeyMap0);
      assertEquals("F9", myKeyMap0.getText());
  }

  @Test
  public void test10()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(121);
      assertNotNull(myKeyMap0);
      assertEquals(121, myKeyMap0.getCode());
  }

  @Test
  public void test11()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(122);
      assertEquals("F11", myKeyMap0.getText());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test12()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(123);
      assertEquals("F12", myKeyMap0.toString());
      assertNotNull(myKeyMap0);
  }

  @Test
  public void test13()  throws Throwable  {
      MyKeyMap myKeyMap0 = KeyMapComboBoxModel.getMyKeyMapForKeyCode(129);
      assertNull(myKeyMap0);
  }
}