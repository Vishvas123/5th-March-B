package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	 //1. data members/variables:
	@FindBy(id="userid")private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;

	// 2. constructor
	 public KiteLoginPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 // 3. Methods
	 public void SendUserName(String userName)// here userName is variable
	 {
		 UN.sendKeys(userName);
	 }
	 
	 public void SendPassword(String pwd)
	 {
		 PWD.sendKeys(pwd);
	 }
	
	 public void ClickOnLoginButton()
	 {
		 LoginButton.click();
		 
	 }
	
	
}
