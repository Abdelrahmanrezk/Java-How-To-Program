
public class Time2{

	// ##################### Instance Variables #############################
	private int hours;
	private int minutes;
	private int seconds;
	/*

	// ##################### Constructors #############################
	As you know, you can declare your own constructor to specify how objects of a class shouldbe initialized.
	Next, we demonstrate a class with several overloaded constructors that 
	enable objects of that class to be initialized in different ways. 
	To overload constructors, sim-ply provide multiple constructor declarations with different signatures.
	*/
	// Time2 no-argument constructor:
    // initializes each instance variable to zero 
	public Time2(){
		 // invoke constructor with three arguments
		this(0, 0, 0); 
	} // end of constructor 1

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2(int hours){
		 // invoke constructor with three arguments
		this(hours, 0, 0);
	} // end of constructor 2

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2(int hours, int minutes){
		 // invoke constructor with three arguments
		this(hours, minutes, 0);
	} // end of constructor 3

	// Time2 constructor: hour, minute and second supplied 
	public Time2(int hours, int minutes, int seconds){
		if(hours < 0 || hours > 23){
			throw new IllegalArgumentException("Hours must be in range 0-23 !!");
		}

		if(minutes < 0 || minutes > 59){
			throw new IllegalArgumentException("Minutes must be in range 0-59 !!");
		}

		if(seconds < 0 || seconds > 59){
			throw new IllegalArgumentException("Seconds must be in range 0-59 !!");
		}

		// In case you have not our of range argument then initialize the constructor with argument values
		/*
		This distinguished the reference object instance variables from those of local variables as argument, 
		who are with the same name of the instance private variables.
		*/
		this.hours   = hours;
		this.minutes = minutes;
		this.seconds = seconds; 
	} // end of constructor 4

	// Receive an object of Time 2 class
	// Time2 constructor: another Time2 object supplied  
	public Time2(Time2 time){
	 // invoke constructor with three arguments
		this(time.getHours(), time.getMinutes(), time.getSeconds()); 
	} // end of constructor 5


	// ##################### Methods #############################
	public void setTime(int hours, int minutes, int seconds){
		if(hours < 0 || hours > 23){
			throw new IllegalArgumentException("Hours must be in range 0-23 !!");
		}

		if(minutes < 0 || minutes > 59){
			throw new IllegalArgumentException("Minutes must be in range 0-59 !!");
		}

		if(seconds < 0 || seconds > 59){
			throw new IllegalArgumentException("Seconds must be in range 0-59 !!");
		}

		
		this.hours   = hours;
		this.minutes = minutes;
		this.seconds = seconds; 

	} // end of setTime method

	public void setHours(int hours){
		if(hours < 0 || hours > 23){
			throw new IllegalArgumentException("Hours must be in range 0-23");
		}
		// In case no IllegalArgumentException hours
		this.hours = hours;
	} // end of setHours method

	public void setMinutes(int minutes){
		if(minutes < 0 || minutes > 59){
			throw new IllegalArgumentException("Minutes must be in range 0-59");
		}
		this.minutes = minutes;
	} // end of setMinutes method

	public void setSeconds(int seconds){
		if(seconds < 0 || seconds > 59){
			throw new IllegalArgumentException("Seconds must be in range 0-59");
		}
	} // end of setSeconds method

	public int getHours(){
		return this.hours;
	} // end of getHours method

	public int getMinutes(){
		return this.minutes;
	} // end of getMintues method

	public int getSeconds(){
		return this.seconds;
	} // end of getSeconds method

	// convert to String in universal-time format (HH:MM:SS)
	// format is different from printf in that it return a string instead of display it in terminal
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds());
	} // end of toUniversalString method

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString(){
		return String.format("%d:%02d:%02d %s%n",
			(getHours() == 0 || getHours() == 12 ? 12 : getHours() % 12),
			getMinutes(), getSeconds(), (getHours() > 12 ? "PM" : "AM"));
	} // end of toString method
} // end of Time2 class
