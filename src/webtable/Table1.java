package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		// we want to read sigle element form table
		WebElement SingleElement = driver.findElement(By.xpath("//td[text()='Velocity Trainers']"));
		     System.out.println(SingleElement.getText());
		
		// we want read the heading of the table
		     //kindly note as headings are not mentioned under the "th" tagname, here mentioned  
		     //under the "tr" tagname hence "tr"selected
		List<WebElement> TableHeader = driver.findElements(By.xpath("(//table//tr)[1]"));
	        for (WebElement th:TableHeader)
	        {
	        	System.out.print(th.getText() + " || ");
	        }
	        System.out.println();// enter blank syso as we want enter text in next line
	        
	   // we want to read 5th row
	        List<WebElement> row5 = driver.findElements(By.xpath("(//table//tr)[5]"));
	             for(WebElement r:row5)
	             {
	            	 System.out.print(r.getText() + " ||");
	             }
	
	
	
	
	}

}
