package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishvas");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("200988");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}
