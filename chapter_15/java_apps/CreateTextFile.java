// Writing data to a sequential text file with class Formatter.
import java.io.FileNotFoundException; // when it can not read or create the file
import java.lang.SecurityException; // for file premition
import java.util.Formatter;   // like printf format
import java.util.FormatterClosedException;  // if you close the file you read from
import java.util.NoSuchElementException; // when some data types like int entered as string
import java.util.Scanner;  // read data


public class CreateTextFile{
	
	private static Formatter output;
	public static void main(String[] args){
		openFile();
		addRecord();
		closeFile();
	} // end main method

	 // open file clients.txt
	public static void openFile(){

		try{

			output =  new Formatter("client.txt"); // open the file and create it if not exist
		
		}
		catch(SecurityException securityException){
			System.err.println("Write permission denied. Terminating.");
			System.exit(1); // terminate the program
		}
		catch(FileNotFoundException fileNotFoundException){
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // terminate the program
		}

	} // end of openFile method

	public static void addRecord(){
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", 
			"Enter account number, first name, last name and balance.",
			"Enter end-of-file indicator to end input.");

		while(input.hasNext()){ // loop until end-of-file indicator

			try{

				//output new record to file; assumes valid input
				output.format("%d %s %s %.2f%n", 
					input.nextInt(), input.next(), input.next(), input.nextDouble());
			}
			catch(FormatterClosedException formatterClosedException){
				System.err.println("Error writing to file. Terminating.");
				break;
			}
			catch(NoSuchElementException noSuchElementException){
				System.err.println("Invalid input. Please try again.");
				input.nextLine(); // discard this line of input and try again
			}

			System.out.print("? "); // indicate new record will be enter
		} // end of while loop
	} // end of addRecord method

	public static void closeFile(){
		if(output != null){
			output.close();
		}
	}

} // end of CreateTextFile class