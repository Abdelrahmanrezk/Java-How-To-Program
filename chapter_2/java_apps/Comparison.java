// Comparison.java 
// Compare integers using if statement, and relational operators 
// and equality operator
import java.util.Scanner;

public class Comparison
{
	// Main Method
	public static void main(String [] args)
	{
		// Create the Scanner object
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;

		System.out.print("Enter First integer: ");
		number1 = input.nextInt();

		System.out.print("Enter Second integer: ");
		number2 = input.nextInt();

		if(number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);

		if(number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);

		if(number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);

		if(number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);

		if(number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if(number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
	} // End of Main method
} // End of Comparison Class