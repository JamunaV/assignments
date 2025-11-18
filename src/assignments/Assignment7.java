package assignments;

public class Assignment7 {

	public static void main(String[] args) {
	
		/*
		 * Now based on below details,
		 * print whether user is eligible to get the loan or
		 * not customerName = "John Doe"; creditScore = 720; income = 55000.0;
		 * isEmployed = true; debtToIncomeRatio = 35.0;
		 */
		String  customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0f;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0f;
		
		if(creditScore>750) {
			System.out.println("Loan is automatically approved!!!");
		}
		else if((creditScore>650) && (creditScore<750) ) {
				
			if(income==50000) {
				if((isEmployed) && (debtToIncomeRatio < 40) )
					System.out.println("Customer is employed and Loan can be approved");
				else if ((!isEmployed) && (debtToIncomeRatio > 40) )
					System.out.println("Customer is  unemployed and Loan cannot be approved");
				
			}else if(income>50000.00) {
				System.out.println("Loan is considered!!!");
			}
			
		}else if(creditScore < 650) {
			System.out.println("Loan is  denied!!!");
		}
		
		
	}

}
