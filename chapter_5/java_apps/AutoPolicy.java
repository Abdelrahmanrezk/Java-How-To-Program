public class AutoPolicy{

	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy(int accountNumber, String makeAndModel, String state){
		this.accountNumber = accountNumber;
		this.makeAndModel  = makeAndModel;
		this.state         = state;
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}

	public void setMakeAndModel(String makeAndModel){
		this.makeAndModel = makeAndModel;
	}
	public String getMakeAndModel(){
		return this.makeAndModel;
	}

	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return this.state;
	}

	public boolean isNoFaultState(){
		boolean noFaultState = false; 
		switch(this.getState()){
			// For any of these cases return true
			case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true; 
			break;
			default:
			noFaultState = false;

		} // End switch case
		return noFaultState;
	} // End method isNoFaultState
} // End class AutoPolicy