package FirstPackage;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		Account vaishnaviAccount = new Account();
		
		try (Scanner va = new Scanner(System.in)) {
			vaishnaviAccount.balanceAmount = 7850.45;
			
			vaishnaviAccount.overdraftAmount = 10000;
			
			System.out.println("Enter the amount to withdraw");
			
			vaishnaviAccount.withdrawAmount = va.nextInt();
		}
		
		vaishnaviAccount.atmWithdrawal();

	}

}
