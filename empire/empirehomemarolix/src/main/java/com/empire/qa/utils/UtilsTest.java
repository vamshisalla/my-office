package com.empire.qa.utils;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.empire.qa.base.BaseTest;

public class UtilsTest extends BaseTest {
public UtilsTest() throws Throwable {
	super();
}
public static String ExcelData = "C:\\Users\\Admin\\Downloads\\.metadata\\empirehomemarolix\\src\\main\\java\\com\\empire\\qa\\testdata\\EHome.xlsx";
static Workbook book;
static Sheet sheet;
public static String primaryimg = "C:\\Users\\Admin\\Pictures\\Saved Pictures\\x440image";
public static void dropdownmethod(WebElement ele, String value) {
       Select select = new Select(ele);
       select.selectByVisibleText(value);
}
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
   public static void UploadingFile() throws Throwable  {
	   Robot robot = new Robot();
	   robot.delay(2000);
	   StringSelection ss = new StringSelection(primaryimg);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_V); 
	   robot.keyPress(KeyEvent.VK_ENTER); 
	   robot.keyRelease(KeyEvent.VK_ENTER);
   }
	public static void ScreenshotMethod()   throws Throwable {
		       File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		       String dest = System.getProperty("user.dir");
		       FileUtils.copyFile(src, new File(dest + "/EmpireScreenshots/" + System.currentTimeMillis() + ".png"));      
		       	       
	}
}



