package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
	@Test(groups = "sanity")
	  public void Mymethod1() 
	  {
		  Reporter.log("Mymethod 1 sanity is running", true);
	  }
	  @Test
	  public void Mymethod2()
	  {
		  Reporter.log("Mymethod 2 is running", true);
	  }
	  @Test(groups = "regression")
	  public void Mymethod3()
	  {
		  Reporter.log("Mymethod 3 regression is running", true);
	  }
	  @Test
	  public void Mymethod4()
	  {
		  Reporter.log("Mymethod 4 is running", true);
	  }
	  @Test(groups = "sanity")
	  public void Mymethod5()
	  {
		  Reporter.log("Mymethod 5 sanity is running", true);
	  }
}
