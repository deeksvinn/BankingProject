// 20. Banking Project:  Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. 
// Include methods for depositing and withdrawing money, as well as checking the balance.Create a subclass called "SavingsAccount" that 
// adds an interest rate attribute and a method to apply interest.

// This is Main class of the Banking project

package bankingApp;

public class Main {

	public static void main(String[] args) {
			
		// Creating objects for bank,accounts and savings account
		
		BankAccount bank = new BankAccount();
		
		Account account1 = new Account(576536,"Hulk", 50000.00);
		Account account2 = new Account(453673,"Iron Man", 60000.00);
		Account account3 = new Account(768648,"Flash", 80000.00);
		Account account4 = new Account(125649,"Spider Man", 100000);
		
		SavingsAccount interest = new SavingsAccount(5.0);

		
		// Adding accounts to the bank 
		
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		bank.addAccount(account4);
		
		// To display added accounts to the bank
		System.out.println("------Accounts in the bank------");
		bank.displayAccounts();

		// To deposit into account1 and display account details after updating account balance
		
		System.out.println("\nDisplaying account1 details after deposit into account:");
		account1.deposit(account1,5575);
		account1.displayAccountDetails();
		
		// To withdraw from account2 and display account details after updating account balance
		
		System.out.println("\nDisplaying account2 details after withdrawl from the account:");
		account2.withdraw(account2,700);
		account2.displayAccountDetails();

		// To remove account3 and display accounts in the bank
		
		bank.removeAccount(account4);
		System.out.println("\nDisplaying accounts details after removal of account4:");
		bank.displayAccounts();
		
		// To check balance in account1
		
		System.out.println("\nDisplaying account1 details to check balance:");
		bank.checkBalance(account1);
		
		// To add interest rate to the account3 and displaying account3 details")
		
		interest.addInterest(account3);
		
		// Displaying all account details at th end of the day
		
		System.out.println("\nDisplaying accounts details after all updations:");
		bank.displayAccounts();
	}
}


