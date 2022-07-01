package KiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClasses {

	protected WebDriver driver;
	//browser setup
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		Reporter.log("Launching Browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
