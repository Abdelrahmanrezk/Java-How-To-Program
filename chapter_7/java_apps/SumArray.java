/*
sums  the  values  contained  in  a  10-element  integer  arra
*/
public class SumArray{
	public static void main(String [] args){

		// initializer list specifies the initial value for each element
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int sum = 0;


		// array.length is the instance variable associated with the object array

		for(int counter = 0; counter < array.length; ++ counter){
			sum += array[counter];
		} // end for loop
		
		System.out.printf("Total of array elements: %d%n", sum);

	} // end main method
} // end SumArray class