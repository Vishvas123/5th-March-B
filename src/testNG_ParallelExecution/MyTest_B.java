package testNG_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest_B {
	@Test
	  public void MyMethod2() {
		  
				System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.com");
				Reporter.log("MyMethod2 is running", true);
	  }
}
