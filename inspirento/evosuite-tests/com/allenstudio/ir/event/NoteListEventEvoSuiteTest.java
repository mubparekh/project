/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.event.NoteListEvent;
import java.awt.Point;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NoteListEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Point point0 = new Point(0, 0);
      NoteListEvent noteListEvent0 = new NoteListEvent((Object) "S(i7G", point0);
      Point point1 = noteListEvent0.getPoint();
      assertSame(point0, point1);
  }
}
