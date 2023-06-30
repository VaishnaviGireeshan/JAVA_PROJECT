package FirstPackage;

public class Account {

	double balanceAmount;

	int withdrawAmount;
	
	int overdraftAmount;
	
	//If customer has enough balance (balanceAmount >= withdrawAmount)
	//(OR) ||
	//If the customer has enough overDraft (overdraft>=withdrawamount)
	

	void atmWithdrawal() {

		if (balanceAmount >= withdrawAmount||overdraftAmount>=withdrawAmount) {
			System.out.println("Customer can withdraw cash");
		} else {
			System.out.println("Not enough balance");
		}
	}
	}

