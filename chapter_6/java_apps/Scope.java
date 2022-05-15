/*

The basic scope rules are as follows:
1.The scope of a parameter declaration is the body of the method in which the dec-laration appears.
2.The scope of a local-variable declaration is from the point at which the declara-tion appears to the end of that block. 
3.The scope of a local-variable declaration that appears in the initialization section,
of a for statement’s header is the body of the for statement and the other expres-sions in the header.
4.A method or field’s scope is the entire body of the class. 
This enables a class’s in-stance methods to use the fields and other methods of the class.

any  block  may  contain  variable  declarations.  If  a  local  variable  or  parameter  in  a method
 has the same name as a field of the class, the field is hidden until the block terminates execution 
 this is called shadowing. To access a shadowed field in a block:
If the field is an instance variable, precede its name with the this keyword and adot (.), as in this.x
If the field is a static class variable, precede its name with the class’s name anda dot (.), as in ClassName.x.

NOTE!!!!!!!!!!!!!!!!!!!!
Declare variables as close to where they’re first used as possible. 
*/

public class Scope{
	// field that is accessible to all methods of this class 
	private static int x = 1;   

	// create and initialize local variable x during each call
	public static void useLocalVariable()   {  
	int x = 25; // initialized each time useLocalVariable is called   
 		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x); 
 		++x; // modifies this method's local variable x 
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);  
	 } // End of useLocalVariable method


	// modify class Scope's field x during each call
	public static void useField()   {     
 		System.out.printf("%nfield x on entering method useField is %d%n", x);   
 		x *= 10; // modifies class Scope's field x
		System.out.printf("field x before exiting method useField is %d%n", x);
	 } // End of useField method


	// method main creates and initializes local variable x 10   
	// and calls methods useLocalVariable and useField
	public static void main(String[] args){
		int x = 5; // method's local variable x shadows field x

		 System.out.printf("local x in main is %d%n", x);

		  useLocalVariable(); // useLocalVariable has local x
		  useField(); // useField uses class Scope's field x
		  useLocalVariable(); // useLocalVariable reinitializes local x
		  useField(); // class Scope's field x retains its value

		  System.out.printf("%nlocal x in main is %d%n", x);


	} // End of main method
} // End of class scope