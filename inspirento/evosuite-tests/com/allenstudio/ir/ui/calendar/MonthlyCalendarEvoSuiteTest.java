/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui.calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.calendar.IMonthlyCalendarModel;
import com.allenstudio.ir.ui.calendar.MonthlyCalendar;
import com.allenstudio.ir.ui.calendar.MonthlyCalendarModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.FontUIResource;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MonthlyCalendarEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      boolean boolean0 = monthlyCalendar0.getWeekStartOnSunday();
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MonthlyCalendarModel monthlyCalendarModel0 = (MonthlyCalendarModel)monthlyCalendar0.getModel();
      monthlyCalendar0.setModel((IMonthlyCalendarModel) monthlyCalendarModel0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test2()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.getSelectedDay();
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test
  public void test3()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.setMarked(1970, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1969
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getHeaderForeground();
      assertNotNull(color0);
      
      monthlyCalendar0.setHeaderForeground(color0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("java.awt.Color[r=216,g=228,b=248]", color0.toString());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(248, color0.getBlue());
  }

  @Test
  public void test5()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setWeekStartOnSunday(false);
      assertEquals(false, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test6()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      boolean boolean0 = monthlyCalendar0.getMouseListeningEnabled();
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, boolean0);
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test7()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getDateForeground();
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertNotNull(color0);
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(0, color0.getGreen());
  }

  @Test
  public void test8()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getHighlightBackground();
      assertNotNull(color0);
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(84, color0.getGreen());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test9()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      monthlyCalendar0.setDateForeground(color0);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test10()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      TitledBorder titledBorder0 = new TitledBorder("");
      FontUIResource fontUIResource0 = (FontUIResource)titledBorder0.getTitleFont();
      monthlyCalendar0.setHeaderFont((Font) fontUIResource0);
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test11()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Dimension dimension0 = monthlyCalendar0.getCellDimension();
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("java.awt.Dimension[width=27,height=20]", dimension0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      int int0 = monthlyCalendar0.getYear();
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, int0);
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test
  public void test13()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      
      TitledBorder titledBorder0 = new TitledBorder((String) null);
      monthlyCalendar0.setBorder((Border) titledBorder0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test14()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getHighlightForeground();
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(255, color0.getGreen());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test
  public void test15()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      int int0 = monthlyCalendar0.getMonth();
      assertEquals(7, int0);
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      JInternalFrame.JDesktopIcon jInternalFrame_JDesktopIcon0 = jInternalFrame0.getDesktopIcon();
      Color color0 = jInternalFrame_JDesktopIcon0.getForeground();
      monthlyCalendar0.setHighlightForeground(color0);
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test17()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.getHeaderComponent();
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test18()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.resetHighlight();
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test19()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.getHeaderFont();
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test
  public void test20()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getHeaderBackground();
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertNotNull(color0);
      assertEquals(122, color0.getRed());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test21()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      JToolBar jToolBar0 = new JToolBar(0);
      Dimension dimension0 = jToolBar0.getMaximumSize();
      monthlyCalendar0.setPreferredSize(dimension0);
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test22()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setHighlightBackground((Color) null);
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test23()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getDateBackground();
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(255, color0.getRed());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertNotNull(color0);
  }

  @Test
  public void test24()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setDateBackground((Color) null);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test
  public void test25()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setHeaderBackground((Color) null);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test26()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setMouseListeningEnabled(false);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test27()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setMouseListeningEnabled(true);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test
  public void test28()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.setYear(255);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Year must be later than 1970!
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.setMonth((-1113));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid month specified!
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.setMonth(1250);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid month specified!
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)monthlyCalendar0.getSelectedDate();
      assertNotNull(gregorianCalendar0);
      
      monthlyCalendar0.setYearMonth((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1375296429725,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Belfast\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=Europe/Belfast,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2013,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=212,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=47,SECOND=9,MILLISECOND=725,ZONE_OFFSET=0,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals(1375296429725L, gregorianCalendar0.getTimeInMillis());
  }

  @Test
  public void test32()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Dimension dimension0 = defaultTreeCellRenderer0.getPreferredSize();
      monthlyCalendar0.setCellDimension(dimension0);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=21,height=0]]", monthlyCalendar0.toString());
  }

  @Test
  public void test33()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      monthlyCalendar0.setHeaderComponent((JComponent) jRadioButtonMenuItem0);
      // Undeclared exception!
      try {
        monthlyCalendar0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test34()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setYearMonth(1454, 1454);
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)monthlyCalendar0.getSelectedDate();
      assertEquals(1575, monthlyCalendar0.getYear());
      assertEquals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Belfast\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=Europe/Belfast,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1575,MONTH=1,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=28,DAY_OF_YEAR=183,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=47,SECOND=34,MILLISECOND=922,ZONE_OFFSET=0,DST_OFFSET=3600000]", gregorianCalendar0.toString());
  }

  @Test
  public void test36()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseEvent mouseEvent0 = new MouseEvent((Component) monthlyCalendar0, 0, (long) 0, 0, (-801), 0, 0, false);
      monthlyCalendar0.mouseEntered(mouseEvent0);
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("java.awt.event.MouseEvent[unknown type,(-801,0),absolute(0,0),button=0,clickCount=0] on com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", mouseEvent0.toString());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test37()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseEvent mouseEvent0 = new MouseEvent((Component) monthlyCalendar0, 479, 1763L, 0, 0, 0, 479, false, 0);
      monthlyCalendar0.mouseExited(mouseEvent0);
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test38()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 0, (long) 0, (-1401), (-1401), (-1401), 1336, 0, (-1190), false, (-1401), 1831, (-1190));
      monthlyCalendar0.mouseClicked((MouseEvent) mouseWheelEvent0);
      assertEquals(0, monthlyCalendar0.getSelectedDay());
  }

  @Test
  public void test39()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 0, (long) 0, 31, 31, 31, 1336, 0, (-1190), false, (-1401), 1831, (-1190));
      monthlyCalendar0.mouseClicked((MouseEvent) mouseWheelEvent0);
      assertEquals(1, monthlyCalendar0.getSelectedDay());
  }

  @Test
  public void test40()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent((Component) monthlyCalendar0, (-1401), 0L, (-1401), (-1401), (-1401), (-1401), (-1401), 742, true, menuElementArray0, (MenuSelectionManager) null);
      monthlyCalendar0.mousePressed((MouseEvent) menuDragMouseEvent0);
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test41()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MonthlyCalendar monthlyCalendar1 = new MonthlyCalendar();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar1, 1158, (long) 1158, 1, 1158, 1, 1158, 0, 0, true, 1, 0, 0);
      // Undeclared exception!
      try {
        monthlyCalendar0.mousePressed((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * You are not supposed to install 'this' mouse handler to any component other than itself.
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 0, (long) 0, 0, 80, 0, 0, 1985, 0, true, 0, (-558), (-1));
      monthlyCalendar0.mouseReleased((MouseEvent) mouseWheelEvent0);
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("java.awt.event.MouseWheelEvent[unknown type,(80,0),absolute(0,1985),button=0,clickCount=0,scrollType=WHEEL_UNIT_SCROLL,scrollAmount=-558,wheelRotation=-1] on com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", mouseWheelEvent0.toString());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(7, monthlyCalendar0.getMonth());
  }

  @Test
  public void test43()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MonthlyCalendar monthlyCalendar1 = new MonthlyCalendar();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar1, 557, (long) (-801), 0, 547, 0, (int) (byte)1, false, 557, 0, 557);
      // Undeclared exception!
      try {
        monthlyCalendar0.mouseReleased((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * You are not supposed to install 'this' mouse handler to any component other than itself.
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 31, 0L, 31, 31, 31, 31, false, 31, 31, 31);
      monthlyCalendar0.mouseMoved((MouseEvent) mouseWheelEvent0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(2013, monthlyCalendar0.getYear());
  }

  @Test
  public void test45()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) defaultTreeCellRenderer0, (-740), (long) 0, (-740), (-740), 440, 3, false, 0, 0, 1);
      // Undeclared exception!
      try {
        monthlyCalendar0.mouseMoved((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * You are not supposed to install 'this' mouse motion handler to any component other than itself.
         */
      }
  }

  @Test
  public void test46()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseEvent mouseEvent0 = new MouseEvent((Component) monthlyCalendar0, 0, (-1640L), 0, (-1070), (-1), 0, true);
      monthlyCalendar0.mouseDragged(mouseEvent0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals(true, monthlyCalendar0.getWeekStartOnSunday());
      assertEquals("java.awt.event.MouseEvent[unknown type,(-1070,-1),absolute(0,0),button=0,clickCount=0] on com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", mouseEvent0.toString());
  }

  @Test
  public void test47()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 0, (long) 0, 31, 31, 31, 1336, 0, (-1190), false, (-1401), 1831, (-1190));
      MonthlyCalendar monthlyCalendar1 = new MonthlyCalendar();
      // Undeclared exception!
      try {
        monthlyCalendar1.mouseDragged((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * You are not supposed to install 'this' mouse motion handler to any component other than itself.
         */
      }
  }

  @Test
  public void test48()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 0, (long) 0, 0, 80, 0, 0, 1985, 0, true, 0, (-558), (-1));
      monthlyCalendar0.mouseDragged((MouseEvent) mouseWheelEvent0);
      assertEquals(7, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2013, monthlyCalendar0.getYear());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
  }
}
