public class MemberAccessTest{
	public static void main(String[] args){

		Time1 time = new Time1(); // Default constructor
		time.hours   = 7;  // error: hour has private access in Time1 
		time.minutes = 15; // error: minute has private access in Time1
		time.seconds = 30; // error: second has private access in Time1
	} // end of main method
} // end of MemberAccessTest class