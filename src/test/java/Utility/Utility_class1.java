package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility_class1 {
	
	public static String getTD(int rowindex,int colindex)throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\SURESH\\Book1.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("sheet1");
		String data= sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
		
	}
	public static void captureScreenshot(WebDriver driver,String suresh) {
		
		try {
			String random =RandomString.make(2);
			TakesScreenshot ts=(TakesScreenshot)driver;
				File src =ts.getScreenshotAs(OutputType.FILE);
				
				File dest=new File("C:\\Users\\admin\\Desktop\\Scrinshot\\maven.jpg"+random); 
				FileHandler.copy(src, dest);
				System.out.println("Screenshoot has taken");
		}
		catch(Exception e){
			System.out.println("Excution while taking screenshot " + e.getMessage());
		}
	}

}
