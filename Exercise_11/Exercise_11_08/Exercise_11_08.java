/*********************************************************************************
* (New Account class) An Account class was specified in Programming              *
* Exercise 9.7. Design a new Account class as follows:                           *
* ■ Add a new data field name of the String type to store the name of the        *
*   customer.                                                                    *
* ■ Add a new constructor that constructs an account with the specified name,    *
*   id, and balance.                                                             *
* ■ Add a new data field named transactions whose type is ArrayList that stores  *
*   the transaction for the accounts. Each transaction is an instance of the     *
*   Transaction class. The Transaction class is defined as shown in Figure 11.6. *
* ■ Modify the withdraw and deposit methods to add a transaction to the          *
*   transactions array list.                                                     *
* ■ All other properties and methods are the same as in Programming Exercise 9.7.*
*                                                                                *
* Write a test program that creates an Account with annual interest rate 1.5%,   *
* balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the       *
* account and withdraw $5, $4, and $2 from the account. Print an account summary *
* that shows account holder name, interest rate, balance, and all transactions.  *
*********************************************************************************/
public class Exercise_11_08 {
	// Main method
	public static void main(String[] args) {
		// Create an Account object
		Account1 account1 = new Account1("George", 1122, 1000);

		// Set annual interest rate to 1.5%
		account1.setAnnualInterestRate(1.5);

		// Deposit $30, $40, and $50 to the account
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);

		// withdraw $5, $4, and $2 from the account
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);

		// Print an account summary
		System.out.println("       Account Summary"); 
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account1.getName());
		System.out.println("Interest rate: " + account1.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account1.getBalance());
		System.out.println("\n     List of transactions");
		System.out.println("------------------------------------");
		for (int i = 0; i < account1.getTransactions().size(); i++) {
			System.out.println("Date: " + 
				(account1.getTransactions()).get(i).getDate());
			System.out.println("Type: " + 
				(account1.getTransactions()).get(i).getType());
			System.out.println("Amount: " + 
				(account1.getTransactions()).get(i).getAmount());
			System.out.println("Balance: " + 
				(account1.getTransactions()).get(i).getBalance());
			System.out.println("Description: " + 
				(account1.getTransactions()).get(i).getDescription());
			System.out.println();
		}
	}
}