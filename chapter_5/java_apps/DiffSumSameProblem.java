// Summing integers with the for statement from 2 to 20 for even numbers

/*
	Using counter +=2 way,

*/
public class DiffSumSameProblem{
	public static void main(String []args){
		int total = 0;
		//  total even integers from 2 through 20

		for(int counter=2; counter <= 20; counter +=2){
			total += counter;
		}

		System.out.printf("Sum is %d%n", total);

		// Solve using mod operator
		total = 0; // Set it again

		for(int counter = 1; counter <= 20; ++counter){

			if(counter % 2 == 0) total +=counter;
		}
		System.out.printf("Sum is %d%n", total);

		// Solve for as while but avoid this
		total = 0; // Set it again

		int counter = 2;
		for(;;){
			
			

			if(counter > 20) {break;}
			else total +=counter;

			counter +=2;
		}
		System.out.printf("Sum is %d%n", total);
		
	} // End of main method
} // End of class
