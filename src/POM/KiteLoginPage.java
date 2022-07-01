package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// declaration of data members/variables
	
      @FindBy(id="userid") private WebElement UN;
      @FindBy(id="password") private WebElement PWD;
      @FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
      
      // use of constructor 
      public KiteLoginPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }

      // use of methods
      
      public void sendUserName() 
      {
    	  UN.sendKeys("ELR321");
      }
      public void sendPassword()
      {
    	  PWD.sendKeys("Dhana1111");
      }
      public void clickOnLoginButton()
      {
    	  LoginButton.click();
      }
      
      
      
      
      
}



