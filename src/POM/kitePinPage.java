package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {

	
		// Declare data members/variables
		
		@FindBy (id="pin") private WebElement PIN;
		@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;

	   // use of constructor
		
		public kitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// use of methods
		
		public void sendPin()
		{
			PIN.sendKeys("982278");
		}
		
		public void clickOnContinueButton()
		{
			continueButton.click();
		}

}
