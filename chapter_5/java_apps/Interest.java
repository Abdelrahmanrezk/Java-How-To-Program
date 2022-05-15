
// Compound-interest calculations with for
// Read the problem statement from the book in page 202
public class Interest{
	public static void main(String [] args){

		// amount on deposit at end of each year
		// initial amount before interest
		// interest rate

		double amount, principal = 1000.0, rate = .5;

		// display headers
		 System.out.printf("%s%20s%n", "Year", "Amount on deposit");

		 // calculate amount on deposit for each of ten years
		 for (int year = 1; year <= 10; ++year)  
		 {
		 	//calculate new amount for specified year  
		 	/*
				Math.pow is a static method and static methods are visible to any one to use as the main method
				We can make rate = 1.5 because it sum 1 to it and it been constant, so instead of an operation,
				set rate to 1.5 and use the rate directly.

				To call method
				ClassName.methodName(arguments of the method), in pow, it take 2 argument
		 	*/         
		 	amount = principal * Math.pow(1.0 + rate, year);

		 	// display the year and the amount 
		 	/*
			- %4d
				Print in 4 places, so if this integer number is just one digit,
				then it will leave first 3 place from left then print it in the four place on right.
			 - %20.2f
				Also print this num in 20 place so check for the digits in this number,
			  	then print it but leave space of (20 - length(digits in this number)).
		  	- .2
		  		round to 2 decimal places after decimal point.
	  		- ,
		  		Is formating floating point numbers:
		  		The com-ma  (,)  formatting  flag  indicates  that  the  floating-point  value  should  be  output, 
		  		with  agrouping separator. The actual separator used is specific to the user’s locale (i.e., country).
		  		For example, in the United States, the number will be output using commas to separateevery three digits 
		  		and a decimal point to separate the fractional part of the number, as in1,234.45.

		 	*/    
 	     	System.out.printf("%4d%,20.2f%n", year, amount);
		 }
	} // End of main method
} // End of class