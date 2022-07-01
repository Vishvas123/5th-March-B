package KiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteAppUtility.AssignUtilityPropertyFile;
import KiteAppUtility.UtilityUsingPropertyFile;

public class AssignBaseClassProperty {

	protected WebDriver driver;
	
	public void OpenBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AssignUtilityPropertyFile.readDataFromPropertyfile("URL"));
		Reporter.log("Launching Browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
