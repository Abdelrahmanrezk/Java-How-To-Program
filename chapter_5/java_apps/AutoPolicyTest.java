public class AutoPolicyTest{

	public static void policyInNoFaultState(AutoPolicy policy){
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
			policy.getAccountNumber(), policy.getMakeAndModel(), 
			policy.getState(), 
			(policy.isNoFaultState() ? "is": "is not"));

	} // End policyInNoFaultState method
	public static void main(String[] args){

		// create two AutoPolicy objects
		AutoPolicy auto1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy auto2 = new AutoPolicy(22222222, "Ford Fusion",  "ME");
		policyInNoFaultState(auto1);
		policyInNoFaultState(auto2);
		// display whether each policy is in a no-fault state

	} // End main method
} // end class AutoPolicyTest