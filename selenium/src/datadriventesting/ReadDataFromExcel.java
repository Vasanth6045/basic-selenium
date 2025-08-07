package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// step-1 : create Fileinputstream object
		FileInputStream fis=new FileInputStream("./TestData/testscriptdata.xlsx");
		// step-2 : create respective file type data
		Workbook wb=WorkbookFactory.create(fis);
		// step-3 : call read method
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); //to fetch string cell value
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue(); //to fetch string cell value
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();  //to fetch string cell value
		int price = (int) wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();  //to fetch numeric value
		boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue(); // to fetch boolean value
		Date date = wb.getSheet("Sheet1").getRow(1).getCell(5).getDateCellValue(); // to fetch date and time
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(price);
		System.out.println(status);
		System.out.println(date);
		
	}
}
