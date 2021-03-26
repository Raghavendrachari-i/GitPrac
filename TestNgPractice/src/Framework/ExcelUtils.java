package Framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils
{

	@SuppressWarnings("resource")
	public static String getData (String testCaseName, String dataColumnName)
	{
		String data ="";
		try 
		{
			//Assignment : Centralize this filepath. Think through it and implement your idea
			String dataFileFullPath = "C:\\Users\\B.Raghavendrachari\\Downloads\\TestDataNew-Session.xls";
			
			//File 
			File file = new File(dataFileFullPath);
			FileInputStream fis = new FileInputStream(file);
			
			//Assignment : Customize this invocation with if else condtion to handle both xls and xlsx file. Hint : Start with Workbook instead of HSSF or XSSF
			//WorkBook
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			//Iterate and get the last used row
			int totalRowsUsed = sheet.getPhysicalNumberOfRows();
			int dataRow = 0;
	//FINDING ROW		
			//Assignmemt: Understand why we are starting with startRow =1. What is the reason for using break in the loop? Explain it clearly
			int startRow = 1;
			
			for(int i=0; i<totalRowsUsed-1; i++)
			{
				String checkTCName = sheet.getRow(startRow).getCell(0).getStringCellValue();
				
				if(checkTCName.equalsIgnoreCase(testCaseName))
				{
					dataRow = startRow;
					break;
				}
				
				startRow++;
			}
	//FINDING COLUMN		
			int totalColsUsed = sheet.getRow(0).getPhysicalNumberOfCells();
			int dataCol = 0;
			int startCol = 1;
			
			for(int j=0; j<totalColsUsed-1; j++)
			{
				String checkColName = sheet.getRow(0).getCell(startCol).getStringCellValue();
				
				if(checkColName.equalsIgnoreCase(dataColumnName))
				{
					dataCol = startCol;
					break;
				}
				
				startCol++;
			}
			
	//GETTING THE EXACT DATA
			
			//Assignment: Handle this data variable to hold different data type like String, int, boolean, double 
			data = sheet.getRow(dataRow).getCell(dataCol).getStringCellValue().trim();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return data;
	}
}
