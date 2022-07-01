package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityForScreenShotUsingProperty {

//	public static void takeScreenshot(WebDriver driver) throws IOException 
//	{
//		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 String Random = RandomString.make(3);
//		 File Dest= new File("D:\\screenshots\\screenShotp"+Random+".png");
//		 FileHandler.copy(source, Dest);
//	}
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream myprop= new FileInputStream("C:\\Users\\Nick\\eclipse-workspace\\5th march b batch_selenium\\myproperty.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;	
	}
	
	public static void implicitwait(WebDriver driver, int timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	}
}
