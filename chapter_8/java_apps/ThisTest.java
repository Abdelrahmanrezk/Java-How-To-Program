public class ThisTest{
	public static void main(String[] args){
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	} // end of main method
} // end of ThisTest class
 
class SimpleTime{
	private int hours;   // 0-23
	private int minutes; // 0-59
	private int seconds; // 0-59

	/*
	if the constructor uses parameter names identical to 
	instance variable names the "this" reference is required to distinguish between the names

	Ignore for now if the user value not in range of hours, minutes or second
	*/
	public SimpleTime(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	} // End of setTime constructor
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString(){
		/* 
		%02d leading 0 if the number is less than 10
	   
	   "this" is not required here to access instance variables,
		because method does not have local variables with same names as instance variables,
		so it will dierctly back to instance who are in the class
      */
		return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
	} // end of toUniversalString method

	// use explicit and implicit "this" to call toUniversalString
	public String buildString(){
		return String.format("%24s: %s%n%24s: %s", 
			"this.toUniversalString()", this.toUniversalString(), // explicit  this
			"toUniversalString()", toUniversalString()); // implicit this
	} // end of buildString method
} // end of SimpleTime class