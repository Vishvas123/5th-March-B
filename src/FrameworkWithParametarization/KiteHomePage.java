package FrameworkWithParametarization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//1. variables
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
	
	//2. constructor
	
	public KiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	public String actualUserId()
	{
		String ActualUserID = UserId.getText();
		return ActualUserID;
	}
	
	public void ClickOnLogOutButton() throws InterruptedException {
		UserId.click();
		Thread.sleep(1000);
		LogOutButton.click();
	}
	
		
	
	
	
	
	
}
