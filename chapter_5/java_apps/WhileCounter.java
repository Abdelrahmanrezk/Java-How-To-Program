// Counter-controlled repetition with the while repetition statement.

/*
Using these 4 instructure we can create the while loop

- A control variable (for loop counter).
- The initial value of the control variable.
- The increment by which the control variable is modified.
- The loop-continuation condition that determines if looping should continue.

# Some Tips

	- Do not use floating-point to counter control the loop because it's not a precise
	- Keep code simple like instead for example

	instead of ++counter in body, we can use it as counter++ in the while condition direct
*/
public class WhileCounter{
	
	public static void main(String [] args){

		// declare and initialize control variable
		int counter = 1; // Take a place in memory for counter variable and store 1 in this place
		/*
			we can also use the declartion first, then initialize it.
			int counter; // declartion
			counter = 1; // initialize
		*/

		// While counter is still evaluted as true as it <= 10 go to loop, else break loop.
		while(counter <= 10) { // loop-continuation condition

			System.out.printf("%d ", counter);
			++counter; // increment control variable
			/*
				++coutner is looks like:
				counter +=1;
				or counter = counter + 1;
			*/
		}
		// after while the cursor is still on same line of print so instead of that make new line
		System.out.println(); 

	}  // End of main method	

} // End of class 