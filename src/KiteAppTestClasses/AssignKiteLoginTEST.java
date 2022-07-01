package KiteAppTestClasses;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KiteAppBaseClass.AssignBaseClassProperty;
import KiteAppPOM.KiteAssgnLoginPage;
import KiteAppPOM.KiteLoginPage;
import KiteAppUtility.AssignUtilityPropertyFile;

public class AssignKiteLoginTEST extends AssignBaseClassProperty {
	KiteAssgnLoginPage Login;
	SoftAssert soft= new SoftAssert();
  @BeforeClass
  public void LaunchBrowser() throws IOException 
  {
	  OpenBrowser();
	  Login= new KiteAssgnLoginPage(driver);  
	  AssignUtilityPropertyFile.implicitwait(driver, 1000);
	  
  }
  
  @Test(priority=1)
  public void LoginWithBlankData() throws InterruptedException, IOException
  {
	  Reporter.log("Login with blank data", true);
	  Login.ClearUserIdPasswordField();
	  Login.ClickOnLoginButton();
	  AssignUtilityPropertyFile.implicitwait(driver, 1000);
	  String actualUserName1 = Login.CommonErrorMSG2();
	  String ExpectedUserName1 = AssignUtilityPropertyFile.readDataFromPropertyfile("MSG2");
	  soft.assertEquals(actualUserName1,ExpectedUserName1,"CommonError message is not matching,TC is failed");
      Reporter.log("CommonError message is matching,TC is passed", true);
      String actualUserName2 = Login.CommonErrorMSG3();
	  String ExpectedUserName2 = AssignUtilityPropertyFile.readDataFromPropertyfile("MSG3");
      soft.assertEquals(actualUserName2,ExpectedUserName2,"CommonError message is not matching,TC is failed");
      Reporter.log("CommonError message is matching,TC is passed", true);
      AssignUtilityPropertyFile.implicitwait(driver, 1000);
      
      soft.assertAll(); 
 }
  @Test(priority=2)
  public void LoginWithValidUsername() throws IOException, InterruptedException
  {
	  Reporter.log("Login with valid username", true);
	  Login.SendUserName(AssignUtilityPropertyFile.readDataFromPropertyfile("UN"));
	  Login.SendPassword(AssignUtilityPropertyFile.readDataFromPropertyfile("PWD"));
	  Login.ClickOnLoginButton();
	  AssignUtilityPropertyFile.implicitwait(driver, 1000);
	  soft.assertEquals(Login.CommonErrorMSG1(), AssignUtilityPropertyFile.readDataFromPropertyfile("MSG1"),"UseridError message is not matching,TC is failed");
	  Reporter.log("UseridError message is matching,TC is passed", true);
	  
	  soft.assertAll(); 
  }
  @Test(priority=3)
  public void LoginWithInValidUsername() throws IOException, InterruptedException
  {
	  Reporter.log("Login with Invalid username", true);
	  Login.ClearUserIdPasswordField();
	  Login.SendUserName(AssignUtilityPropertyFile.readDataFromPropertyfile("UN1"));
	  Login.SendPassword(AssignUtilityPropertyFile.readDataFromPropertyfile("PWD1"));
	  Login.ClickOnLoginButton();
	  AssignUtilityPropertyFile.implicitwait(driver, 1000);
	  String actualUserName3=Login.CommonErrorMSG1();
	  String ExpectedUserName3=AssignUtilityPropertyFile.readDataFromPropertyfile("MSG1");
	  soft.assertEquals(actualUserName3, ExpectedUserName3,"passwordError message is not matching,TC is failed");
	  Reporter.log("PasswordError message is matching,TC is passed", true);
	  
	  soft.assertAll(); 
  }
  }

