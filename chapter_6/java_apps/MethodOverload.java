/*
Methods of the same name can be declared in the same class, as long as they have different sets of 
parameters(determined by the number, types and order of the parameters)—thisis called method overloading.

*/

// Fig. 6.10: MethodOverload.java
// Overloaded method declarations.
/*
NOTE !!!!

The compiler distinguishes overloaded methods by their signatures a combination of
 the method’s name and the number, types and order of its parameters, but not its return type	
*/
public class MethodOverload{
	// test overloaded square methods

	public static int square(int intValue){
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		return intValue * intValue;
	} // end of int square method

	public static double square(double doubleValue){
		System.out.printf("%nCalled square with int argument: %.2f%n", doubleValue);
		return doubleValue * doubleValue;
	} // end of double square method

	public static void main(String[] args)  {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		 System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	} // End of main method
} // End of class MethodOverload