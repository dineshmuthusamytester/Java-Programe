package org.com;

public class Interface implements InterfaceLocal {

	@Override
	public void currentAccount() {

System.out.println("current account rate is 30%");
		
	}

	@Override
	public void SavingsAccount() {
	System.out.println("Savings account rate is 60%");


		
	}

	@Override
	public void LoanAccount() {
System.out.println("loan account rate is 70%");

		
	}
	public static void main(String[] args) {
		Interface a = new Interface ();
		a.currentAccount();
		a.SavingsAccount();
		a.LoanAccount();
	}
	

}
