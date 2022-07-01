package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();	
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  
      //double click
      Actions act=new Actions(driver);
  
      WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
 	  act.doubleClick(element).perform();
 	  
	
	  Alert alt=driver.switchTo().alert();//switch to alert
	
	  alt.accept();// alert accepted
	
	
	
	
	
	}

}
