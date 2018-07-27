package com.test;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=3)
  public void f() {
	  System.out.println("in f()");
  }
  @Test(priority=2)
  public void xyz()
  {
	  System.out.println("in xyz()");
  }
  @Test(priority=1)
  public void testabc()
  {
	  System.out.println("in testabc()");
  }
  @Test
  public void pqr()
  {
	  System.out.println("in testabc()");
  }
}
