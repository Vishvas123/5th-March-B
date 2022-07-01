package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
         Actions act=new Actions(driver);
         
         WebElement Text = driver.findElement(By.id("email"));
        // Text.sendKeys("vishvas");
         
         act.keyDown(Text,Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("ishvas").build().perform();
	
	
	}

}
