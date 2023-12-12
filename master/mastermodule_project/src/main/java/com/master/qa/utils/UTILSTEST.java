package com.master.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.master.qa.base.BASETEST;

public class UTILSTEST  extends BASETEST {

	public UTILSTEST() throws Throwable {
		super();
	}
	public static String ExcelData = "C:\\Users\\Admin\\Downloads\\.metadata\\mastermodule_project\\src\\main\\java\\com\\master\\qa\\testdata\\usertypes.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	
	 public static Object[][] getExcelData(String sheetname) { 
			FileInputStream file = null;
			try {
				file = new FileInputStream(ExcelData);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			
			}
			try {
				book = WorkbookFactory.create(file);
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			sheet = book.getSheet(sheetname);
			Object[][] data = new Object [sheet.getLastRowNum()] [sheet.getRow(0).getLastCellNum()];
			for(int r = 0; r<sheet.getLastRowNum(); r++) {
				for(int k = 0; k<sheet.getRow(0).getLastCellNum(); k++) {
					DataFormatter df = new DataFormatter();
					data[r][k] = df.formatCellValue(sheet.getRow(r+1).getCell(k));
				}
			}
			return data;
					
				}
	
	
	
}
