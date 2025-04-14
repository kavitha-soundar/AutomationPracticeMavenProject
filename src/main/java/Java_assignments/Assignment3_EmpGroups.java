package Java_assignments;

/*
 * 	Then, create another class called EmpGroups that contains two arrays to store the employee names and IDs.
	Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
	name along with their corresponding ID.
	Example:
	• Employee Name: Bharath, Employee ID: 1234
 * 
 */
public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		
		Assignment3_Employees employee =  new Assignment3_Employees();
		
		String [] employeeNames = { employee.empName1, employee.empName2, employee.empName3};
		int [] employeeIds= { employee.empId1,employee.empId2, employee.empId3};
		
		System.out.format("Employee Name: %s, Employee ID: %d\n",employeeNames[0],employeeIds[0]);
		System.out.format("Employee Name: %s, Employee ID: %d\n",employeeNames[1],employeeIds[1]);
		System.out.format("Employee Name: %s, Employee ID: %d\n",employeeNames[2],employeeIds[2]);
		

	}

}
