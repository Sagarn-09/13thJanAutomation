package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelSheet {
	@Test
	public void getSheetCount() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println("Number of sheets present in excel file: "+sheetCount);
		
		//get all the sheet names
		//String sheetName=workbook.getSheetName(0);
		
		for(int i=0;i<sheetCount;i++) {
			System.out.println(workbook.getSheetName(i));
		}
	}
}
