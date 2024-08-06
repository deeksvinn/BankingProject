// Banking project: This is subclass SavingsAccount.java for BankAccount to calculate interest on the account balance

package bankingApp;

public class SavingsAccount {
	
	private double interestRate;
	
	// Constructor

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Method to calculate account balance after adding interest 
	
	public void addInterest(Account account) {
		
		account.accountBalance = account.accountBalance + (account.accountBalance *  (interestRate/100));
		
		System.out.println("\nAccount balance after adding interest to account number " + account.accountNumber + " is " + account.accountBalance);
	}
}	
