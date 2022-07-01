package KiteAppUtility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class Utility 
{

	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("D:\\Excelreading.xlsx");
	    Sheet Mysheet = WorkbookFactory.create(myFile).getSheet("sheet4");
		String MyValue = Mysheet.getRow(row).getCell(cell).getStringCellValue();
	    return MyValue;
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(3);
		File dest= new File("D:\\screenshots\\testScreenshot"+Random+".png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
}
