/*
 LetterGrades class uses the switch statement to count letter grades.
calculates the class average of a set of numeric grades entered by the user,
 anduses a switch statement to determine whether each grade is the equivalent of an A, B, C,D or F 
 and to increment the appropriate grade counter.

 The end-of-file indicator is a system-dependent keystroke combination
  which the user enters to indicate that there’s no more data to input.
*/
import java.util.Scanner;

public class LetterGrades {
	public static void main(String[] args){

		int total = 0, gradeCounter=0;
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n   %s%n   %s%n",
			"Enter the integer grades in the range 0-100.", 
			"Type the end-of-file indicator to terminate input:", 
			"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
			"On Windows type <Ctrl> z then press Enter");
		/*
			loop until user enters the end-of-file indicator
			hasNext is boolean function that return true while there are incoming data otherwhise
			returns false once the user types the end-of-file indicator.
		*/
		while(input.hasNext()){

			int grade = input.nextInt(); // read grade
			total += grade; // add grade to total
			++gradeCounter; // increment number of grades
			/*
				grade / 10 ensure that int by int is int so decimal values will truncated, 
				and because all values we require from 0 to 100 then it will be 0-10 as max value:
				100 / 10 is 10.
			*/
			switch(grade / 10){
				case 10:
				case 9:
				++aCount;
				break;
				case 8:
				++bCount;
				break;
				case 7:
				++cCount;
				break;
				case 6:
				++dCount;
				break;
				default:
				++fCount;
				// We do not need break here because it will escape anyway to next statement after switch
			} // End switch case

		} // End while loop

		// display grade report
		 System.out.printf("%nGrade Report:%n");
		 // if user entered at least one grade, because if gradeCounter is 0 it will cause division by 0 error
		 if (gradeCounter != 0)  {
	 		// calculate average of all grades entered
	       double average = (double) total / gradeCounter;  
	       // output summary of results
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			// .2f is to decimal point
			System.out.printf("Class average is %.2f%n", average);

			 System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
			 "Number of students who received each grade:", 
			 "A: ", aCount,  
			  // display number of A grades
			  "B: ", bCount,   // display number of B grades
			  "C: ", cCount,   // display number of C grades 
			  "D: ", dCount,   // display number of D grades
			  "F: ", fCount); // display number of F grades   
		} // end if 
				else // no grades were entered, so output appropriate message      
		 			System.out.println("No grades were entered");
	} // End main function
} // End class LetterGrades