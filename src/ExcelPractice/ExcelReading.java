package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 File Myfile =new File("D:\\Excelreading.xlsx");
	 
           String name1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	        System.out.println(name1);
	
	       String name2 = WorkbookFactory.create(Myfile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	         System.out.println(name2);
	         
	       double value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1) .getCell(0).getNumericCellValue();
	          System.out.println(value1);
	          
	         double value2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	           System.out.println(value2);
	           
	          String name3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	             System.out.println(name3);
	             
	            String name4 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	           System.out.println(name4);
	           
	          boolean Cond1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	           System.out.println(Cond1);
	           
	          boolean cond2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
	            System.out.println(cond2);
	}

}
