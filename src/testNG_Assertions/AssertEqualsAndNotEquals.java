package testNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void mymethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("MyMethod is running");
		
		WebElement A = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	   String ActualText = A.getText();
		String Expectedtext = "VELOCITY CORPORATE TRAINING CENTER";
	 Assert.assertEquals(ActualText, Expectedtext,"Text is not matching and TC is failed");
	  Reporter.log("Text is matching and TC is passed", true);
	  
	  Assert.assertNotEquals(Expectedtext, ActualText,"Text is matching and TC is failed");
	  Reporter.log("Text is not matching and TC is passed", true);
  }
}
