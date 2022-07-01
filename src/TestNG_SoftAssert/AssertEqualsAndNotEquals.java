package TestNG_SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
	
	SoftAssert soft= new SoftAssert();
	@Test
	  public void mymethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			
			
			WebElement A = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		   String ActualText = A.getText();
			String Expectedtext = "VELOCITY CORPORATE TRAINING CENTER";
		 soft.assertEquals(ActualText, Expectedtext,"Text is not matching and TC is failed");
		 Reporter.log("Text is matching and TC is passed", true);
		  
		  soft.assertNotEquals(Expectedtext, ActualText,"Text is matching and TC is failed");
		  Reporter.log("Text is not matching and TC is passed", true);
		 soft.assertAll();
	  }
	@Test
	  public void Mymethod1() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			
			WebElement N = driver.findElement(By.id("autocomplete"));
			
			String ActualValue = N.getText();
			String ExpectedValue = "NotNull";
			
			
			soft.assertNull(ActualValue,"Value is not null and TC is failed");
			Reporter.log("Value is null and TC is passed", true);
			
			
			soft.assertNotNull( ExpectedValue,"Value is null and TC is failed");
			Reporter.log("Value is not null and TC is passed", true);
			soft.assertAll();
	  }
	@Test
	  public void Mymethod2() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
			
			soft.assertFalse(checkbox.isSelected()," checkbox is selected and TC is failed");
			Reporter.log("checkbox is not selected and TC is passed", true);
			
			checkbox.click();
	        soft.assertTrue(checkbox.isSelected(), "checkbox is not selected and TC is failed");
			Reporter.log("checkbox is selected and TC is passed", true);
			soft.assertAll();
	  }
	
}
