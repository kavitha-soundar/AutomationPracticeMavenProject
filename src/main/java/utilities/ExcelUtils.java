package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static List<Map<String,String>> readExcelData(String fileName,String propertyName, String sheetname)
	{
		List<Map<String,String>> dataDetails=  new ArrayList<Map<String,String>>();
		Properties prop = PropertyUtils.readData(fileName);
		try {
			FileInputStream file =  new FileInputStream(prop.getProperty(propertyName));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet  sheet = workbook.getSheet(sheetname);
			List<Map<String,String>> sheetDetails =  new LinkedList<>();
			
			int Totalrows =sheet.getPhysicalNumberOfRows();
			int TotalColumns= sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(int row=1;row<Totalrows;row++)
			{
				Map<String,String> data= new HashMap<String, String>();
				for(int col=0;col<TotalColumns;col++)
				{
					
					String key = sheet.getRow(0).getCell(col).getStringCellValue();
					String value = null;
					//System.out.println(" Key is : "+ key);
					if(sheet.getRow(row).getCell(col).getCellType()==CellType.STRING)
					{
						value = sheet.getRow(row).getCell(col).getStringCellValue();
					}
					else if (sheet.getRow(row).getCell(col).getCellType()==CellType.NUMERIC)
					{
						value = String.valueOf(sheet.getRow(row).getCell(col).getNumericCellValue());
					}
					
					//System.out.println(" Value is : "+ value);
					data.put(key, value);
				}
				dataDetails.add(data);
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return dataDetails;
	}
}
