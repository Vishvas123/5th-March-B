package KiteAppTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import KiteAppBaseClass.VctcBaseClass;
import KiteAppPOM.VctcPracticePage;
import KiteAppUtility.VctcUtilityProperty;

public class VctcScrollScreenshotProperty extends VctcBaseClass{
	VctcPracticePage PracticePage;
	
  @BeforeClass
  public void LaunchBrowser() throws IOException 
  {
	  openBrowser();
	  
	  PracticePage= new VctcPracticePage(driver);  
	  VctcUtilityProperty.implicitwait(driver, 1000);
  }
  @Test(priority=1)
  public void ScrolltoRadioButton() throws IOException
  {
	  
	  VctcUtilityProperty.ScrollintoElement(driver, PracticePage.radioButton());
	 
	//  VctcUtilityProperty.takescreenshot(driver);
  }
  @Test(priority=2)
  public void ScrollintoHidebutton() throws IOException
  {
	 
	 VctcUtilityProperty.ScrollintoElement(driver, PracticePage.hidebutton());
	// VctcUtilityProperty.takescreenshot(driver);
	 
  }
  @Test(priority=3)
  public void Scrollintoiframe() throws IOException 
  {
	
	 VctcUtilityProperty.ScrollintoElement(driver, PracticePage.iframebutton());
	// VctcUtilityProperty.takescreenshot(driver);
	 
  }

}
