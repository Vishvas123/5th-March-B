package testNGListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MumbaiTest {
  @Test
  public void vashi()
  {
	  Assert.fail();
	  Reporter.log("Vashi TC is running", true);
  }
  @Test
  public void Panvel()
  {
	  Reporter.log("Panvel TC is running", true);
  }
}
