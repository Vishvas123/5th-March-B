package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable1_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement OTPbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	   Thread.sleep(5000);
	         boolean Result = OTPbutton.isEnabled();
	        System.out.println("OTP button is clicked "+Result);
	        
	    driver.findElement(By.id("mobileNumber")).sendKeys("8149695585");
	    Thread.sleep(1000);
	    
	                boolean Result1 = OTPbutton.isEnabled();
	                
	                {
	                	System.out.println("OTP Button is clicked "+ Result1);
	                }
	}

}
