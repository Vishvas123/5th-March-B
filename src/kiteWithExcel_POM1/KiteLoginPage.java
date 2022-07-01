package kiteWithExcel_POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1.Data members/variables
	
	@FindBy(id ="userid")private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
    @FindBy(linkText ="Change user") private WebElement changeUser;
	// constructor
	
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods
	
	public void senUserName(String userName)// here userName is variable
	{
		UN.sendKeys(userName);
	}
	
	public void sendPassword (String pwd) // here pwd is variable
	{
		PWD.sendKeys(pwd);
	}
       public void clickOnLoginButton()
       {
    	   LoginButton.click();
       }
       
	public void clickChnageUser()
	{
		changeUser.click();
		
	}
	}


