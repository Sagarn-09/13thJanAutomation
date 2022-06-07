package day3.localglobalvariables;

public class nonstaticglobalvariable1 {
	 
	int mobilenum=123;
	public static void main(String[] args) {
		System.out.println("Program starts........");
		
		nonstaticglobalvariable1 ref = new nonstaticglobalvariable1();
		
		System.out.println("1st Reference : "+ref.mobilenum);
		
		ref.mobilenum=456;
		
		System.out.println("2st Reference : "+ref.mobilenum);
		
		nonstaticglobalvariable1 ref1 = new nonstaticglobalvariable1();
		
		System.out.println("2st Reference : "+ref1.mobilenum);
		
		System.out.println("Program end........");

	}

}
