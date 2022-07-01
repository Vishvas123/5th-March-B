package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile=new File("D:\\Excelreading.xlsx");
  Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
  
      //reading whole row
         for(int i=0;i<=3;i++)//static coding
    {
    	String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
    	System.out.println(value);
    	
    }
        System.out.println("=================================");
         int LastRowNo = Mysheet.getLastRowNum();//identified total no of rows
         System.out.println(LastRowNo);
         short LastCellNo = Mysheet.getRow(0).getLastCellNum();
         int TotalCellcount = LastCellNo-1;
         System.out.println(TotalCellcount);
         System.out.println("==================================");
         
         for(int i=0;i<=TotalCellcount;i++)//dynamic coding
         {
        	 String Value = Mysheet.getRow(0).getCell(i).getStringCellValue();
        	 System.out.println(Value);
         }
	}

}
