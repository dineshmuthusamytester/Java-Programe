package org.com;

public class polyMorphisam {

	// methode overloading
	  public void Poly (int id ) {
		System.out.println("int arg id is :"+id);
		
		}
		
	  public void Poly (String id) {
		  System.out.println("String mail id is :"+id);
		
	}
	
	public static void main(String[] args) {
		polyMorphisam b = new polyMorphisam ();
		b.Poly("Dinesh @12345");
		b.Poly("dinesh muthusamy @123456");
	}
}
             //polyMorphisam     
             //poly- more 
             // morphism-forms
             //one task is completed many way that is called polymorphisam
    //Methode overloading
 //  class name =same
//   methode name=same
//   arugument  =different 
