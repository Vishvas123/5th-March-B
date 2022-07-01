package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 3)
  public void D()
  {
	  Reporter.log("Test method D is running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("Test method C is running", true);
  }
  @Test(invocationCount = 2)
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
