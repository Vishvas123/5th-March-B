package testNGAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationstudy2 {
  @Test
  public void MyTest3() 
  {
	  Reporter.log("Test method 3 is running", true);
  }
  @Test
  public void MyTest4()
  {
	  Reporter.log("Test method 4 is running", true);
  }
  @BeforeClass
  public void launchBroswer()
  {
	  Reporter.log("Before class is running", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("After class is running", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before method is runing", true);
  }
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("After method is running", true);
  }
  }