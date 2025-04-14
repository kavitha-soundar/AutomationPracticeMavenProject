package utilTest;

import java.util.List;
import java.util.Map;

import utilities.DBUtils;

public class DbTest {

	public static void main(String[] args) {
		
		DBUtils dbconnect = new DBUtils();
		
		List<Map<String,String>> result = dbconnect.readData(DBQueries.TopTenHorrorEnglishMovies);
		
		for(Map<String,String> row : result)
		{
			System.out.println(row);
		}
	}

}
