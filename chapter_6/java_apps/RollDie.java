/*
To check how the SecureRandom generate approximate probability for each number in the range you are given, 
let us check how the frequency for each number in rolling dies for 6,000,000
*/

import java.security.SecureRandom;
public class RollDie{

	public static void main(String[] args){

		// Create secureRanom object
		SecureRandom randomNumbers = new SecureRandom();
		int count1 = 0, count2=0, count3=0, count4=0, count5=0, count6=0;

		for(int roll =1; roll <= 6000000; ++roll){

			// becuase 6 is ranged from 0-5 we add 1 
			//  1 here is called shifted constant value, and it can be an expression
			int face = 1 + randomNumbers.nextInt(6);
			switch(face){

				case 1:
				++count1;
				break;
				case 2:
				++count2;
				break;
				case 3:
				++count3;
				break;
				case 4:
				++count4;
				break;
				case 5:
				++count5;
				break;
				case 6:
				++count6;
				break;
			} // End switch case

		} // End for loop

		System.out.println("Face\tFrequency"); // output headers
	   System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
       	count1, count2, count3, count4, count5, count6);

	} // Enf of Main method

} // End of class RollDie