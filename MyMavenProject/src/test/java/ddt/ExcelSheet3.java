package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelSheet3 {
	@Test
	public void getCellCount() throws IOException {
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
		
		//**** for particular raw
		//XSSFRow row=sheet.getRow(1);
				//or
		 Row row=sheet.getRow(1);	
		
		//*** Cell info
		int cellCount= row.getLastCellNum();//actual count
		System.out.println("Cell count in row1 of sheet1: "+cellCount);
		
		//get cell 
		//XSSFCell cell=row.getCell(0);
			//or 
		Cell cell=row.getCell(2);
		
		//get value form cell
		String cellValue=cell.getStringCellValue();
		System.out.println("cell value form row1 sheet1: "+cellValue);
		System.out.println("************************");
		//get all cell value
		for(int i=0;i<cellCount;i++) {
			System.out.println(row.getCell(i).getStringCellValue());
		}
	}
}
