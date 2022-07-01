package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xpath_attributes_text_contains {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ( "webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(100);
        
        //xpath by attributes
        
     // driver.findElement(By.xpath("//button[@name='login']")).click();
         //xpath by text
        
      //  driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
        //driver.findElement(By.xpath("Facebook helps you connect and share with the people in your life.")).click();
	
        // contains with attributes
     driver.findElement(By.xpath("//h2[contains (@class,'Facebook helps you ')]"));
	    
       //contains with text
      //driver.findElement(By.xpath("//h2[contains (text(),'Facebook helps you connect and share with the people in your life.')]"));
	}

}
