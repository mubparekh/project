/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.ide.eclipse.server.ui.wizard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.core.TaskModel;
import org.eclipse.wst.server.ui.wizard.IWizardHandle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SapNWServerWizardFragmentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SapNWServerWizardFragment sapNWServerWizardFragment0 = new SapNWServerWizardFragment();
      boolean boolean0 = sapNWServerWizardFragment0.hasComposite();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      NullProgressMonitor nullProgressMonitor0 = new NullProgressMonitor();
      SapNWServerWizardFragment sapNWServerWizardFragment0 = new SapNWServerWizardFragment();
      // Undeclared exception!
      try {
        sapNWServerWizardFragment0.performFinish((IProgressMonitor) nullProgressMonitor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SapNWServerWizardFragment sapNWServerWizardFragment0 = new SapNWServerWizardFragment();
      // Undeclared exception!
      try {
        sapNWServerWizardFragment0.createComposite((Composite) null, (IWizardHandle) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument cannot be null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SapNWServerWizardFragment sapNWServerWizardFragment0 = new SapNWServerWizardFragment();
      TaskModel taskModel0 = new TaskModel();
      sapNWServerWizardFragment0.setTaskModel(taskModel0);
      boolean boolean0 = sapNWServerWizardFragment0.isComplete();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SapNWServerWizardFragment sapNWServerWizardFragment0 = new SapNWServerWizardFragment();
      sapNWServerWizardFragment0.enter();
      assertEquals(true, sapNWServerWizardFragment0.hasComposite());
  }
}
