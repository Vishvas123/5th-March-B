package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
		List<WebElement> NoOfRows = driver.findElements(By.xpath("//tr"));
	    List<WebElement> NoOfColumns = driver.findElements(By.xpath("//th"));
	
	    int TotalNoOfRows = NoOfRows.size();
	    int TotalNoOfColumns = NoOfColumns.size();
	    
	    System.out.println("total no of rows are "+ TotalNoOfRows);
	    System.out.println("total no of columns are "+ TotalNoOfColumns);
	    
	    // we want to print all rows and all columns
	    //using Nested for loop
	    for(int i = 1;i<=TotalNoOfRows;i++)
	    {
	    	for (int j=1;j<=TotalNoOfColumns;j++)
	    	{
	    		if(i==1)// here "tr=1" then elements will be "th"
	    		{
	 String Text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
	    	  System.out.print(Text + " ");
	    		}
	    		else // here "tr=2" then elements will be "td"
	    		{
	String Text1 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
	    		System.out.print(Text1 + " ");
	    		}
	    		}
	    		System.out.println();
	    }
	
	}
	
	}


