package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUseWithDuplicate {
  @Test(priority = -3)
  public void Divya()
  {
	  Reporter.log("Test method Divya is running", true);
  }
  @Test(priority = 2)
  public void C()
  {
	  Reporter.log("Test method C is running", true);
  }
  @Test(priority = -1)
  public void B()
  {
	  Reporter.log("Test method B is running", true);
  }
  @Test(priority = -3)
  public void Divansh()
  {
	  Reporter.log("Test method Divansh is running", true);
  }
}
//if priority is duplicate then it will follows the alphabetical order along with priority.
//it follows the -3,-2,-1,0,1,2,3 sequence when we are giving the priority.
