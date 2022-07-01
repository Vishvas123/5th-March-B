package FrameworkWithParametarization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;

public class KiteTestCrossBrowser {
  public class KiteTestClassUsingTestNG {
		KiteLoginPage Login;
		KitePinPage Pin;
		KiteHomePage Homepage;
		Sheet Mysheet;
		WebDriver driver;
		
		@Parameters("browser")
		@BeforeClass
		public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException
		{
			if (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if (browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
				 driver=new FirefoxDriver();
				
			}
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com");
			Reporter.log("Launching Browser", true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Login= new KiteLoginPage(driver);
			Pin= new KitePinPage(driver);	
			Homepage = new KiteHomePage(driver);
			File myFile= new File("D:\\Excelreading.xlsx");
		    Mysheet= WorkbookFactory.create(myFile).getSheet("sheet4");
		}
		
	  @BeforeMethod
	  public void LoginToKite() 
	  {
		  Login.SendUserName(Mysheet.getRow(0).getCell(0).getStringCellValue());
		  Reporter.log("sending username",true);
		  Login.SendPassword(Mysheet.getRow(0).getCell(1).getStringCellValue());
		  Reporter.log("sending password",true);
		  Login.ClickOnLoginButton();
		  Reporter.log("clicking on login button",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  Pin.SendPin(Mysheet.getRow(0).getCell(2).getStringCellValue());
		  Reporter.log("sending pin", true);
		  Pin.ClickOnContinueButton();
		  Reporter.log("clicking on continue button", true);
	  }
	  @Test
	  public void VerifyKiteUserId()
	  {
		  //expected username will get from excel
		  //actaul userid??
		  
		  String ExpectedUserId = Mysheet.getRow(0).getCell(0).getStringCellValue();
		  String ActualUserId = Homepage.actualUserId();
		  Reporter.log("validating userid", true);
		  Assert.assertEquals(ExpectedUserId,ActualUserId,"ExpectedUserId and ActualUserId is not matchig, TC failed");
		  Reporter.log("ExpectedUserId and ActualUserId is matchig, TC passed", true);
	  }
	  @AfterMethod
	  public void LogOutFromKiteApp() throws InterruptedException
	  {
		  Homepage.ClickOnLogOutButton();
		  Reporter.log("logging out from kite", true);
	  }
	  @AfterClass
	  public void CloseBrowser()
	  {
		  Reporter.log("closing browser",true);
		 driver.close();
		 
	  }

		
	}

}
