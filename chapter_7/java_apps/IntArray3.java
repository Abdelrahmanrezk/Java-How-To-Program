/*
The application in Fig. 7.4 creates a 10-element array and assigns to each element one of 
the even integers from 2 to 20 (2, 4, 6, ..., 20). Then the application displays the array intabular format.
*/
public class IntArray3{
	public static void main(String [] args){

		// initializer list specifies the initial value for each element
		int[] array = new int[10];

		System.out.printf("%s%8s%n", "Index", "Value");

		// array.length is the instance variable associated with the object array

		for(int counter = 0; counter < array.length; ++ counter){
			array[counter] = 2 + 2 * counter;
		} // end for loop
		
		for(int counter = 0; counter < array.length; ++ counter){
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}  // end for loop
		
	} // end main method
} // end IntArray3 class