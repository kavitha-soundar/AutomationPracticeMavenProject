package Java_assignments;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {
/*
 * 
 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Map<String, Object> empDetails = new HashMap<String, Object>();
		 
		 empDetails.put("EmpId", "E001");
		 empDetails.put("Name", "Alice Green");
		 empDetails.put("Age", 30);
		 empDetails.put("Gender", "Female");
		 empDetails.put("Department", "Engineering");
		 empDetails.put("Position", "Software Engineer");
		 empDetails.put("Salary", 75000);
		 empDetails.put("Email", "alice@example.com");
		 empDetails.put("ContactNumber",9876543213L);
		 
		 Map<String, Object> empDetails1 = new HashMap<String, Object>();
		 
		 empDetails1.put("EmpId", "E002");
		 empDetails1.put("Name", "Bob Johnson");
		 empDetails1.put("Age", 35);
		 empDetails1.put("Gender", "Male");
		 empDetails1.put("Department", "Marketing");
		 empDetails1.put("Position", "Marketing Manager");
		 empDetails1.put("Salary", 85000);
		 empDetails1.put("Email", "bob@example.com");
		 empDetails1.put("ContactNumber",9876543214L);

		 Map<String, Object> empDetails2 = new HashMap<String, Object>();
		 
		 empDetails2.put("EmpId", "E002");
		 empDetails2.put("Name", "Bob Johnson");
		 empDetails2.put("Age", 35);
		 empDetails2.put("Gender", "Male");
		 empDetails2.put("Department", "Marketing");
		 empDetails2.put("Position", "Marketing Manager");
		 empDetails2.put("Salary", 85000);
		 empDetails2.put("Email", "bob@example.com");
		 empDetails2.put("ContactNumber",9876543214L);

		
		 List<Map<String,Object>> employeeDetails =  new LinkedList<Map<String,Object>>();
		 
		 employeeDetails.add(empDetails);
		 employeeDetails.add(empDetails1);
		 employeeDetails.add(empDetails2);
		 
		 System.out.println("Email id of the employee : "+ employeeDetails.get(1).get("Email"));
		 

	}

}
