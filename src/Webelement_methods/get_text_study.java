package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_study {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zomato.com");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			//use of getText
			WebElement Element1 = driver.findElement(By.xpath("//h1[@class='sc-7kepeu-0 kYnyFA description']"));
            System.out.println(Element1.getText());
            WebElement Element;
			String actualtext=Element1.getText();
			String Expectedtext = "Discover the best food & drinks in Pune";
			
			if(actualtext.equals(Expectedtext))
			{
				System.out.println("text is matching");
			}
			else
			{
				System.out.println("text is not matching");
			}
	}

}
