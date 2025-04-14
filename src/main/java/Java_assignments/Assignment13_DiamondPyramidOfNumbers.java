package Java_assignments;


/*
 * Print the numbers in diamond-shaped pyramid of numbers.
Pattern should be as below.
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1
 */
public class Assignment13_DiamondPyramidOfNumbers 
{

	public static void main(String[] args) 
	{
		int number =9;
		pyramid(number);
		reversePyramid(number);	
	}
	
	public static void pyramid(int number)
	{
		for( int i=1;i<=number;i++)
		{
			for( int j=number;j>i;j--)
			{
				System.out.print(" ");
			}
			for( int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	public static void reversePyramid(int number)
	{
		for(int k=1;k<number;k++)
		{
			for( int l=1;l<=k;l++)
			{
				System.out.print(" ");
			}
			for( int j=1;j<=number-k;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
	
	

