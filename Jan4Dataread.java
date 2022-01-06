package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Jan4Dataread {

	public static void main(String[] args) throws IOException {
		
		//creating an object for class file
		File f=new File("C:\\Users\\sadia\\workspace\\TestNGLearn\\file\\worksheet.xlsx");
		
		//fin will read data line by line into byte stream
		FileInputStream fin= new FileInputStream(f);
		
		// XSSF will convert fin to workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fin); 
		
		//which particular sheet
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		//will print number of rows in the excel sheet [index starts from 0]
		System.out.println(sheet.getLastRowNum()); 
		
		//how many cells are located inside the program
		XSSFRow heading=sheet.getRow(1);
		System.out.println(heading.getLastCellNum());
		
		
	}

}
