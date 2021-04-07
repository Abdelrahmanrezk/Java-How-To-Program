
//  Prefix increment and postfix increment operators


public class Increment{


	public static void main(String [] args){

		int c;
		// demonstrate prefix increment operator
		
		c = 5; // assign 5 to c
		System.out.println( c );// prints 5
		System.out.println( ++c );// preincrements then prints 6
		System.out.println( c );// prints 6


		System.out.println();// skip a line
		c=5;// assign 5 to c again
		// demonstrate postfix increment operator
		System.out.println( c );// prints 5
		System.out.println( c++ );// postincrements then prints 6
		System.out.println( c );// prints 6


	} // End of main method
} // End of Class