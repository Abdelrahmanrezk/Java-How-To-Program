public class EmployeeTest{
	public static void main(String [] args){
		Date birth = new Date(1949, 7, 24);
		Date hire = new Date(1988, 3, 12);

		Employee employee = new Employee("Bob", "Blue", birth, hire);

		System.out.println(employee);
	} // end of main method
} // end class EmployeeTest