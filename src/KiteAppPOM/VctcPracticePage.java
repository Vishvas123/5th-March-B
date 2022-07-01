package KiteAppPOM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcPracticePage {
//1. variables
	@FindBy(xpath="//input[@value='Radio1']") private WebElement Radiobutton;
	@FindBy(id="hide-textbox")private WebElement Hidebutton;
	@FindBy(xpath="//legend[text()='iFrame Example']") private WebElement Iframebutton;
	
	
// 2. constructor
	
	public VctcPracticePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	
	public WebElement radioButton()
	{
		WebElement RadioButton1 = Radiobutton;
		return RadioButton1;
	}
	
	public WebElement hidebutton()
	{
	    WebElement Hidebutton1 = Hidebutton;
		return Hidebutton1;
	}
	
	public WebElement iframebutton()
	{
		Object iframebutton1 = Iframebutton;
		return Iframebutton;
		
	}
	
}
