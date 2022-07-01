package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUseWithPositiveAndNegativeInteger {
  @Test(priority = -3)
  public void D()
  {
	  Reporter.log("Test method D is running", true);
  }
  @Test(priority = -1)
  public void C()
  {
	  Reporter.log("Test method C is running", true);
  }
  @Test(priority = 1)
  public void B()
  {
	  Reporter.log("Test method B is running", true);
  }
  @Test(priority = 2)
  public void A()
  {
	  Reporter.log("Test method A is running", true);
  }
}

// it follows the -3,-2,-1,0,1,2,3 sequence when we are giving the priority.
