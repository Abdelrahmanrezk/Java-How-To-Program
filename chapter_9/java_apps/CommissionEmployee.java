// CommissionEmployee class represents an employee paid a 
// percentage of gross sales.

public class CommissionEmployee extends Object{

	private final String firstName; 
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // gross weekly sales 
	private double commissionRate; // commission percentage

	// five-argument constructor 
	public CommissionEmployee(String firstName, String lastName, 
		String socialSecurityNumber, double grossSales, double commissionRate){

		// implicit call to Object's default constructor occurs here
		
		// if grossSales is invalid throw exception
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		// if commissionRate is invalid throw exception
		if(commissionRate <= 0 || commissionRate >= 1.0){
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} // end constructor 1

	public String getFirstName(){
		return this.firstName;
	} // end of getFirstName method

	public String getLastName(){
		return this.lastName;
	} // end of getLastName

	public String getSocialSecurityNumber(){
		return this.socialSecurityNumber;
	} // end of getSocialSecurityNumber method

	public void setGrossSales(double grossSales){
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} // end of setGrossSales method

	public double getGrossSales(){
		return this.grossSales;
	} // end of getGrossSales method

	public void setCommissionRate(double commissionRate){
		if(commissionRate <= 0 || commissionRate >= 1){
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}

		this.commissionRate = commissionRate;
	} // end of setCommissionRate method

	public double getCommissionRate(){
		return this.commissionRate;
	} // end of getCommissionRate method

	// calculate earnings 
	public double earnings(){
		return getCommissionRate() * getGrossSales(); // no need for this because no argument with name of instances
	} // end of earnings method

	// return String representation of CommissionEmployee object
	@Override // indicates that this method overrides a superclass method which Object (java.lang)
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
			"commission employee", getFirstName(), getLastName(),
			"social security number", getSocialSecurityNumber() ,
			"gross sales", getGrossSales(),
			"commission rate", getCommissionRate());
	} // end of toString method


} // end of CommissionEmployee class