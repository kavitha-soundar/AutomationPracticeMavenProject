package Java_assignments;

/* Problem: Multi-Dimensional Array Practice
		1. Create a 3D array to represent the following data:
			Semesters as the first dimension.
			Subjects and Marks as the second dimension.
			Actual values for Subject Names and Marks as the third dimension.
		2. From the array:
			Print Semester 3 - Subject 4 and Subject 5 Names.
 			Print Semester 5 - Subject 3 and Subject 6 marks
 * 
 */

public class Assignment2_Arrays {

	public static void main(String[] args) {	
		/*
		 * First way to do multi dimentional array
		 */			
		String[][][] studentDetails = {
				{
					{"Sem 1","Mathematics I","78"},
					{"Sem 1","Physics","85"},
					{"Sem 1","Chemistry","91"},
					{"Sem 1","Computer Programming","74"},
					{"Sem 1","Engineering Drawing","88"},
					{"Sem 1","Basic Electrical Eng","79"}
				},
				{
					{"Sem 2","Mathematics II","82"},
					{"Sem 2","Mechanics","77"},
					{"Sem 2","Environmental Sci.","93"},
					{"Sem 2","Basic Electronics","69"},
					{"Sem 2","Engineering Physics","84"},
					{"Sem 2","Engineering Graphics","90"}
				},
				{
					{"Sem 3","Data Structures ","88"},
					{"Sem 3","Discrete Mathematics","81"},
					{"Sem 3","Digital Electronics","76"},
					{"Sem 3","Operating Systems","92"},
					{"Sem 3","Signals and Systems","85"},
					{"Sem 3"," Object-Oriented Prog.","78"}
				},
				{
					{"Sem 4","Algorithms","91"},
					{"Sem 4","Computer Networks","73"},
					{"Sem 4","Database Systems","89"},
					{"Sem 4","Microprocessors","80"},
					{"Sem 4","Communication Eng.","76"},
					{"Sem 4","Software Engineering","87"}
				},
				{
					{"Sem 5","Probability & Stats","86"},
					{"Sem 5","Machine Learning","88"},
					{"Sem 5","Compiler Design","84"},
					{"Sem 5","Theory of Computation","95"},
					{"Sem 5","Embedded Systems","73"},
					{"Sem 5","Computer Graphics","90"}
				}		
				
		};
			
		/*
		 * for(int i =0; i<5; i++) { for(int j=0;j<studentDetails[i].length;j++) { for
		 * (int k=0;k<studentDetails[i][j].length;k++) {
		 * System.out.format("I value is %d , J value is %d, K value is %d\n",i,j,k);
		 * System.out.println(studentDetails[i][j][k]); } } }
		 */
	System.out.println("Using String data types as whole - reading the multi dimentional array");
	System.out.println("Semester 3 - Subject 4 name is :" + studentDetails[2][3][1]);
	System.out.println("Semester 3 - Subject 5 name is :" + studentDetails[2][4][1]);
	System.out.println("Semester 5 - Subject 3  marks is :" + studentDetails[4][2][2]);
	System.out.println("Semester 5 - Subject  mark is :" + studentDetails[4][5][2]);
	
	/*
	 * Second way to do multi dimentional array with different data types
	 * Object is the parent class of everything. 
	 */			
	Object[][][] studentDetails1 = {
			{
				{"Sem 1","Mathematics I",78},
				{"Sem 1","Physics",85},
				{"Sem 1","Chemistry",91},
				{"Sem 1","Computer Programming",74},
				{"Sem 1","Engineering Drawing",88},
				{"Sem 1","Basic Electrical Eng",79}
			},
			{
				{"Sem 2","Mathematics II",82},
				{"Sem 2","Mechanics",77},
				{"Sem 2","Environmental Sci.",93},
				{"Sem 2","Basic Electronics",69},
				{"Sem 2","Engineering Physics",84},
				{"Sem 2","Engineering Graphics",90}
			},
			{
				{"Sem 3","Data Structures ",88},
				{"Sem 3","Discrete Mathematics",81},
				{"Sem 3","Digital Electronics",76},
				{"Sem 3","Operating Systems",92},
				{"Sem 3","Signals and Systems",85},
				{"Sem 3"," Object-Oriented Prog.",78}
			},
			{
				{"Sem 4","Algorithms",91},
				{"Sem 4","Computer Networks",73},
				{"Sem 4","Database Systems",89},
				{"Sem 4","Microprocessors",80},
				{"Sem 4","Communication Eng.",76},
				{"Sem 4","Software Engineering",87}
			},
			{
				{"Sem 5","Probability & Stats",86},
				{"Sem 5","Machine Learning",88},
				{"Sem 5","Compiler Design",84},
				{"Sem 5","Theory of Computation",95},
				{"Sem 5","Embedded Systems",73},
				{"Sem 5","Computer Graphics",90}
			}		
			
	};
System.out.println("Using Object class reading the multi dimentional array");
System.out.println("Semester 3 - Subject 4 name is :" + studentDetails1[2][3][1]);
System.out.println("Semester 3 - Subject 5 name is :" + studentDetails1[2][4][1]);
System.out.println("Semester 5 - Subject 3  marks is :" + studentDetails1[4][2][2]);
System.out.println("Semester 5 - Subject  mark is :" + studentDetails1[4][5][2]);

	}

}
