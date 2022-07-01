package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//use isEnabled
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		
		WebElement Mobno = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
	        Mobno.sendKeys("1234567890");
	        Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
	    Thread.sleep(5000);
	    WebElement OTPbutton = driver.findElement(By.xpath("//span[text()='Send OTP']"));
	     boolean Result1 = OTPbutton.isEnabled();
	    
	    	System.out.println("OTP button got clicked "+Result1);
	    
	
	}

}
