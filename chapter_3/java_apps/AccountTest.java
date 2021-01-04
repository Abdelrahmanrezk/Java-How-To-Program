
import java.util.Scanner;
public class AccountTest{
	/*
		Account Test that creating and maintain the Account class
	*/
	public static void main(String [] args){

		Account account1 = new Account("Abdelrahman Rezk", 50.00);
		Account account2 = new Account("Abdallah Ezz", -50.00);

		System.out.printf("The Account hodler name is: %s%nAnd his account balance is: %.2f%n", 
			account1.getName(), account1.getBalance());

		System.out.printf("The Account holder name is: %s%nAnd his account balance is: %.2f%n",
			account2.getName(), account2.getBalance());

		// Create scnner object
		Scanner input = new Scanner(System.in);

		// Read from user keyboard
		System.out.print("Enter the account1 deposit: ");
		double depositBalance = input.nextDouble();
		System.out.printf("%nAdding %.2f to account1 balance %n", depositBalance);

		account1.deposit(depositBalance);
		System.out.printf("Dear: %s your balance is: %.2f%n", account1.getName(), account1.getBalance());

		System.out.print("Enter the account2 deposit: ");
		depositBalance = input.nextDouble();
		System.out.printf("%nAdding %.2f to account2 balance \n", depositBalance);
		account2.deposit(depositBalance);
		
		System.out.printf("Dear: %s your balance is: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("Dear: %s your balance is: %.2f%n", account2.getName(), account2.getBalance());

		
	}
}