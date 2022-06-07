package day3.localglobalvariables;

public class nonstaticglobalvariable2 {
	int mobilenum=123;
	char grade;
	public static void main(String[] args) { 
		nonstaticglobalvariable2 r1 = new nonstaticglobalvariable2 ();
		
		System.out.println("mobilenum with r1 reference :"+r1.mobilenum);
		System.out.println("grade with r1 reference :"+r1.grade);
		
		nonstaticglobalvariable2 x1 = new nonstaticglobalvariable2();
		System.out.println("mobilenum with x1 reference :"+x1.mobilenum);
		System.out.println("grade with x1 reference :"+x1.grade);
		
		x1.mobilenum=987;
		x1.grade='A';
		System.out.println("updated mobilenum with x1 reference :"+x1.mobilenum);
		System.out.println("updated grade with x1 reference :"+x1.grade);
		
		System.out.println("mobilenum with r1 reference :"+r1.mobilenum);
		System.out.println("grade with r1 reference :"+r1.grade);
		
	}

}
