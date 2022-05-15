/*
Our next example uses arrays to summarize data collected in a survey. Consider the fol-lowing problem statement:
Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in thestudent cafeteria,
with 1 being “awful” and 5 being “excellent.” 
Place the 20 responsesin an integer array and determine the frequency of each rating
*/

public class StudentPoll{
	public static void main(String[] args){
		// student response array (more typically, input at runtime)
		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

		int [] frequency = new int[6];

		for(int counter = 0; counter < responses.length; ++counter){

			try{

				++frequency[responses[counter]];
			} // end of try
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e); // invokes toString method
				System.out.printf("   responses[%d] = %d%n%n", counter, responses[counter]);  
			} // end of catch
		} // end of loop
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");

		// output each array element's value
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d%n", rating, frequency[rating]);

	} // end of main method
} // end of StudentPoll class