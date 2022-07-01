package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement Checkbox = driver.findElement(By.id("checkBoxOption3"));
		if (Checkbox.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else
		{
			System.out.println("checkbox is now selecting");
		}
		Checkbox.click();
		if(Checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("failed to select checkbox");
		}
			
	}

}
