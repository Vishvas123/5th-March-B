package Misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultielementUnorderedList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Text = driver.findElement(By.xpath("//input[@type='text']"));
	         Text.sendKeys("Rollsroyce");
	         List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	 
	         
	      for (WebElement result:searchresults)
	      {
	    	  System.out.println(result.getText());// used only for printing the list
	    	  System.out.println("===============================");
	      }
	
	      String ExpectedResult = "rolls royce ghost";// it is our expected result
	     
	      for(WebElement Results:searchresults) // for each loop used to get the elements on page
	      {
	    	//  System.out.println(Results.getText());
	    	  String Actualresult = Results.getText();// we need to use it hence saved in refrence variable
	    	  
	    	if(Actualresult.equals(ExpectedResult)) // here we comparing the both actual & expected results
	    	{
	    		Results.click();
	    		break; //  if not break the loop then it will continue for matching 
	    	}
	      }
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	      
	    //  driver.findElement(By.linkText("Images")).click();//find element by using linktext locator
	       driver.findElement(By.partialLinkText("Images")).click(); // find element by usig partail link locator
	}

}
