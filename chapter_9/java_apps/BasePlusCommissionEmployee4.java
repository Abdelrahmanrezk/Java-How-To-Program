// BasePlusCommissionEmployee class inherits from CommissionEmployee 
// and accesses the superclass’s private data via inherited 
// public methods.
public class BasePlusCommissionEmployee4 extends CommissionEmployee{

	private double baseSalary;

	// six-argument constructor
	public BasePlusCommissionEmployee4(String firstName, String lastName, 
		String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		
		// explicit call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		// if baseSalary is invalid throw exception
		if(baseSalary < 0){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	} // end of constructor 1

	// set base salary
	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0){
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	} // end of setBaseSalary method

	// get base salary
	public double getBaseSalary(){
		return this.baseSalary;
	} // end of getBaseSalary method

	// calculate earnings
	@Override
	public double earnings(){
		// not allowed: commissionRate and grossSales because private in superclas
		return getBaseSalary() + super.earnings();
	} //  end of earnings method
	// return String representation of BasePlusCommissionEmployee
	@Override 
	public String toString(){
		// not allowed: attempts to access private superclass members  
		return String.format("%s %s%n%s: %.2f", "base-salaried",
			super.toString(), "base salary", getBaseSalary());
	} // end of toString method
} // end of BasePlusCommissionEmployee2 class