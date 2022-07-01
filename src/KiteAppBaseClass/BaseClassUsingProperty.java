package KiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteAppUtility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty
{
	protected WebDriver driver;
	// browser setup
	
	public void openBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromPropertyFile("URL"));
		Reporter.log("Launching Browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
