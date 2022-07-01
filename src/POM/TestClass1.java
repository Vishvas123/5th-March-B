package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//for kiteLoginPage
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//for kitePinPage
		kitePinPage continue1=new kitePinPage(driver);
		continue1.sendPin();
		continue1.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// for kiteHomePage
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUser();
		home.ClickOnLogoutButton();
		driver.close();
		
		
		
		
		
	}

}
