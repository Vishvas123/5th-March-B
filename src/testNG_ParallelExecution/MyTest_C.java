package testNG_ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest_C {
	@Test
	  public void MyMethod3() {
		  
				System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.zomato.com/");
				Reporter.log("MyMethod3 is running", true);
	  }
}
