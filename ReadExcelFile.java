package assignment.week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static String[][] readExcelData(String fileName) throws IOException{
		//set the excel path
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelData/W3School.xlsx") ;
		//get the excel sheet
		XSSFSheet sheetAt = wb.getSheetAt(0);
		//get the count of how many rows
		int rowCount = sheetAt.getLastRowNum();
		System.out.println("no of rows: "+ rowCount);
		
		short columnCount = sheetAt.getRow(0).getLastCellNum();
		System.out.println("no of columns: "+ columnCount);
		
		String data[][] = new String[rowCount][columnCount];
		for(int i=1; i<= rowCount; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for(int j=0; j< columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println("cellValue: "+ cellValue);
				data[i-1][j]=cellValue;
			}
		}
		return data;
	}
}
