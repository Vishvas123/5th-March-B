package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import KiteAppBaseClass.BaseClasses;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.Utility;

public class ValidateKieUseId extends BaseClasses {
	KiteLoginPage Login;
	KitePinPage pin;
	KiteHomePage Home;
	
	
  @BeforeClass
  public void LaunchBrowser() 
  {
	  openBrowser();
	  Login= new KiteLoginPage(driver);
	  pin= new KitePinPage(driver);
	  Home= new KiteHomePage(driver);	  
  }
  @BeforeMethod
  public void LoginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  Login.SendUserName(Utility.readDataFromExcel(0, 0));
	  Login.SendPassword(Utility.readDataFromExcel(0, 1));
	  Login.ClickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.SendPin(Utility.readDataFromExcel(0, 2));
	  pin.ClickOnContinueButton();
  }
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException
  {
	  String ActualUserName = Home.actualUserId();
	  String ExpectedUserName = Utility.readDataFromExcel(0, 0);
	  
	  Assert.assertEquals(ActualUserName, ExpectedUserName,"Actaulusername is not matching with expectedusername,TC is failed");
      Reporter.log("Actaulusername is matching with expectedusername,TC is passed", true);
      Utility.takeScreenshot(driver);
  }
  
  @AfterMethod
  public void LogOutFromKiteApp() throws InterruptedException 
  {
	  Home.ClickOnLogOutButton();
  }
  @AfterClass
  public void CloseBrowser() 
  {
	  driver.close();
	  
  }  
}
