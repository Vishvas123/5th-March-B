package testNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	public class AssertNullAndAssertNotNull {
		  @Test
		  public void Mymethod1() 
		  {
			  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				System.out.println("MyMethod is running");
				
				WebElement N = driver.findElement(By.id("autocomplete"));
				
				String ActualValue = N.getText();
				String ExpectedValue = "NotNull";
				
				Assert.fail();
				Assert.assertNull(ActualValue,"Value is not null and TC is failed");
				Reporter.log("Value is null and TC is passed", true);
				
				
				Assert.assertNotNull( ExpectedValue,"Value is null and TC is failed");
				Reporter.log("Value is not null and TC is passed", true);
				
		  }
}
}
