/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jsecurity.cache.HashtableCacheManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HashtableCacheManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      hashtableCacheManager0.getCache("");
  }
}