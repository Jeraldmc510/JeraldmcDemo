package shoppersstack.fileutility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;
public class ReadExcelData {
	public Workbook wb ;
	public FileInputStream fis;
	
	public Object[][] getFromExcel(String excel, String sheetName){
		try {
			fis = new FileInputStream(excel);
			
		}catch(FileNotFoundException e) {
					e.printStackTrace();
		}
		
		try {
			wb = WorkbookFactory.create(fis);
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(columnCount);
		Object[][] data = new Object[rowCount][columnCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0; j<columnCount;j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i][j]);
			}
		}
		
		System.out.println(data);
		return data;
		
	}
	
//	public static void main(String[] args) {
//		ReadExcelData excel=new ReadExcelData();
//		excel.getFromExcel("./src/test/resources/Book1.xlsx", "Sheet1");
//		
//	}

}
