// Addition.java
// Addition program that inputs two numbers and displays their sum.
import java.util.Scanner;

public class Addition
{
    // Main method ebgins execution of the program
    public static void main(String[] args)
    {
        // Create scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        int number1; // first number to add
        int number2; // second number to add
        int sum = 0; // sum of number1 and number2
        
        System.out.print("Enter first integer: "); // Prompt the user
        number1 = input.nextInt(); // read first number
        
        System.out.print("Enter second integer: "); // Prompt the user
        number2 = input.nextInt(); // read second number
        
        sum = number1 + number2; // add numbers, then stor total in sum
        
        System.out.printf("Sum is %d%n", sum);
    } // End of main method
} // End of class Addition