package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Textbox = driver.findElement(By.id("displayed-text"));
		            boolean Result = Textbox.isDisplayed();
		            {
		            	System.out.println("textbox is displayed "+Result);
		            }
		            Textbox.sendKeys("hello");
		    driver.findElement(By.id("hide-textbox")).click();
		    boolean Result1 = Textbox.isDisplayed();
		    {
		    	System.out.println("Textbox is displayed "+Result1);
		    }
	}

}
