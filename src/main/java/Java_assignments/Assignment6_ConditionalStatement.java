package Java_assignments;

public class Assignment6_ConditionalStatement {
	
	/*Assignment (Conditional Statements)
A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
	o If the credit score is above 750, the loan is automatically approved.
	o If the credit score is between 650 and 750, additional checks are performed.
	o If the credit score is below 650, the loan is denied.

2. Income:
	o For credit scores between 650 and 750, the customer’s income must be at least $50,000
	for the loan to be considered.
3. Employment Status:
	o If the customer’s income is at least 50,000, the system checks whether the customer is
	employed.
	o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
	o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
	o If the DTI ratio is less than 40%, the loan is approved.
	o If the DTI ratio is 40% or greater, the loan is denied.
	
Now based on below details, print whether user is eligible to get the loan or not
	customerName = "John Doe";
	creditScore = 720;
	income = 55000.0;
	isEmployed = true;
	debtToIncomeRatio = 35.0;
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int CreditScore = 660;
		int customerIncome= 50000;
		boolean customerEmployed = true;
		int DebtToIncomeRatio = 30;
		
		
		if(CreditScore>750)
		{
			System.out.println("The loan is approved");
		}
		else if(CreditScore > 650 && CreditScore < 750)
		{
			if(customerIncome >= 50000)
			{
				if(customerEmployed)
				{
					if(DebtToIncomeRatio<40)
					{
						System.out.println("The loan is approved");
					}
					else if(DebtToIncomeRatio >= 40)
					{
						System.out.println("The loan is denied");
					}
				}
			}
		}
		else if(CreditScore <650)
		{
			System.out.println("Loan is denied");
		}

	}

}
