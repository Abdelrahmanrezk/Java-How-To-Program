/*
Use keyword new to create an array of 10 int elements,
which are initially zero (the default initial value for int variables). 

outputs the column headings. The first column contains the index (0–9) of each array element, 
and the second column contains the default initial value (0) of each array element.
*/
public class IntArray{
	public static void main(String [] args){

		int [] array = new int[10];

		System.out.printf("%s%8s%n", "Index", "Value");

		// array.length is the instance variable associated with the object array
		for(int counter = 0; counter < array.length; ++ counter){

			System.out.printf("%5d%8d%n", counter, array[counter]);

		} // end for loop
	} // end main method
} // end IntArray class