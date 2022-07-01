package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ( "webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
       // driver.manage().window().maximize();
    Thread.sleep(1000);
    
      System.out.println(driver.manage().window().getPosition()); 
      
      Thread.sleep(1000);
      
    //To set Position--> use Point class and create object of Point class
      Point p=new Point(100,150);//mention int x & y
      
      
    driver.manage().window().setPosition(p);
      
    System.out.println(driver.manage().window().getPosition());
	}

}
