package Java_assignments;

/*
 * Assignment: Write a program to print * in triangle pattern
1. If I will pass int rows = 5 then it should print triangle with 5 Rows
 		*
 	   **
 	  ***
 	 ****
 	*****
 */

public class Assignment17_Triangle {

	public static void main(String[] args) 
	{
		int num = 5;
		for(int k=1;k<=num;k++)
		{
		for(int i=k;i<num;i++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=k;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
