package org.com;

public class Constructors  extends  DineshDetails{
	
	public  Constructors () {
		this (8526);
		
	System.out.println("Default constructors");
		
	}
	
	public  Constructors (int id) {
		
this ("Dinesh muthusamy");

System.out.println("emplyoee id is :"+id);
		
	}
	
	
	public  Constructors (String id) {
		super();
		System.out.println(" String emplyoee id is :"+id);
		
	}
	
	
	
		

	
public static void main(String[] args) {
	 Constructors k = new Constructors();
	 Constructors k1 = new Constructors(123456);
	
}
}
