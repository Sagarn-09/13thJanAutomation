package day24.predefinedclasses;

final class Sampleprint {
	void display(int i) {
		System.out.println("display( of sampleprint class, i:"+i);
	}
}
public class printlnmethod {
	static Sampleprint s1=new Sampleprint();
	
	public static void main(String[] args) {
		
	System.out.println("Hello");
	
//final_class.static_ref_variable.public_method	
	printlnmethod.s1.display(10);
	}
}