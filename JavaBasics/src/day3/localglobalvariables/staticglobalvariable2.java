package day3.localglobalvariables;

public class staticglobalvariable2 {

static int mobilenum=123;
	
	public static void main(String[] args) { 
		System.out.println("program starts");
		System.out.println("SGV : "+mobilenum);
		System.out.println("SGV with standard : "+staticglobalvariable2.mobilenum);
		
		mobilenum=456;
		System.out.println("SGV : "+mobilenum);
		System.out.println("SGV with standard : "+staticglobalvariable2.mobilenum);
		
		int mobilenum=789;
		System.out.println("SGV : "+mobilenum);
		System.out.println("SGV with standard : "+staticglobalvariable2.mobilenum);
		
		System.out.println("program end");
		

	}

}
