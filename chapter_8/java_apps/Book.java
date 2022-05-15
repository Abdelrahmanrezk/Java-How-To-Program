// Declaring an enum type with a constructor and explicit instance fields 
// and accessors for these fields
public enum Book{

	// declare constants of enum type  
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"), 
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"), 
	CSHARPHTP("Visual C# How to Program", "2014"); 

	private final String title;
	private final String copyrightYear;
	
	// enum constructor without public because it static
	Book(String title, String copyrightYear){
		this.title 		   = title;
		this.copyrightYear = copyrightYear;
	} // end of constructor 1

	// accessor for field title
	public String getTitle(){
		return this.title;
	} // end of getTitle method

	// accessor for field copyrightYear
	public String getCopyrightYear(){
		return this.copyrightYear;
	} // end of getCopyrightYear method

} // end of enum Book