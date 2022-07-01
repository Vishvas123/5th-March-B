package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void MyMethod() {
	  
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			System.out.println("MyMethod is running");
  }
  
  @Test
  public void MyMethod1() {
	  
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			Reporter.log("MyMethod1 is running");
			
  }
  @Test
  public void MyMethod2() {
	  
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com");
			Reporter.log("MyMethod2 is running", true);
  }
  
  }

