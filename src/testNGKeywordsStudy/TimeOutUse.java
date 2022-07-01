package testNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test
  public void D()
  {
	  Reporter.log("Test method D is running", true);
  }
  @Test(timeOut = 1000)// here if we are providing the time=1400 then this method will be executed
  public void C() throws InterruptedException
  {
	  Thread.sleep(1200);
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
