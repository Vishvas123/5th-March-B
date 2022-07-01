package kite.zeroda;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageValidation1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		File Myfile=new File("D:Excelreading.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("sheet4");
		String UN = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	
	     userid.sendKeys(UN);
	     password.sendKeys(PWD);
	     loginButton.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	     WebElement pin = driver.findElement(By.id("pin"));
	 	WebElement continueButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	 	pin.sendKeys(PIN);
	 	continueButton.click();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 	
	 	WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
	 	String actualUserId = username.getText();
	 	String ExpectedUserId = UN;
	 	
	 	if(actualUserId.equals(ExpectedUserId))
		{
			System.out.println("User ID is matching, Tc is passed");
		}
		else
		{
			System.out.println("User ID is not matching, Tc is failed");
		}
		username.click();
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		Thread.sleep(1000);
		driver.close();
		
		}

	}


