package utilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileClass 
{
	public static void excelFile() throws IOException 
	{
		String path = "./Files\\ExtraEdge1.xlsx";
	
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
			
		XSSFSheet sht=wb.getSheet("s");
		
		XSSFRow rw = sht.getRow(0);
		
		XSSFCell cell = rw.getCell(1);
		
		String value=cell.getStringCellValue();
		
		System.out.println(value);
	}
}
