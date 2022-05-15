// do...while repetition statement

public class DoWhileTest{
	public static void main(String[] args){

		int counter = 1;
		do{
			// Print any way, then check counter (implment the body 1 or more)
			System.out.printf("%d ", counter);
			counter++; // increment by 1 to avoid infinity loop

		} while(counter <=10); // end do...while
		System.out.println(); 
	} // End of main method
} // End of class