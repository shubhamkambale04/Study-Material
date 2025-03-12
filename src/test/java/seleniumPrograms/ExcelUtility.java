package seleniumPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public String path;

	public ExcelUtility(String path) throws IOException {
		this.path=path;
		fis = new FileInputStream(path); 
		workbook = new XSSFWorkbook(fis);
		}

	// Get Row Count from a Sheet
	public int getRowCount(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		return sheet.getPhysicalNumberOfRows();
	}

	// Get Cell Count from a Row
	public int getCellCount(String sheetName, int rownum) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		return row.getPhysicalNumberOfCells();
	}

	// Get Data from a Specific Cell
	public String getCellData(String sheetName, int rownum, int colnum) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		return cell.getStringCellValue();
	}
}
