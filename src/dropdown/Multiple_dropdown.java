package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//step 1: Identify list box to be handled and store it in reference variable
		WebElement cars = driver.findElement(By.name("cars"));
		
		//step 2:create object of select class
		Select s= new Select(cars);
		 //step 3: check is Multiple
		boolean Result = s.isMultiple();
		{
			System.out.println(" it is mutiple selction "+ Result);
		}
		// By using one of the select class methods we can select values form list box like
		   // i. selectByVisibleText: selectByVisibleText(String arg0)
		   // ii. selectByIndex: selectByIndex(int arg0)
		   // iii. selectByValue: selectByValue(String arg0)
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		//how to deselect();
		//s.deselectAll();// can be used only for multiple selectable
		s.deselectByVisibleText("Volvo");
		
		System.out.println(s.getFirstSelectedOption().getText());
		WebElement firstWebElement = s.getFirstSelectedOption();
		String Mytext = firstWebElement.getText();
		System.out.println("1st selected option is "+Mytext);
		
		System.out.println(s.getAllSelectedOptions().size());
		for (int i=0;i<s.getAllSelectedOptions().size()-1;i++)
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		}
	
	
	

}
