package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/**
	 * This method is used to read String data from excel.
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDatafromExcel(String sheetName, int rowIndex, int columnIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/VTigerdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();

	}
	
	/**
	 * This method is used to read number data from excel.
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public double getNumberDatafromExcel(String sheetName, int rowIndex, int columnIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/VTigerdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	}

	/**
	 * This Method is used to read boolean data from excel.
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDatafromExcel(String sheetName, int rowIndex, int columnIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/VTigerdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
	}
	
	/**
	 * This Method is used to read localdate and time  data from excel in localdate and time format.
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public LocalDateTime getDateAndTimeDatafromExcel(String sheetName, int rowIndex, int columnIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/VTigerdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();
	}
}
