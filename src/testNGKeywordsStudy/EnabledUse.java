package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void D()
  {
	  Reporter.log("Test method D is running", true);
  }
  @Test(enabled =false)// if we are using enabled=false then that TC/test method will not execute.
  // default value of enabled is true
  public void C()
  {
	  Reporter.log("Test method C is running", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("Test method B is running", true);
  }
  @Test
  public void A()
  {
	  Reporter.log("Test method A is running", true);
  }
}
