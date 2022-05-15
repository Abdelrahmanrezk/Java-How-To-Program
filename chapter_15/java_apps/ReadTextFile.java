// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile{

	private static Scanner input;
	
	public static void main(String[] args){

		readFile();
		readRecord();
		closeFile();
	}

	public static void readFile(){

		try{

			input = new Scanner(Paths.get("client.txt"));

		}
		catch(IOException iOException){ 
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	} // end of readFile method

	public static void readRecord(){
		try{
			System.out.printf("%-10s%-12s%-12s%10s%n", "Account","First Name", "Last Name", "Balance");
			while(input.hasNext()){
				System.out.printf("%-10d%-12s%-12s%10.2f%n",
					input.nextInt(), input.next(), input.next(), input.nextDouble());
			} // end of while
		}
		catch(IllegalStateException illegalStateException) // input have closed when there are still data
		{
			System.err.println("Error reading from file. Terminating.");
		}
		catch(NoSuchElementException noSuchElementException) // when there is miss in data types
		{
			System.err.println("File improperly formed. Terminating.");
		}
	} // end method readRecords

	public static void closeFile(){
		if(input != null){
			input.close();
		}
	} // end of closeFile method
} // end of ReadTextFile class