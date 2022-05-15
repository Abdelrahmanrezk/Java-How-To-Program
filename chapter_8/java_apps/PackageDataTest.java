// Package-access members of a class are accessible by other classes 
// in the same package.
public class PackageDataTest{
	public static void main(String[] args){

		PackageData packageData = new PackageData();

		// output String representation of packageData 
		System.out.printf("After instantiation:%n%s%n", packageData); // it call toString implicity

		// change package access data in packageData object
		packageData.number = 77;
		packageData.string = "Goodbye"; 

		// output String representation of packageData
		System.out.printf("%nAfter changing values:%n%s%n", packageData);

	} // end of main method
} // end of PackageDataTest class


// class with package access instance variable
class PackageData{
	int number;
	String string;
	
	// constructor
	public PackageData(){
		number = 0; // package-access instance variable   
		string = "Hello"; // package-access instance variable
	} // end of constructor 1

	// return PackageData object String representation

	public String toString(){
		return String.format("number: %d; string: %s", number, string);
	} // end of toString method

} // end class PackageData