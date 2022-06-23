package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelSheet4 {

	@Test
	public void updateExcel() throws IOException {
		// *****FileLocation
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor
		// XSSFWorkbook workBook=new XSSFWorkbook(fis);
		// or more generic way
		Workbook workbook = new XSSFWorkbook(fis);

		// **** Get Sheet info
		// XSSFSheet sheet=workbook.1
		
		getSheet("Sheet1");
		// or more generic way
		Sheet sheet = workbook.getSheet("Sheet1");

		// **** for particular raw
		// XSSFRow row=sheet.getRow(1);
		// or
		Row row = sheet.getRow(1);
		row.createCell(4).setCellValue("Failed");
		// update excel file content

		// Identify the location where you want to store your new/update data
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		// write you content into your excel file
		workbook.write(fos);
		// flush the content from stream to excel file
		fos.flush();
		// close the stream to save the data
		fos.close();
		System.out.println("Updated excel");
	}

	private void getSheet(String string) {
		// TODO Auto-generated method stub
		
	}

	// Create a method to read all the content of the excel sheet1

	// read row1 data and login into actitime application

	// read row2 data and login into vtiger application
}
