/*
 * This file was automatically generated by EvoSuite
 */

package bierse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.event.ActionEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultSettingsControllerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Model model0 = new Model();
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController(model0, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "VERTICAL_SCROLLBAR", 167, "VERTICAL_SCROLLBAR");
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals("VERTICAL_SCROLLBAR", actionEvent0.getActionCommand());
  }
}