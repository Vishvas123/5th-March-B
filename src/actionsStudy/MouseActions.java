package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//move to element using mouse actions
		Actions act= new Actions(driver);
		WebElement Element = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		act.moveToElement(Element).perform();
		
		//click using mouse actions
		WebElement Testelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		//1st way
		//act.moveToElement(Testelement).perform();
	    //	act.click().perform();
		
		//2nd way
		//act.moveToElement(Testelement).click().build().perform();
		
		//3rd way
		act.click(Testelement).perform();
		
		
		//right click--context click
		//1st way
		//act.moveToElement(Testelement).contextClick().build().perform();
		//2nd way
		act.contextClick(Testelement).perform();
		
	}
	
	
}