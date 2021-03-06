/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.core.plugins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.ui.NoteListCell;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CommonNoteEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      NoteListCell noteListCell0 = new NoteListCell((AbstractNote) commonNote0);
      assertEquals("Title", commonNote0.getTitle());
      assertEquals("This is a testing description. \u00CF\u00A3\u00CD\u00FB\u00C4\u00E3\u00C4\u00DC\u00BF\u00B4\u00B5\u00BD\u00CB\u00FC\u00A1\u00A3", commonNote0.getDescription());
      assertEquals(" ", commonNote0.getOtherInfoText());
      assertNotNull(noteListCell0);
  }

  @Test
  public void test1()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      assertEquals(" ", commonNote0.getOtherInfoText());
      
      commonNote0.setOtherInfo("%BZuc");
      String string0 = commonNote0.getOtherInfoText();
      assertEquals("%BZuc", commonNote0.getOtherInfoText());
      assertEquals("%BZuc", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      commonNote0.setOtherInfo("");
      String string0 = commonNote0.getOtherInfoText();
      assertEquals(" ", string0);
  }
}
