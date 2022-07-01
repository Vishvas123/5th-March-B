package selenium_basic;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdiver_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(200);

		
		// driver.close();
		// driver.quit();
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//driver.get("https://www.facebook.com");
		Thread.sleep(200);
		//driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(200);
		///driver.navigate().back();
		Thread.sleep(200);
		//driver.navigate().forward();
		Thread.sleep(200);
		//driver.navigate().refresh();
		
		String Title =driver.getTitle();
		System.out.println("title "+driver.getTitle());
		
		driver.getCurrentUrl();
	}

}
