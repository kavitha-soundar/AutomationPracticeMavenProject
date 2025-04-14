package Java_assignments;
/*
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2

-2 = 1/22 = 1/4 = 0.25
 */

public class Assignment11_PowerofX {

	public static void main(String[] args) {
		double x1= 2.00000, x2=2.10000, x3=2.00000;
		int n1 = 10,n2=3,n3=-2,n4=0;
		powerOfXCalculation(x1, n1);
		powerOfXCalculation(x2, n2);
		powerOfXCalculation(x3, n3);
		powerOfXCalculation(x3, n4);
		
		// Another way of getting power using Math class
		System.out.format("%.5f power of %d is  %.5f\n",x1,n1,Math.pow(x1, n1));
		System.out.format("%.5f power of %d is  %.5f\n",x2,n2,Math.pow(x2, n2));
		System.out.format("%.5f power of %d is  %.5f\n",x3,n3,Math.pow(x3, n3));
		System.out.format("%.5f power of %d is  %.5f\n",x3,n4,Math.pow(x3, n4));
		
		
		
	}
	public static void powerOfXCalculation(double x, int n)
	{
		double result =1;
		
		if(n>0)
		{
			for( int i=1; i<=n;i++)
			{
				result= result*x;
			}
		}
		else if(n<0) 
		{
			for( int i=n; i<0;i++)
			{
				result= result*x;
			}
			result = 1/result;
		}
		System.out.format("%.5f power of %d is  %.5f\n",x,n,result);
	}
}
