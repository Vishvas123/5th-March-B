package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty ( "webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.zomato.com/");
       // driver.manage().window().maximize();
        Thread.sleep(1000);
        
        System.out.println(driver.manage().window().getSize());
        
        Thread.sleep(1000);
        // create the object of dimension class 
        Dimension d=new Dimension(200, 300);//mention width & height
        driver.manage().window().setSize(d);
        
        System.out.println(driver.manage().window().getSize());
		
		
	
		
		
		
		
	}

}
