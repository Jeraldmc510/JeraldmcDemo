package shoppersstack.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ReadAddressPropertiesFromExcel {
	
	public FileInputStream fis = null;
	public Workbook wb;
	public Object[][] readAddressproperties (String excelname, String sheetname){
		try {
			fis = new FileInputStream("./src/test/resources/"+excelname+".xlsx");
		} catch(FileNotFoundException e) {
			Reporter.log("path to excel wrong", true);
		}
		
		try {
			wb = WorkbookFactory.create(fis);
		}catch(IOException e) {
			Reporter.log("WorkBook not created", true);
		}
		
		Sheet sheet = wb.getSheet(sheetname);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(columnCount);
		Object[][] data = new Object[rowCount -1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0; j<columnCount;j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i][j]);
			}
		}
		return data;
		
	}
	

}
