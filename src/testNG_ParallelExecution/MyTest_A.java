package testNG_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest_A {
	@Test
	  public void MyMethod1() {
		  
				System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com");
				Reporter.log("MyMethod1 is running", true);
				
	  }
}
