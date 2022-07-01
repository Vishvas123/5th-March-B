package POM;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//use of variables/data members
	
    @FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
    @FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
   
   //use of constructor
  public KiteHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  // use of methods
   public void validateUser()
   {
	   String ActualUserId = UserId.getText();
	   String ExpextedUserId = "ELR321";
	   if(ActualUserId.equals(ExpextedUserId))
	   {
		   System.out.println("UserId is matching, TC is passed");
	   }
	   else
	   {
		   System.out.println("UserId is not matching, TC is failed");
	   }
   }
   public void ClickOnLogoutButton() throws InterruptedException
   {
	   UserId.click();
	   Thread.sleep(1000);
	   LogOutButton.click();
	   
   }
}


