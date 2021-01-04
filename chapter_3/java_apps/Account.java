public class Account{
	/*
		- Created By: Abdelrahman Rezk
		- Last Updated: 27/10/2020
		<<>> Define constructor in UML
		- Define Private status
		+ Define public status

		Account class that contain:
			Everything created is defined at the beginning of the function or beside the instance variables.		 	
			
			Instance private Variables:
				- name: String
				- balance: double
			Constructors:
				<<Constructor 1>> Account(name: String)
			public Methods:
				+ setName(name :String)
				+ getName(): String
				+ deposit(depositAccount: double)
				+ drawing(drawAccount: double)
				+ getBalance(): double
			The instance private variable name can be accessed throughout the method.
			also, we may not use the keyword this and make name = name direct but it's not good practice
	*/
	// name: instance private variables
	private String name; 
	private double balance;

	// Account Constructor 1
	public Account(String name, double balance){
	/*
	Constructor 1: That set name to default value that user pass when create an Object from Account Class.
	*/
		this.name 	 = name;
		if(balance > 0)
			this.balance = balance;
	}

		/*
			-------------------------- Start methods that access  private variable name 
		*/
	public void setName(String name){
	/* setName: Set the account username. */
		this.name = name;
	}

	public String getName(){
	/* getName: Return the account username. */
		return name;
	}
		/*
			-------------------------- End methods that access  private variable name -------------------- 
		*/

		/*
			-------------------------- Start methods that access  private variable balance -------------------- 
		*/

	public void deposit(double depositAccount){
	/*
	deposit: Add new ammount of balance to the current ammount of user account.
	*/
		if(depositAccount > 0) // Valid deposit will be add other not because of negative values
			balance += depositAccount;

	}

	public void drawing(double drawAccount){
	/*
	drawing: Decrease the current balance of user money..
	*/
		if(drawAccount <= this.balance) // Valid if user has the amount of money need to draw
			this.balance -= drawAccount;
	}

	public double getBalance(){
	/*
	getBalance: Return the current user balance.
	*/
		return this.balance;
	}
		/*
			-------------------------- End methods that access  private variable balance -------------------- 
		*/
}