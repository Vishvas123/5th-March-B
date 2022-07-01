package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switching to iframe from main page
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		
		
		//switching again back to main page from iframe
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}

}
