// Banking project : This is subclass Account.java for BankAccount.java to hold the detail of account holders 
// and to deposit,withdraw and display account details

package bankingApp;

public class Account {
	
	String accountName;
	int accountNumber;
	double accountBalance;
	
	// Constructor
	
	public Account(int accountNumber,String accountName, double accountBalance) {
	
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	// Get and Set methods for account name,Account number,sort code and account balance


	public int getAccountNumber() {
		
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		
		return accountName;
	}

	public void setAccountName(String accountName) {
		
		this.accountName = accountName;
	}
	
	public double getAccountBalance() {
		
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		
		this.accountBalance = accountBalance;
	}
	
	// Method to deposit amount into an account
	
	public void deposit(Account account,double depositAmount) {
		
		account.accountBalance = account.accountBalance + depositAmount;
	}
	
	// Method to withdraw amount from an account
	
	public void withdraw(Account account,double withdrawAmount) {
		
		account.accountBalance = account.accountBalance - withdrawAmount;
	}
	
	// Method to display individual account details 
	
	public void displayAccountDetails() {
		
	System.out.println("Account name:" + accountName + "\tAccount number:" + accountNumber  + "\tAccount Balance:"+ accountBalance);
	}
	
	// Override method to display all bank account details for displayAccounts() method in BankAccount.java
	
	@Override
	
	public String toString() {
		
     return ("\nAccount name: " + accountName + " \nAccount Number: " + accountNumber + "\nAccount Balance:"+ accountBalance);
  	}
}

