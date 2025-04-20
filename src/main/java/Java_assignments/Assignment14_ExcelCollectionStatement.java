package Java_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utilities.ExcelUtils;

public class Assignment14_ExcelCollectionStatement {
	
	public static void main(String[]  args)
	{
		String Config_Properties= "Config.properties";
		String PropertyName     = "Collections_AssignmentExcelFile";
		String SheetName1       = "StudentDetails";
		String SheetName2       = "EmployeeDetails";
		String SheetName3       = "ProductDetails";
		
		List<Map<String,String>> studentDetails = new ArrayList<Map<String,String>>();
		List<Map<String,String>> EmployeeDetails = new ArrayList<Map<String,String>>();
		List<Map<String,String>> ProductDetails = new ArrayList<Map<String,String>>();
		
		studentDetails= ExcelUtils.readExcelData(Config_Properties, PropertyName, SheetName1);
		EmployeeDetails= ExcelUtils.readExcelData(Config_Properties, PropertyName, SheetName2);
		ProductDetails= ExcelUtils.readExcelData(Config_Properties, PropertyName, SheetName3);
	
		for(Map<String,String> map: ProductDetails)
		{
			if(map.get("Product ID").equalsIgnoreCase("P002"))
				{
					System.out.println("P002 product id supplier value is : "+ map.get("Supplier"));
				}
		}
	}
}
