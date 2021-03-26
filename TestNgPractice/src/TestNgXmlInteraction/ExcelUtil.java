package TestNgXmlInteraction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil {
	public static void main(String[] args) throws IOException
	{
		File file=new File("C:\\Users\\B.Raghavendrachari\\Downloads\\TestDataNew-Session.xls");
		FileInputStream xlfile=new FileInputStream(file);
		
		HSSFWorkbook workbook=new HSSFWorkbook(xlfile);
		HSSFSheet sheet=workbook.getSheet("Sheet 1");
		
		for(int i=0;i<=1;i++)
		{
		HSSFRow row=sheet.getRow(3);
		HSSFCell cell=row.getCell(3);
		
		System.out.println(cell.getStringCellValue());
		}
	}

}
