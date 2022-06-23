package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelSheet2 {
	@Test
	public void getRowCount() throws IOException {
		//*****FileLocation
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		
		//*****Create an instance of respective workbook class and provide file location to its constructor
		//XSSFWorkbook workBook=new XSSFWorkbook(fis);
			//or more generic way
		Workbook workbook=new XSSFWorkbook(fis);
		
		//**** Get Sheet info
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
				//or more generic way
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//**** Row info
		int rowCount=sheet.getLastRowNum();//actual row count -1
		System.out.println("Number rows in sheet1: "+rowCount);
		
		//for particular raw
		//XSSFRow row=sheet.getRow(1);
				//or
		 Row row=sheet.getRow(1);		
	}
}
