package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 {
	@Test(groups = "regression")
	  public void Mymethod6() 
	  {
		  Reporter.log("Mymethod 6 regression is running", true);
	  }
	  @Test
	  public void Mymethod7()
	  {
		  Reporter.log("Mymethod 7 is running", true);
	  }
	  @Test(groups = "sanity")
	  public void Mymethod8()
	  {
		  Reporter.log("Mymethod 8 sanity is running", true);
	  }
	  @Test
	  public void Mymethod9()
	  {
		  Reporter.log("Mymethod 9 is running", true);
	  }
	  @Test(groups = "regression")
	  public void Mymethod10()
	  {
		  Reporter.log("Mymethod 10 regression is running", true);
	  }
}
