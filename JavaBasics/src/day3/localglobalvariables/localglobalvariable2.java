package day3.localglobalvariables;
 
public class localglobalvariable2 {
	static int age=25;
	public static void main(String[] args) {
	
		
	System.out.println("Program starts........");
	System.out.println("SGV : "+age);
	System.out.println("SGV with standard : "+localglobalvariable2.age);
	
	age=30;
	System.out.println("SGV : "+age);
	System.out.println("SGV with standard : "+localglobalvariable2.age);
		
	int age=35;
	System.out.println("Local variable : "+age);
	System.out.println("SGV with standard : "+localglobalvariable2.age);
	
	System.out.println("Program end........");

	}

}
