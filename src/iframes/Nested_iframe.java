package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		
		//step 1 switch selenium focus from main page to frame 1
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		//step 2 switch selenium focus from main frame to parent frame
		WebElement Parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
	     System.out.println(Parent.getText());
	     Thread.sleep(1000);
	     
	     //step3 switch selenium focus from  parent frame to child frame
	    
	    
	     Thread.sleep(2000);
	     WebElement Frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	     driver.switchTo().frame(Frame2);
	     WebElement Child = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	    System.out.println(Child.getText());
	    Thread.sleep(2000);
	
	}

}
