package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {
		int creditTransactions = 0,debitTransactions = 0;
		int creditTransactionsAmount=0;
		int debitTransactionsAmount=0;
		int suspiciousTransactionCount=0;
		List<Integer> Amount=new ArrayList<Integer>();
		Amount.add(50000);
		Amount.add(-2000);
		Amount.add(3000);
		Amount.add(-15000);
		Amount.add(-200);
		Amount.add(-300);
		Amount.add(4000);
		Amount.add(-3000);
		
			for(Integer i:Amount) {
				if(i>0) {
					creditTransactions++;
					creditTransactionsAmount=creditTransactionsAmount+i;
				}else
					debitTransactions++;
					debitTransactionsAmount=debitTransactionsAmount+i;
				
					if((i > 10000) || (i < -10000)) {
						System.out.println("“Suspicious credit debit Transaction with Amount " + i);
						suspiciousTransactionCount++;
					}			
				
			}
			System.out.println("Number of suspicious transactions : "+suspiciousTransactionCount);
		
		System.out.println("NUmber of credit transactions : "+creditTransactions);
		System.out.println("NUmber of debit transactions : "+debitTransactions);
		System.out.println("Total amount credited : "+creditTransactionsAmount);
		System.out.println("Total amount debited : "+debitTransactionsAmount);
		System.out.println("Total amount remaining at the end in Bank Account "+(creditTransactionsAmount -debitTransactionsAmount));
		
		
	}

}
