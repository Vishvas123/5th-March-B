package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myfile=new File("D:Excelreading.xlsx");
		
   Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("sheet2");
               // want to read complete sheet
   
   for(int i=0;i<=3;i++) // static coding
   {
	   for(int j=0;j<=3;j++)
	   {
		   String Value = Mysheet.getRow(i).getCell(j).getStringCellValue();
		   System.out.print(Value + "  ");
	   }
	   System.out.println();
   }
   System.out.println("======================================");
   int LastRowNo = Mysheet.getLastRowNum();
   System.out.println(LastRowNo);
   short LastCellNo = Mysheet.getRow(0).getLastCellNum();
   int TotalCellcount = LastCellNo-1;
   System.out.println(TotalCellcount);
   System.out.println("=======================================");
   
   for(int i=0;i<=LastRowNo;i++)//dynamic coding
   {
	   for(int j=0;j<=TotalCellcount;j++)
	   {
		   String Totalsheet = Mysheet.getRow(i).getCell(j).getStringCellValue();
		   System.out.print(Totalsheet + "  ");
	   }
	   System.out.println();
   }
	
	
	
	
	
	
	}

}
