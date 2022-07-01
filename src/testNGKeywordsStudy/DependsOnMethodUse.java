package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
  @Test
  public void D()
  {
	  //Assert.fail();
	  Reporter.log("Test method D is running", true);
  }
  @Test
  public void C() 
  {
	  
	  Reporter.log("Test method C is running", true);
  }
  @Test(dependsOnMethods = {"C"})
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
