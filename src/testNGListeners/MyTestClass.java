package testNGListeners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListeners.Listener.class)
public class MyTestClass {
	@Test
	public void myTest() {
		Assert.fail();
	}
	
  @Test(dependsOnMethods = {"mytest"})
  public void myMethod() 
  {
	  //Assert.fail();
	  Reporter.log("HI GM", true);
  }
}
