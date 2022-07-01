package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//switch selenium focus from main page to frame
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		//current focus is on frame now
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click(); //this element is present on iframe(need to switch from main page to frame)
		// to take a action on main page we need to switch selenium focus from frame to main page
		//there are 2 methods---parentframe(),default content();
		
		driver.switchTo().defaultContent();//switching selenium focus to main page
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
	}

}
