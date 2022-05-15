// Shifted and scaled random integers for dice

// 	Generate SecureRandom that have equal probability for all numbers to be predicted in specific range

import java.security.SecureRandom;
public class RandomIntegers{
public static void main(String[] args){

	SecureRandom randomNumbers = new SecureRandom();

	for(int counter = 1; counter <= 20; ++counter){
		/*
		because range 6 genrate secure numbers from 0-5 we add 1 to make it 1-6 for rolling dice game
		*/
		int face = 1 + randomNumbers.nextInt(6);
		System.out.printf("%d ", face);

		if(counter % 5 == 0) System.out.println();

		} // End of loop

	}  // End of main method
 
} // End of RandomIntegers class