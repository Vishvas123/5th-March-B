package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myfile=new File("D:Excelreading.xlsx");
		
	Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("sheet3");
	
	//want to read total sheet having multiple data type
	
	int TotalRowcount = Mysheet.getLastRowNum();
	System.out.println(TotalRowcount);
	short LastcellNo = Mysheet.getRow(TotalRowcount).getLastCellNum();
		int TotalCellcount = LastcellNo-1;
		System.out.println(TotalCellcount);
		System.out.println("===============================");
		
		for(int i=0;i<=TotalRowcount;i++)
		{
			for (int j=0;j<=TotalCellcount;j++)
			{
				Cell value = Mysheet.getRow(i).getCell(j);
				CellType type = value.getCellType();
				
				if(type==CellType.NUMERIC)
				{
					System.out.print(value.getNumericCellValue()+ "  ");
				}
				else if (type==CellType.BOOLEAN)
				{
					System.out.print(value.getBooleanCellValue()+ "  ");
				}
				else if (type==CellType.STRING) 
				{
					System.out.print(value.getStringCellValue()+ "  ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print("=="+ "  ");
				}
				
			}
			System.out.println();
		}
	
	
	}

}
