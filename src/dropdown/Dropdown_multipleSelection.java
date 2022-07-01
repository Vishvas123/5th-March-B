package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multipleSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
      driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
      Thread.sleep(2000);
      
    //1.Identify list box to be handled and store it in reference variable
      WebElement day = driver.findElement(By.name("birthday_day"));
      
    //2.Create an object of Select class which will accept WebElement as argument
      Select s=new Select(day);
      
      // By using one of the select class methods we can select values form list box like
   // i. selectByVisibleText: selectByVisibleText(String arg0)
   // ii. selectByIndex: selectByIndex(int arg0)
   // iii. selectByValue: selectByValue(String arg0)
      
//      for (int i=0;i<10;i++)
//      {
//    	  Thread.sleep(1000);
//    	  s.selectByIndex(i);
//    	  System.out.println(i);
//      }
//     for (int k=9;k>=0;k--)
//      { 
//    	  Thread.sleep(1000);
//    	  s.selectByIndex(k);
//    	  System.out.println(k);
//      }
//    	  boolean Result = s.isMultiple();
//    	  {
//    		  System.out.println(" multiple slection enable "+Result);
//    	  }
   	  for(int j=0;j<=30;j++)
   	  {
  		  System.out.println(s.getOptions().get(j).getText());
	  }
      
      }

	

}
