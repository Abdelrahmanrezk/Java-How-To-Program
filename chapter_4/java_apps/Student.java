/*
- Created By: Abdelrahman Rezk
<<>> Define constructor in UML
- Define Private status
+ Define public status

Class Student is a class that store instance variables student name and the average of the grades,
provide methods to manipulate these instance variables.

Everything created is defined at the beginning of the function or beside the instance variables.		 	

Student class that contain:
	
	Instance private Variables:
		- name: String
		- Average: double

	Constructors:
		<<Constructor 1>> Student(name: String, average: double)

	public Methods:
		+ setName(name :String)
		+ getName(): String
		+ setAverage(average: double)
		+ getAverage(): double
		+ getBalance(): double
		+ getLetterGrade(): char

	The instance private variable name can be accessed throughout the methods.
	also, we may not use the keyword this and make name = name direct but it's not good practice


*/
public class Student{

	// instance private variables
	private String name; 
	private double average;

	// Student Constructor 1
	public Student(String name, double average){

		this.name = name;

		if(average >= 0.0)
			if(average <= 100.0)
				this.average = average;
	}

	

	// Instance Average manipulated
	public void setName(String name){
	/* setName: Set the account username. */
		this.name = name;
	}

	public String getName(){
	/* getName: Return the account username. */
		return this.name;
	}
	
	// Instance Average manipulated

	public void setAverage(double average){
	/* setName: Set the account username. */
		if(average >= 0.0)
			if(average <= 100.0)
				this.average = average;
	}

	public double getAverage(){
	/* getName: Return the account username. */
		return this.average;
	}
	
	// Get Grade in letter

	public char  getLetterGrade(){
		char gradeLetter = ' ';
		if (this.average >= 90)
		    gradeLetter = 'A';
		else if (this.average >= 80)
		    gradeLetter = 'B';
		else if (this.average >= 70)
		    gradeLetter = 'C';
		else if (this.average >= 60)
		    gradeLetter = 'D';
		else
		    gradeLetter = 'F';
    	
    	return gradeLetter;
	}
}
