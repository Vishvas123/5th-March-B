package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
	   // Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).click();
	   // Thread.sleep(1000);
	
	   // driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("1234567890");
	   // driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("200988@123");
	   // Thread.sleep(1000);
	  //  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}

}
