package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteAppUtility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassForScreenshotUsingListener {

		protected static WebDriver driver;
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
		
		public void takescreenshot(String TCname) throws IOException
		{
			File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest= new File("D:\\screenshots\\screenShotq"+TCname+".png");
			FileHandler.copy(Src, dest);
		}
}
