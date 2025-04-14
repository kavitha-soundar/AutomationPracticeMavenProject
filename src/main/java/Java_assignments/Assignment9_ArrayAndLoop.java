package Java_assignments;


/*
 * Assignment (Arrays and Loops)
Given values are 12 ,34,11,36,87,98,93.
Store the values in Array and Print second and third largest number from the above values without
using collections and default sort methods
 * 
 * 
 */
public class Assignment9_ArrayAndLoop {

	public static void main(String[] args) {
	
		int[] values = { 12,34,11,36,87,98,93};
		int temp = 0;
		
		for(int i=0;i< values.length/2;i++)
		{
			for( int j= values.length-1; j>=i;j--)
			{
				if(values[i]<values[j])
				{
					temp=values[i];
					values[i]=values[j];
					values[j]=temp;
				}
		
			}
		}
		
		for(int i=0; i< values.length;i++)
		{
			System.out.println(values[i]);
		}
		
		System.out.println("Second Largest Number is " +values[1]);
		System.out.println("Third Largest Number is " +values[2]);
		}

	}


