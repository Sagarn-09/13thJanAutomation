package day4.finalvariables;

public class finalvariable1 { 

	public static void main(String[] args) {
		final int empId=123;
		System.out.println("EmpId: "+empId);//123
		
		//empId=456;		//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//456
		//empId=789;		//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//789
		//empId=654;		//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//654
	}

}
