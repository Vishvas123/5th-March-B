package kiteWithExcel_POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	// vRIBALES
	
	@FindBy(id="pin") private WebElement PIN;
    @FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
    
   // constructor
    
    public KitePinPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //methods
    
    public void sendPin (String pin)// here pin is variable whose written type is string
    {
    	PIN.sendKeys(pin);
    }
     
    public void ClickOnContinueButton()
    {
    	continueButton.click();
    }


}


