// CommissionEmployee class represents an employee paid a 
// percentage of gross sales.
public class CommissionEmployee{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // gross weekly sales   
	private double commissionRate; // commission percentage

	// five-argument constructor   
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
		double grossSales, double commissionRate){


		// if grossSales is invalid throw exception
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		// if commissionRate is invalid throw exception
		if(commissionRate <= 0 || commissionRate >= 1){
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.firstName            = firstName;
		this.lastName             = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales           = grossSales;
		this.commissionRate       = commissionRate;
	} // end constructor

	public String getFirstName(){
		return this.firstName;
	} // end of getFirstName 

	public String getLastName(){
		return this.lastName;
	} // end of getLastName

	public String getSocialSecurityNumber(){
		return this.socialSecurityNumber;
	} // end of getSocialSecurityNumber

	public void setGrossSales(double grossSales){
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} // end of setGrossSales

	public double getGrossSales(){
		return this.grossSales;
	} // end of getGrossSales

	public void setCommissionRate(double commissionRate){
		if(commissionRate <= 0 || commissionRate >= 1){
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	} // end of setCommissionRate

	public double getCommissionRate(){
		return this.commissionRate;
	} // end of getCommissionRate

	public double earnings(){
		return getCommissionRate() * getGrossSales();
	} // end of earnings

	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
			"commission employee", getFirstName(), getLastName(),  
			"social security number", getSocialSecurityNumber() , 
			"gross sales", getGrossSales(),  
			"commission rate", getCommissionRate());  
	}

} // end of class CommissionEmployee