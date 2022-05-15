// static variable used to maintain a count of the number of 
// Employee objects in memory.

public class Employee2{
	private static int count = 0; // number of Employees object created
	private String firstName;
	private String lastName;

	// initialize Employee, add 1 to static count and 
   	// output String indicating that constructor was called
	public Employee2(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName  = lastName;
		++count; // increment static count of employees
		System.out.printf("Employee constructor: %s %s; count = %d%n",
			firstName, lastName, count);
	} // end of constructor 1

	// get first name
	public String getFirstName(){
		return this.firstName;
	} // end of getFirstName method

	// get last name
	public String getLastName(){
		return this.lastName;
	} // end of last name
	
	public static int getCount(){
		return count; // because it a static so it shared between objects;
	}
} // end of Employee2 class