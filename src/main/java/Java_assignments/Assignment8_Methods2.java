package Java_assignments;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*Employee Table
 * 
| S.No 	| Name           	| Base Salary 	| Experience(Years) 	| Year-End Rating (Out of 5) 	|
|------	|----------------	|-------------	|-------------------	|----------------------------	|
| 1    	| Alice Johnson  	| 75000       	| 5                 	| 4.2                        	|
| 2    	| Bob Smith      	| 68000       	| 3                 	| 3.8                        	|
| 3    	| Carol Davis    	| 82000       	| 7                 	| 4.5                        	|
| 4    	| David Brown    	| 90000       	| 10                	| 2                          	|
| 5    	| Eva Green      	| 60000       	| 2                 	| 3.5                        	|

Hike

| Rating     	| % of base Salary as variable pay 	| Bonus       	|  
| > =4       	| 15                               	| 1500        	|  
| >=3 && < 4 	| 10                               	| 1200        	|  
| < 3        	| 3                                	| 300         	|


Extra Perks
Employees with Experience >= 5 Years get extra Reward of 5000;

There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the
Values in Map with EmployeeName and HikePercentagevalue and Print them.

Hike = ( Base Salary * variable pay % ) + Bonus+Reward ;
Hike % = Hike / Base Salary .
 */

public class Assignment8_Methods2 {
	
	public static void main(String[] args) {
		
		// Using Object class to store multiple data types value

		Map<String, Object> emp1= new HashMap<String,Object>();
		
		emp1.put("Name", "Alice Johnson");
		emp1.put("Base Salary", 75000);
		emp1.put("Experience(Years)", 5);
		emp1.put("Year-End Rating (Out of 5)", 4.2);
		
		Map<String, Object> emp2= new HashMap<String,Object>();
		
		emp2.put("Name", "Bob Smith");
		emp2.put("Base Salary", 68000);
		emp2.put("Experience(Years)", 3);
		emp2.put("Year-End Rating (Out of 5)", 3.8);
		
		Map<String, Object> emp3= new HashMap<String,Object>();
		
		emp3.put("Name", "Carol Davis");
		emp3.put("Base Salary", 82000);
		emp3.put("Experience(Years)", 7);
		emp3.put("Year-End Rating (Out of 5)", 4.5);
		
		Map<String, Object> emp4= new HashMap<String,Object>();
		
		emp4.put("Name", "David Brown");
		emp4.put("Base Salary", 90000);
		emp4.put("Experience(Years)", 10);
		emp4.put("Year-End Rating (Out of 5)", 2);
		
		Map<String, Object> emp5= new HashMap<String,Object>();
		
		emp5.put("Name", "Eva Green");
		emp5.put("Base Salary", 60000);
		emp5.put("Experience(Years)", 2);
		emp5.put("Year-End Rating (Out of 5)", 3.5);
		
		List<Map<String,Object>> employeeList = new LinkedList<Map<String,Object>>();
		
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		
		Map<String, String> EmployeeHikeDetails =  new HashMap<String,String>();
		String hikePercent;
		
		for(Map<String, Object> emp: employeeList)
		{
			EmployeeHikeDetails.put("Employee Name",(String) emp.get("Name"));
			hikePercent= hikeAmount(emp.get("Base Salary"),emp.get("Experience(Years)"),emp.get("Year-End Rating (Out of 5)"));
			EmployeeHikeDetails.put("Hike Percent",hikePercent);	
			System.out.print("Employee name : "+ EmployeeHikeDetails.get("Employee Name"));
			System.out.format(", Hike Percent : %.2f\n",Double.valueOf(EmployeeHikeDetails.get("Hike Percent")));
		}	
		
	}
	
	
	public static String hikeAmount(Object Salary,Object experience, Object yearEndRating)
	{
		Double hikeAmount = 0.0;
		int variablePay= 0;
		int bonus =  0;
		int reward = 0;
		Double hikePercent = 0.0;
		Float rating = Float.parseFloat(yearEndRating.toString());
		int exp = Integer.valueOf(experience.toString());
		int baseSalary =  Integer.valueOf(Salary.toString());
		
		
		
		if(rating >=4)
		{
			variablePay=15;
			bonus= 1500;
		}
		else if (rating>=3 && rating < 4)
		{
			variablePay=10;
			bonus= 1200;
		}
		else if (rating<3 )
		{
			variablePay=3;
			bonus= 300;
		}
		if(exp >= 5)
		{
			reward =5000;
			
		}
		hikeAmount =  (double) (((baseSalary*variablePay)/100)+bonus+reward);
		
		hikePercent = ((hikeAmount/baseSalary)*100);
		return hikePercent.toString();
		
	}


}
