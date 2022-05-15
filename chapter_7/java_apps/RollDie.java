/*
Sometimes, programs use counter variables to summarize data, such as the results of a survey.
We used separate counters in our die rolling program to track the numberof occurrences 
of each side of a six-sided die as the program rolled the die 6,000,000 times.

*/

import java.security.SecureRandom;

public class RollDie{
	public static void main(String [] args){

		SecureRandom randomNumbers = new  SecureRandom();
		int [] frequency = new int[7];
		for(int roll =1; roll <= 6000000; ++roll){
			++frequency[1 + randomNumbers.nextInt(6)];
		} // end of loop
		
		System.out.printf("%s%10s%n", "Face", "Frequency");

		for(int face =1; face < frequency.length; ++face){
			System.out.printf("%4d%10d%n", face, frequency[face]);
		} // end of loop


	} // end of main method
} // end of RollDie class