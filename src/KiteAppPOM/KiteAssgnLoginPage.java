package KiteAppPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAssgnLoginPage {
//VARIABLES
	@FindBy(id="userid")private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	@FindBy(xpath="//p[@class='error text-center']")private WebElement InvalidUseridPwd;
	@FindBy(xpath="(//span[@class='su-message'])[1]") private WebElement UserIdErrorMSG;
	@FindBy(xpath="(//span[@class='su-message'])[2]") private WebElement PwdErrorMSG;

	// 2. constructor
	 public KiteAssgnLoginPage (WebDriver driver)
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
	 
	 public String CommonErrorMSG1() throws InterruptedException
	 {
		
		
		  String msg1 = InvalidUseridPwd.getText();
		return msg1;
	 }
	 
	 public String CommonErrorMSG2() throws InterruptedException
	 {
		 
		 String msg2 = UserIdErrorMSG.getText();
		return msg2;
	 }
	 
	 public String CommonErrorMSG3() throws InterruptedException
	 {
		
	 String msg3 = PwdErrorMSG.getText();
	return msg3;
	 }
	 
	 public void ClearUserIdPasswordField() throws InterruptedException
	 {
		 UN.clear();
		 Thread.sleep(1000);
		 PWD.clear();
		 Thread.sleep(1000);
	 }
 
}
	 

