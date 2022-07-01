package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        Actions act=new Actions(driver);
       WebElement src= driver.findElement(By.xpath("//a[text()=' 5000']"));
	   
      WebElement dest = driver.findElement(By.id("amt8"));
	
	//1st way
   //   act.dragAndDrop(src, dest).perform();
      
	
	//2nd way
      act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}

}
