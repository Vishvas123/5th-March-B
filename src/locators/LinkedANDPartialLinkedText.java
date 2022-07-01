package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedANDPartialLinkedText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Dining Out")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Nightlife")).click();
	}

}
