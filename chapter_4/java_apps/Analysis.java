
// Analysis of examination results using nested control statements.

import java.util.Scanner; // class uses class Scanner

public class Analysis{


	public static void main(String [] args){

		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		// initializing variables in declarations
		int passes = 0, failures = 0, counter = 0;

		// process 10 students using counter-controlled loop
		while(counter < 10){

			// prompt user for input and obtain value from use
			System.out.printf("Please Enter resul (1 = pass, 2 = fail) :");
			int result = input.nextInt();

			// if...else is nested in the while statement
			if(result == 1) passes +=1;
			else failures +=1;

			// increment student Counter so loop eventually terminates
			counter +=1;
		}
		// termination phase; prepare and display results
		System.out.printf("Passed: %d%n", passes);
		System.out.printf("Failed: %d%n", failures);

		// determine whether more than 8 students passed
		if(passes > 8) System.out.println("Bonus to instructor! ");

	} // End of main method
} // End of Class