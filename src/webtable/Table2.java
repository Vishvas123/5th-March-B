package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// we want the size of the rows
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNoOFRows = rows.size();// we want to use object multiple time hence saved as reference variable
		System.out.println(" the size of the rows are "+ TotalNoOFRows);
		
		// we want to read all rows of the table
	                 for(WebElement r:rows)
	                 {
	                	// System.out.println(r.getText());
	                	 System.out.println("||" +r.getText() +" ||");
	                 }
		
	              // we want the size of the columns
	       List<WebElement> columns = driver.findElements(By.xpath("//th"));
	        int TotalNoOFcolumns = columns.size();// we want to use object multiple time hence saved as reference variable
	       System.out.println(" the size of the rows is "+ TotalNoOFcolumns);
	       
	    // we want to read all columns of the table
	       for (WebElement c:columns)
	       {
	    	   //System.out.print(c.getText());
	    	   System.out.print("||" +c.getText() +" ||");
	       }
		
	}

}
