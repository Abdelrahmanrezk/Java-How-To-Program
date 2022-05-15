public class ContinueTest{

	public static void main(String[] args){
		for(int counter=1; counter<10; ++counter){

			if(counter == 5){continue;}
			System.out.printf("Counter now is: %d%n", counter);
		} // end of loop
	} // end of main method
} // end of class