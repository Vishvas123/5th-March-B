package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_poppup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts ");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
	  Alert alt = driver.switchTo().alert();
	  System.out.println(alt.getText());
	  
	  Thread.sleep(1000);
	  
	  alt.accept();
	
	}

}
