package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		
		// to scroll window
		JavascriptExecutor j = ((JavascriptExecutor)driver);
         Thread.sleep(1000);
         driver.manage().window().getSize();
        
      // +ve x value--> right hand side, Y value +ve --> down 
 		// +ve x value--> right hand side, Y value -ve --> up 
 		// -ve x value--> left hand side, Y value +ve --> down 
 		// -ve x value--> left hand side, Y value -ve --> up 

        j.executeScript("window.scrollBy(+3000,+4000)");
         Thread.sleep(1000);
         
        j.executeScript("window.scrollBy(+2000,-3000)");
         Thread.sleep(1000);
         
         j.executeScript("window.scrollBy(-100,+2000)");
        Thread.sleep(1000);
         
        j.executeScript("window.scrollBy(-1000,-1500)");
}
}
