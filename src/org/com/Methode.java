package org.com;

public class Methode  extends polyMorphisam {
// methode overriding
	@Override
	public void Poly(int id) {
	System.out.println("student is is :"+id);	
		super.Poly(id);
	}
	public static void main(String[] args) {
		
		Methode f =new Methode();
		f.Poly("Dinesh@840758");
		f.Poly("Dinesh @ 8536880758");

	}

}
//Methode overriding
//  class name =differ
// methode name=same
// arugument  =same
