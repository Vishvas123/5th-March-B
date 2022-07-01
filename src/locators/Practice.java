package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.']")).click();
	
		driver.findElement(By.xpath("//input[contains(@name,\"pass')]")).click();
	    Thread.sleep(200);
	    driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
	
	    driver.findElement(By.xpath("(//input[@placeholder='Email address or phone number'])[1]")).click();
	}

}
