/*
	SqaureAdditionSubtraction.java
	SqaureAdditionSubtraction Application is to take 2 integers from user then,
	Display the square of each of them,
	Sum these two integers after you get their square then,
	Subtract these two integers after you get their square,
*/

// Import The Scanner class to use it
import java.util.Scanner;
public class SqaureAdditionSubtraction
{
	// Main Method start
	public static void main(String [] args)
	{
		// Create the Scanner Object
		Scanner input = new Scanner(System.in);

		int number1, number2;
		System.out.println("Enter number1 and number2 to get their square, sum and subtrict");
		number1 = input.nextInt();
		number2 = input.nextInt();

		number1 *= number1; // Square of number1
		number2 *= number2; // Sqaure of number2

		System.out.printf("Square of number1 is: %d And Square of number2 is: %d%n", number1, number2	);

		int adition = number1 + number2;
		int subtrict = number1 - number2; // As he mentioned should number1 - number2

		System.out.printf("The sum of %d and %d is = %d%n", number1, number2, adition);

		System.out.printf("The subtrict of %d and %d is = %d%n", number1, number2, subtrict);
	} // End of Main method
} // End of SqaureAdditionSubtraction class