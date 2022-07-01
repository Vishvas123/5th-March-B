package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
        Thread.sleep(2000);
		//move to 1st place	
		WebElement mh = driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",mh);
		Thread.sleep(1000);
		
		//move to 2nd place
		WebElement ht = driver.findElement(By.id("hide-textbox"));
		
		JavascriptExecutor ja = ((JavascriptExecutor)driver);
		Thread.sleep(1000);
		ja.executeScript("arguments[0].scrollIntoView(true);",ht);
	}

}
