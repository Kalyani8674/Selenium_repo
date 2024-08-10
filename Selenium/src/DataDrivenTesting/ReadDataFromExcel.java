package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		String name = workbook.getSheet("kalyani").getRow(1).getCell(0).getStringCellValue();
	    System.out.println(name);
		
	    long phoneno = (long) workbook.getSheet("kalyani").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(phoneno);
		
		String email = workbook.getSheet("kalyani").getRow(1).getCell(2).getStringCellValue();
		System.out.println(email);
	
		double price=workbook.getSheet("kalyani").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);
		
		boolean status=workbook.getSheet("kalyani").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = workbook.getSheet("kalyani").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
		
		
	}

}
