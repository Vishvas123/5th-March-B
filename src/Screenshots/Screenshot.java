package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//To take screenshot using selenium webdriver, we need to type cast driver object to Takes Screenshot interface.
		//Then we need call function getscreenshotAs(); there we need to pass the argument
		//"Outputtype. FILE"
		 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
		 File destination=new File("D:\\screenshots\\myscreenshot.png");
		 FileHandler.copy(scr, destination);
	       
	       
        // to take multiple screenshots
		 
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                String random = RandomString.make(5);
	                
	                File desti=new File("D:\\screenshots\\screenshots1"+random+".png");
	              FileHandler.copy(Source, desti);
	}

}
