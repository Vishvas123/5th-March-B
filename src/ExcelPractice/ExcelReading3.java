package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile=new File("D:Excelreading.xlsx");
          Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
          
          //want to read whole column
          for (int i=0;i<=3;i++)//static coding
          {
        	  String Values = Mysheet.getRow(i).getCell(0).getStringCellValue();
        	  System.out.println(Values);
          }
          System.out.println("===================================");
          int LastRowNo = Mysheet.getLastRowNum();
          System.out.println(LastRowNo);
          short LastCellNo = Mysheet.getRow(0).getLastCellNum();
          int TotalCellCount = LastCellNo-1;
          System.out.println(TotalCellCount);
          System.out.println("===================================");
          
          for(int i=0;i<=TotalCellCount;i++)//dynamic coding
          {
        	 String Value = Mysheet.getRow(i).getCell(1).getStringCellValue();
        	 System.out.println(Value);
          }
	}

}
