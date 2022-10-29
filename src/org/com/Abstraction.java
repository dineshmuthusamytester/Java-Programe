package org.com;

public abstract  class Abstraction {
	public abstract void CurrentAccount();
	public abstract void SavingsAccount();
	public abstract void LoanAccount();
	
	public void JewellLoan () {
		System.out.println("jewell loan is 15%");
	}

}
//      ABSTRACTION 
 // Hiding the implement part  and functionality is called abstraction . 
// we can't able to create object from the abstract call.
//because this business logic template .
