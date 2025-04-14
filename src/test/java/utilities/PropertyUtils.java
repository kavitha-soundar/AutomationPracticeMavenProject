package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	public static Properties readData(String fileName) 
	{
		Properties prop = new Properties();		
	
		try {
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\"+fileName);
			
			prop.load(fis);	
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return prop;		
	}
}
