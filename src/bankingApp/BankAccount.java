// Banking project : This is BankAccount.java which has arraylist of bank accounts and methods to add and remove accounts,
// to check balance of individual accounts and to display all account details from the bank

package bankingApp;
import java.util.ArrayList;
//import java.util.Arrays;

public class BankAccount {
	
	private ArrayList<Account> accounts;
	
	// Constructor
	
	public BankAccount() {
	
		accounts = new ArrayList<Account>();
	}
	
	// Method to add account
	
	public void addAccount(Account account) {
		
		accounts.add(account);
	}

	// Method to remove account
	
	public void removeAccount(Account account) {
		
		accounts.remove(account);
	}
	
	public void checkBalance(Account account) {
		
		if (accounts.contains(account)) {
			 
			 System.out.println("Account Balance for account number " + account.accountNumber + " is "+ account.accountBalance);
		}
	}
	
	// To display all accounts details from the array list of accounts
	
	public void displayAccounts() {
		
		for (Account account : accounts) {
			
         System.out.println(account);
         
     	}
	}
}
	
	
 

