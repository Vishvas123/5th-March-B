package Misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applephone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Text = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	Text.sendKeys("iphone 13 pro");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

	WebElement Ratings = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[2]"));
	 System.out.println(Ratings.getText());
	 
	 WebElement Reviews = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[4]"));
	System.out.println(Reviews.getText());
	
	}

}
