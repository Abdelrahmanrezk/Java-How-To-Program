
public class Time1{

	private int hours;
	private int minutes;
	private int seconds;

	public void setTime(int hours, int minutes, int seconds){

		if(hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59){

			// Call IllegalArgumentException constructor with an error message
			// Throw error terminate this method to next execution statement
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}

		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	} // End of setTime method

	// convert to String in universal-time format (HH:MM:SS)
	// format is different from printf in that it return a string instead of display it in terminal
	public String toUniversalString(){
		// %02d leading 0 if the number is less than 10
		return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
	} // end of toUniversalString method

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString(){
		return String.format("%2d:%02d:%02d %s",
			// any other % 12 to ensure it in range from 1 to 11
			(this.hours == 12 || this.hours == 0 ? 12 : this.hours % 12),
				minutes, seconds, (hours > 12 ? "PM" : "AM")
			);
	} // end toString method
} // end of Time1 class