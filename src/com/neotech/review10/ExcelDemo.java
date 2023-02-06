package com.neotech.review10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";

		FileInputStream fis = new FileInputStream(fullPath);

		// Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);
//get the sheet from excel file
		Sheet sheet = book.getSheet("Sheet1");
		// get the row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);
		// get the row (with index 2) from the sheet
		Cell cell0 = row2.getCell(0);

		System.out.println(cell0.toString());

		Row headerRow = sheet.getRow(0);

		int cellNumber = headerRow.getLastCellNum(); // howmany cells ?

		System.out.println("========================================================");

		for (int i = 0; i < cellNumber; i++) {

			String cellData = headerRow.getCell(i).toString();
			System.out.print(cellData + "\t");

		}

		System.out.println();

		System.out.println("=======================================================");
//How many rows are in sheet
		int rows = sheet.getPhysicalNumberOfRows();

		for (int row = 1; row < rows; row++) {
			// for each row go from cell 0 to the last cell
			for (int cell = 0; cell < cellNumber; cell++) {
				String cellInfo = sheet.getRow(row).getCell(cell).toString();
				System.out.print(cellInfo + " \t\t");

			}
			System.out.println();
		}

	}

}
