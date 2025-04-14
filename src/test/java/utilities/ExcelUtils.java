package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static void readExcelData(String fileName)
	{
		List<Map<String,String>> data=  new ArrayList<Map<String,String>>();
		Properties prop = PropertyUtils.readData(fileName);
		try {
			FileInputStream file =  new FileInputStream(prop.getProperty("Collections_AssignmentExcelFile"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet  sheet = workbook.getSheet("ProductDetails");
			
			
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		//.args. data;
		
	}
}
