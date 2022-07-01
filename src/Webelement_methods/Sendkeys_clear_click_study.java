package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_clear_click_study {

	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zomato.com");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	// use of send keys & click & clear
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("8149695585");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Phone number']")).clear();
	Thread.sleep(1000);
	WebElement Login1 = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
	Login1.sendKeys("8149695585");
	Thread.sleep(500);
	Login1.clear();
	
	}

}
