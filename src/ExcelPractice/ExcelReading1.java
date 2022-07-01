package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myfile=new File("D:\\Excelreading.xlsx");
		Workbook book = WorkbookFactory.create(Myfile);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType Celltype = cell.getCellType();
		System.out.println(Celltype);
	    String Name1 = cell.getStringCellValue();
            System.out.println(Name1);
	}

}
