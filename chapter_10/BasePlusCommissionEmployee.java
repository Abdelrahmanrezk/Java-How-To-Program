// BasePlusCommissionEmployee class inherits from CommissionEmployee 
// and accesses the superclass’s private data via inherited 
// public methods.

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary; // base salary per week

	// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
		double grossSales, double commissionRate, double baseSalary){

		// call five-argument constructor of super class
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		// if baseSalary is invalid throw exception
		if(baseSalary < 0){
			throw new IllegalArgumentException( "Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	} // end constructor

	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0){
			throw new IllegalArgumentException( "Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	} // end of setBaseSalary

	public double getBaseSalary(){
		return this.baseSalary;
	} // end of getBaseSalary

	@Override
	public double earnings(){
		return super.earnings() + getBaseSalary();
	} // end of earnings

	@Override
	public String toString(){
		return String.format("%s %s%n%s: %.2f", "base-salaried",
			super.toString(),
			"base salary", getBaseSalary());
	} // end of toString
} // end of BasePlusCommissionEmployee class