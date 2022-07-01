package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUseWithDefaultZero {
  @Test
  public void D()
  {
	  Reporter.log("Test method D is running", true);
  }
  @Test
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
//if we have not mentioned the priority then it takes default=0 and execute in alphabetical order.