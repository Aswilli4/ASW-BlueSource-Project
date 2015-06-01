package dataSheet;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.FileInputStream; // Import all Necessary Packages to be used in this Class

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class LoginDataSheet {
	// Variable Declaration

	public static XSSFWorkbook wb; // access global variable variables accross
									// entire framework
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public static Object[][] getTableArray(String FilePath, String SheetName)
			throws Exception {

		String[][] tabArray = null;
		try {

			fis = new FileInputStream(
					"C:\\Users\\andy.williams\\Desktop\\BlueSourceLogin.xlsx");
			// Access the required test data sheet
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("Sheet1");

			int startRow = 1;
			int startCol = 1;

			int ci, cj;

			int totalRows = sheet.getLastRowNum();

			// function above it to get the total number of rows

			int totalCols = 2;

			tabArray = new String[totalRows][totalCols];

			ci = 0;

			for (int i = startRow; i <= totalRows; i++, ci++) { // use double
																// loop to
																// access cell
																// data, for
																// Rows

				cj = 0;

				for (int j = startCol; j <= totalCols; j++, cj++) { // use
																	// double
																	// loop to
																	// access
																	// cell
																	// data, for
																	// Columns

					tabArray[ci][cj] = getCellData(i, j); // setting
															// multidimensional
															// "tabArray" = to
															// the method
															// "getCellData"
				}
			}
		}

		catch (FileNotFoundException e) {

			Reporter.log("Could not read the Excel sheet"); // So user can be
															// notified if the
															// specific file
															// can't be found

			e.printStackTrace();

		}

		catch (IOException e) {

			Reporter.log("Could not read the Excel sheet"); // Throws for otehr
															// general error not
															// specific to the
															// file being found

			e.printStackTrace();
		}

		return (tabArray);
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception { // This
																				// method
																				// is
																				// to
																				// read
																				// the
																				// test
																				// data
																				// from
																				// the
																				// Excel
																				// cell
																				// In
																				// this
																				// we
																				// are
																				// passing
																				// parameters/arguments
																				// as
																				// Row
																				// Num
																				// and
																				// Col
																				// Num

		try {
			cell = sheet.getRow(RowNum).getCell(ColNum); // If 3 is returned no
															// data

			int dataType = cell.getCellType();

			if (dataType == 3) {

				return "";

			}

			else {

				String CellData = cell.getStringCellValue(); // read the Sting
																// Values from
																// the Cell Data

				return CellData;

			}
		} catch (Exception e) {

			Reporter.log(e.getMessage());

			throw (e);
		}

	}
}
