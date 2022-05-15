/*
You can create an array and initialize its elements with an array 
initializer a comma-sep-arated list of expressions (called an initializer list) enclosed in braces.
In this case, the array length is determined by the number of elements in the initializer list. 
*/
public class IntArray2{
	public static void main(String [] args){

		// initializer list specifies the initial value for each element
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };  

		System.out.printf("%s%8s%n", "Index", "Value");

		// array.length is the instance variable associated with the object array

		for(int counter = 0; counter < array.length; ++ counter){

			System.out.printf("%5d%8d%n", counter, array[counter]);

		} // end for loop
	} // end main method
} // end IntArray2 class