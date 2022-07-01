package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
//1. variables
	
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
 
	//2. constructor
	
	public KitePinPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	
	public void SendPin(String pin)// here pin is variable whose return type is string
	{
		PIN.sendKeys(pin);
	}
    
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}




}
