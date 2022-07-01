package kiteWithExcel_POM1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com ");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	// we want to use UN,PWD,PIN from excel sheet. hence we are using the excel program
			// for multiple users
			File myfile= new File("D:\\Excelreading.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4");
		//	
			
			int LastRowCount = mysheet.getLastRowNum();
				
			for( int i=0;i<=LastRowCount;i++)
			{
					String userName = mysheet.getRow(i).getCell(0).getStringCellValue();
					String Password = mysheet.getRow(i).getCell(1).getStringCellValue();
					String kitepin = mysheet.getRow(i).getCell(2).getStringCellValue();
		       
					// for Kiteloginpage
			KiteLoginPage Login= new KiteLoginPage(driver);
			Login.senUserName(userName);// here instead of giving direct values we are using variables
			Login.sendPassword(Password);
			Login.clickOnLoginButton();
			
			//for Kitepin page
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KitePinPage pin=new KitePinPage(driver);
			pin.sendPin(kitepin);
			pin.ClickOnContinueButton();
			
			//for Kitehomepage
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KiteHomePage homepage=new KiteHomePage(driver);
			homepage.validateUserId(userName);
			homepage.clickOnLogOutButton();
			
			Thread.sleep(1000);
			Login.clickChnageUser();			
		}
			driver.close();
	}
	}


