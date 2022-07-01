package synchronizationORWait_SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		WebDriverWait wt=new WebDriverWait (driver,Duration.ofMillis(1000));
	     WebElement Home = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		wt.until(ExpectedConditions.visibilityOf(Home));

        Home.click();

	}

}
