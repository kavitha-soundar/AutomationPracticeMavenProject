package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

	public ResultSet getData(String query)
	{
		ResultSet dataSet = null;
		try
		{
		Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DVDShop","postgres","admin");
		dataSet = connect.createStatement().executeQuery(query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return dataSet;
	}
	
	public List<Map<String,String>> readData(String query)
	{
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		ResultSet dataSet = getData(query);
		
		try {
			while(dataSet.next())
			{
				for( int col=1; col<= dataSet.getMetaData().getColumnCount();col++)
				{
				Map<String,String> dbData = new HashMap<String, String>();
				String columnName = dataSet.getMetaData().getColumnName(col);
				String columnValue = dataSet.getString(col);
				dbData.put(columnName, columnValue);
				data.add(dbData);
				}
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return data;
	}
}
