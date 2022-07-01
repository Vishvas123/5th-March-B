package KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClassUsingProperty;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.UtilityUsingPropertyFile;

public class KiteUNTestUsingProperty extends BaseClassUsingProperty
{
	KiteLoginPage Login;
	KitePinPage pin;
	KiteHomePage Home;
	
  @BeforeClass
  public void LaunchBrowser() throws IOException 
  {
	  openBrowser();
	  Login= new KiteLoginPage(driver);
	  pin= new KitePinPage(driver);
	  Home=new KiteHomePage(driver);  
  }
  @BeforeMethod
  public void LogiToKiteApp() throws IOException 
  {
	  Login.SendUserName(UtilityUsingPropertyFile.readDataFromPropertyFile("UN"));
	  Login.SendPassword(UtilityUsingPropertyFile.readDataFromPropertyFile("PWD"));
	  Login.ClickOnLoginButton();
	  UtilityUsingPropertyFile.implicitwait(driver,200);
	  
	  pin.SendPin(UtilityUsingPropertyFile.readDataFromPropertyFile("PIN"));
	  pin.ClickOnContinueButton();
	  
	  UtilityUsingPropertyFile.implicitwait(driver,200);  
  }
  @Test
  public void ValidateUserName() throws IOException
  {
	 String ActualUserName = Home.actualUserId();
	 String ExpectedUserName = UtilityUsingPropertyFile.readDataFromPropertyFile("UN");
	 
	 Assert.assertEquals(ActualUserName, ExpectedUserName,"Actualusername is not matching with Expectedusrname, TC is failed");
	 Reporter.log("Actualusername is matching with Expectedusrname, TC is passed", true);
	 UtilityUsingPropertyFile.takeScreenshot(driver);
  }
  
  @AfterMethod
  public void LogOutFromKiteApp() throws InterruptedException
  {
	Home.ClickOnLogOutButton();
  }
  
  @AfterClass
  public void CloseBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	 driver.close(); 
  }
}
