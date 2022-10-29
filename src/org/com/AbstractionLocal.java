package org.com;

public class AbstractionLocal extends Abstraction {

	@Override
	public void CurrentAccount() {
		System.out.println("current account rate is 20%");
	}

	@Override
	public void SavingsAccount() {
		System.out.println("savings account rate is 25%");
	
		
	}

	@Override
	public void LoanAccount() {
		System.out.println("loan account rate is 30%");
		
	}
	public static void main(String[] args) {
		AbstractionLocal b=new AbstractionLocal();
		b.CurrentAccount();
		b.SavingsAccount();
		b.LoanAccount();
		b.JewellLoan();
	}
	
	
	

}
