/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import nu.staldal.lagoon.LagoonAntTask;
import org.apache.tools.ant.BuildException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LagoonAntTaskEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      lagoonAntTask0.setTargetURL("");
      try {
        lagoonAntTask0.execute();
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * mandatory attribute missing
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      lagoonAntTask0.init();
      assertNull(lagoonAntTask0.getTaskType());
  }

  @Test
  public void test2()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      File file0 = new File("AVA6._OPTcJ");
      lagoonAntTask0.setPropertyFile(file0);
      try {
        lagoonAntTask0.execute();
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * java.io.FileNotFoundException: AVA6._OPTcJ (No such file or directory)
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      lagoonAntTask0.setForce(false);
      assertNull(lagoonAntTask0.getTaskName());
  }

  @Test
  public void test4()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      lagoonAntTask0.setPassword("qNs(SgS#lKbn+kR6");
      assertNull(lagoonAntTask0.getDescription());
  }

  @Test
  public void test5()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      try {
        lagoonAntTask0.execute();
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * mandatory attribute missing
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      File file0 = new File((File) null, "");
      lagoonAntTask0.setSitemapFile(file0);
      lagoonAntTask0.setTargetURL("");
      try {
        lagoonAntTask0.execute();
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * mandatory attribute missing
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LagoonAntTask lagoonAntTask0 = new LagoonAntTask();
      File file0 = new File((File) null, "");
      lagoonAntTask0.setSitemapFile(file0);
      lagoonAntTask0.setSourceDir(file0);
      lagoonAntTask0.setTargetURL("");
      try {
        lagoonAntTask0.execute();
        fail("Expecting exception: BuildException");
      } catch(BuildException e) {
        /*
         * java.io.FileNotFoundException: file:///mnt/fastdata/ac1gf/SF110/dist/52_lagoon
         */
      }
  }
}