package testNGListeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PuneTest {
  @Test
  public void Hadapsar()
  {
	  Reporter.log("Hadapsar TC is runing", true);
  }
  @Test
  public void Swargate()
  {
	  Reporter.log("Swargate TC is runing", true);
  }
}
