package com.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testTEST {
  @Test
  public void f1() {
	  System.out.println("test");
	  test testDemo = new test() ;
	  testDemo.init();
	  
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER");
  }

}
