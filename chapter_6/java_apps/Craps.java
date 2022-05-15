/*
A popular game of chance is a dice game known as craps, 
which is played in casinos andback alleys throughout the world. The rules of the game are straightforward:

You roll two dice. Each die has six faces, which contain one, two, three, four, five and six spots, respectively.
After the dice have come to rest, the sum of the spots on the two upward faces is calculated.
If the sum is 7 or 11 on the first throw, you win. If the sum is 2, 3 or 12 on the first throw (called “craps”), you lose
 (i.e., the “house” wins). If the sum is 4, 5, 6, 8, 9 or 10 on the first throw,
that sum becomes your “point.” To win,you  must  continue  rolling  the  dice  until  you  “make  your  point” 
(i.e.,  roll  that  samepoint value). You lose by rolling a 7 before making your point. 
*/

import java.security.SecureRandom; 
public class Craps{
	private static final SecureRandom randomNumbers = new SecureRandom();
	// enum type with constants that represent the game status
	/*
	enum Type Status
	Variables of type Status can be assigned only the three constants declared in the enum 
	or a compilation error will occur. As with classes,braces delimit an enum declaration’s body.
	Inside the braces is a comma-separated list ofenumconstants,  each  representing  a  unique  value.
	*/
	private enum Status { CONTINUE, WON, LOST };   


	public static int rollDice(){

		int dice1 = 1 + randomNumbers.nextInt(6);
		int dice2 = 1 + randomNumbers.nextInt(6);

		int sum = dice1 + dice2;
		System.out.printf("The sum of %d and %d is = %d%n", dice1, dice2, sum);
		return sum;
	} // End of method rollDice

	public static void main(String [] args){

		
		
		int sumOfDice = rollDice();
		int myPoints = 0;
		Status gameStatus;
		switch(sumOfDice){
			case 7: case 11:
			gameStatus = Status.WON;
			break;
			case 2: case 3: case 12:
			gameStatus = Status.LOST;
			break;
			default:
			myPoints = sumOfDice;
			System.out.printf("Point is %d%n", myPoints);
			gameStatus = Status.CONTINUE;
		}

		while(gameStatus == Status.CONTINUE){

			sumOfDice = rollDice();
			if(sumOfDice == myPoints) gameStatus = Status.WON;
			else if(sumOfDice == 7) gameStatus = Status.LOST;
		} // End of while loop

		if(gameStatus == Status.WON) System.out.println("Player wins");
		else System.out.println("Player loses");

	}	// End of main method
} // End of class Craps

