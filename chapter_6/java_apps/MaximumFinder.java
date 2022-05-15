/*
	Method with multiple paramters

	Methods often require more than one piece of information to perform their tasks. 
	We now consider how to write your own methods with multiple parameters.
*/

import java.util.Scanner;
public class MaximumFinder{
	public static double maximum(double a, double b, double c){
		/*
		The method to get the maximum value from the three paramters
		then consider that a is the max val, then compare for b and c.

		public means that method is avaliable to use in this class or other classes in same package.
		Method parameters:
			a : of type double
			b : same type
			c : same type
		Method Return:
			Then after the process the method return the max value from (a, b, c)
		*/
		double maximum_val = a;
		if(maximum_val < b) maximum_val = b;
		else if(maximum_val < c) maximum_val = c;

		return maximum_val;
	}
	public static void main(String [] args){

		// Get scanner instance object
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three floating-point values separated by spaces: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		/*
		Static method have different ways to call if it used in another class so need to call it as:
		ClassName.MethodName
		if it in same class just we can call it dierctly without meniotned the class name.

		*/

		// maximum_val is method caller or(Boss), while maximum is method worker.
		double maximum_val = maximum(a, b, c);

		// Display the result
		System.out.printf("The Max value is: %.2f%n", maximum_val);

		// Using the Math class provided by JAPI
		// + Concat two strings and implicitly convert the result(after + ) to string
		System.out.println("The Max value is:" + Math.max(a, Math.max(b, c)));
		

	} // End of main method
} // End of class MaximumFinder