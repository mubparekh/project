/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.ui.NoteListCell;
import java.awt.Dimension;
import java.awt.Graphics;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NoteListCellEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      noteListCell0.setIndexInList(881);
      assertEquals(881, noteListCell0.getIndexInList());
  }

  @Test
  public void test1()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      Dimension dimension0 = noteListCell0.getMaximumSize();
      assertNotNull(dimension0);
      assertEquals(-1, noteListCell0.getIndexInList());
      assertEquals(true, noteListCell0.isBackgroundSet());
      assertEquals("java.awt.Dimension[width=2147483647,height=55]", dimension0.toString());
      assertEquals(true, noteListCell0.isOpaque());
      assertEquals(3, noteListCell0.countComponents());
  }

  @Test
  public void test2()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      // Undeclared exception!
      try {
        noteListCell0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      int int0 = noteListCell0.getIndexInList();
      assertEquals(true, noteListCell0.isOpaque());
      assertEquals(3, noteListCell0.getComponentCount());
      assertEquals((-1), int0);
  }

  @Test
  public void test4()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      noteListCell0.isSelected();
      assertEquals(true, noteListCell0.isBackgroundSet());
      assertEquals(true, noteListCell0.isOpaque());
      assertEquals(-1, noteListCell0.getIndexInList());
      assertEquals(3, noteListCell0.countComponents());
  }

  @Test
  public void test5()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      noteListCell0.setSelected(false);
      assertEquals(true, noteListCell0.isBackgroundSet());
      assertEquals(-1, noteListCell0.getIndexInList());
      assertEquals(3, noteListCell0.getComponentCount());
      assertEquals(false, noteListCell0.isSelected());
      assertEquals(true, noteListCell0.isOpaque());
  }

  @Test
  public void test6()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertNotNull(noteListCell0);
      
      noteListCell0.setSelected(true);
      assertEquals(true, noteListCell0.isSelected());
      assertEquals(-1, noteListCell0.getIndexInList());
  }
}