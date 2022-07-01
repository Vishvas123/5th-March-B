package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  // we want method 2,3,5 and dont want 1,4
	@Test
  public void Mymethod1() 
  {
	  Reporter.log("Mymethod 1 is running", true);
  }
  @Test
  public void Mymethod2()
  {
	  Reporter.log("Mymethod 2 is running", true);
  }
  @Test
  public void Mymethod3()
  {
	  Reporter.log("Mymethod 3 is running", true);
  }
  @Test
  public void Mymethod4()
  {
	  Reporter.log("Mymethod 4 is running", true);
  }
  @Test
  public void Mymethod5()
  {
	  Reporter.log("Mymethod 5 is running", true);
  }

}
