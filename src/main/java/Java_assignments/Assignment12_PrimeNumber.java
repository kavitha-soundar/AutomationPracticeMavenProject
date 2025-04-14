package Java_assignments;

/*
 *
Given a number n, determine whether it is a prime number or not. A prime number is a
number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.

Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.

Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered
prime.
 */

public class Assignment12_PrimeNumber {

	public static void main(String[] args) {
		int input1 =7;
		int input2=25;
		int input3 = 1;
		
		System.out.println("Is " + input1 +" prime number " + primeNumber(input1) );
		System.out.println("Is " + input2 +" prime number " + primeNumber(input2) );
		System.out.println("Is " + input3 +" prime number " + primeNumber(input3) );
	}
	public static boolean primeNumber(int inp)
	{		
		if( inp==1)
		{
			return false;
		}
		for( int i=2;i<inp/2;i++)
		{
			if(inp%i ==0)
				return false;
		}
		return true;	
	}
}
