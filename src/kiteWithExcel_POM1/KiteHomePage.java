package kiteWithExcel_POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	// variable or data members

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	//constructor
	
	public KiteHomePage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void validateUserId(String ExpectedUsername)// here ExpectedUsername is variable
	{
		String actualUserId = userId.getText();
		String ExpectedUserId = ExpectedUsername;
		
		if (actualUserId.equals(ExpectedUserId))
		{
			System.out.println("UserId is matching, TC is passed");
		}
		else
		{
			System.out.println("Userid is not matching, TC is failed");
		}
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(1000);
		logoutButton.click();
		
	}
	}

