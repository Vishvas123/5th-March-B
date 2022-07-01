package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ( "webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://vctcpune.com/selenium/practice.html");
            
            //Thread.sleep(100);
            //driver.findElement(By.xpath("//input[@value='Radio1']")).click();
            
            //driver.findElement(By.xpath("//input[@value='Radio4']")).click();
	}
   
}
