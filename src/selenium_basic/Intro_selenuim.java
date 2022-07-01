package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro_selenuim {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		
		// use of close
		//driver.close();
		
		// use of Quit
		// driver.quit(); can't keep in running because further codes will not execute
		
		// use of maximize & minimize
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		//driver.close();
		
		//driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
	     // driver.navigate().forward();
		//driver.navigate().refresh();
		
		//use of get title
		
		 String title =driver.getTitle ();
		 System.out.println(title);
		 System.out.println(driver.getTitle ());
		 
		 
		 //use of getcurrent url
		 
		 driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 
		   String url =driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}

