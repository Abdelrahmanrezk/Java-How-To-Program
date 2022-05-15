// BasePlusCommissionEmployee class represents an employee who receives
// a base salary in addition to commission.
public class BasePlusCommissionEmployee {

	private final String firstName; 
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // gross weekly sales 
	private double commissionRate; // commission percentage
	private double baseSalary; // base salary per week
	// six-argument constructor 
	public BasePlusCommissionEmployee(String firstName, String lastName, 
		String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){

		// implicit call to Object's default constructor occurs here
		
		// if grossSales is invalid throw exception
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		// if commissionRate is invalid throw exception
		if(commissionRate <= 0 || commissionRate >= 1.0){
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if(baseSalary < 0){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
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

	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0 ){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
	} 

		this.baseSalary = baseSalary;
	} // end of setBaseSalary method

	public double getBaseSalary(){
		return this.baseSalary;
	} // end of getBaseSalary method

	// calculate earnings 
	public double earnings(){
		return baseSalary + (commissionRate * grossSales); // no need for this because no argument with name of instances
	} // end of earnings method

	// return String representation of CommissionEmployee object
	@Override // indicates that this method overrides a superclass method which Object (java.lang)
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
			"commission employee", this.firstName, this.lastName,
			"social security number", this.socialSecurityNumber,
			"gross sales", this.grossSales,
			"commission rate", this.commissionRate,
			"base salary rate", this.baseSalary);
	} // end of toString method


} // end of BasePlusCommissionEmployee class