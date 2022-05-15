
// enum type for the Credit-Inquiry-program options
public enum MenuOption{
	// Declare contents of enum type

	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);

	private final int value; // current menu option

	// constructor
	private MenuOption(int value){
		this.value = value;
	} // end of constructor
} // end of enum MenuOption