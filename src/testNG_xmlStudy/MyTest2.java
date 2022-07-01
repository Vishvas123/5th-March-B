package testNG_xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
	// we dont want method  8,10
		@Test
	  public void Mymethod6() 
	  {
		  Reporter.log("Mymethod 6 is running", true);
	  }
	  @Test
	  public void Mymethod7()
	  {
		  Reporter.log("Mymethod 7 is running", true);
	  }
	  @Test
	  public void Mymethod8()
	  {
		  Reporter.log("Mymethod 8 is running", true);
	  }
	  @Test
	  public void Mymethod9()
	  {
		  Reporter.log("Mymethod 9 is running", true);
	  }
	  @Test
	  public void Mymethod10()
	  {
		  Reporter.log("Mymethod 10 is running", true);
	  }
}
