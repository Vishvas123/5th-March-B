package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class AssignUtilityPropertyFile {

	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(3);
		File dest= new File("D:\\screenshots\\screenShotq"+Random+".png");
		FileHandler.copy(Src, dest);
	}
	
	public static String readDataFromPropertyfile(String key) throws IOException 
	{
		Properties prop= new Properties();
		FileInputStream myprop= new FileInputStream("C:\\Users\\Nick\\eclipse-workspace\\5th march b batch_selenium\\KiteLoginProperty.properties");
	     prop.load(myprop);
	     String value = prop.getProperty(key);
		return value;
	}
	
	public static void implicitwait(WebDriver driver,int Timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Timeunit));
	}
	
}