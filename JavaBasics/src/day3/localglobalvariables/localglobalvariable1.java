package day3.localglobalvariables;

public class localglobalvariable1 {
	
	// global variable
		int age=30;							// non-static global variable
		static double salary=55000.56;		//static global variable
			
	public static void main(String[] args) {
		
		//local variable
		int num1=52;
		System.out.println("local variable :"+num1);
		
		// static global variable
		System.out.println("SGV : "+salary);
		
		// non-static global variable
		localglobalvariable1 x1= new localglobalvariable1();
		System.out.println("NSGV : "+x1.age);

	}

}
 