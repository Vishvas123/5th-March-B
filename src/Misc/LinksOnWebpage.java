package Misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     List<WebElement> links = driver.findElements(By.tagName("a"));
     
    System.out.println(links.size());
    
    //print all links text by using iterator
    Iterator<WebElement> it = links.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next().getText());
    }
    System.out.println("====================================================");
    
    // print all links by using for each loop
    
	for( WebElement y:links)
    {
    	System.out.println(y);
    }
    System.out.println("====================================================");
    //print all links text by using listiterator
    ListIterator<WebElement> lit = links.listIterator();
    while(lit.hasNext())
    {
    	System.out.println(lit.next().getText());
    }
    System.out.println("=====================================================");
    //by using for loop
    for(int i=0;i<=links.size()-1;i++)
    {
    	System.out.println(links.get(i));
    }
    
   	}

}
