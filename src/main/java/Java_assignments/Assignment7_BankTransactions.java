package Java_assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7_BankTransactions {
	
	/*Bank Transactions
Positive value refers Credit and Negative refers Debit Transaction
Transactions Amount
1 50000
2 -2000
3 3000
4 -15000
5 -200
6 -300
7 4000
8 -3000
First Store all the transactions in any data structure of Your Choice from collections, and by using
Loops and conditional statements
1. Print total number of credit and debit transactions completed
2. Print the total amount credited and debited in account
3. Print total amount remaining at the end in Bank Account
4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
Transaction with Amount” and also print total number of suspicious transactions
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> transactions= new ArrayList<Integer>();
		
		
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		int debitAmount =0;
		int CreditAmount =0;
		int totalAmountRemaining= 0;
		int suspTransaction= 0;
		
		
		System.out.println("Total number of credited and debited transactions are :" + transactions.size());
		
		for(int amnt : transactions)
		{
			if(amnt < 0)
			{
				debitAmount= debitAmount+amnt;
			}
			else if(amnt >0)
			{
				CreditAmount+=amnt;			
			}
			if(amnt >=10000 || amnt<= -10000)
			{
				System.out.println("Suspicious credit/debit Transaction with Amount is "+ amnt);
				suspTransaction++;
				
			}
		}
		
		System.out.println("Total Debited amount from the account : "+ debitAmount);
		System.out.println("Total Credited Amount to the account : "+ CreditAmount);
		
		totalAmountRemaining = CreditAmount+debitAmount;
		
		System.out.println("Total amount remaining in the account now : "+ totalAmountRemaining);
		
		System.out.println("Total suspicious credit or debit transaction is :" + suspTransaction);

	}

}
