package testNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void Mymethod2() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("MyMethod is running");
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		Assert.assertFalse(checkbox.isSelected()," checkbox is selected and TC is failed");
		Reporter.log("checkbox is not selected and TC is passed", true);
		
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected(), "checkbox is not selected and TC is failed");
		Reporter.log("checkbox is selected and TC is passed", true);
  }
}
