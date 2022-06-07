package day3.localglobalvariables;

public class staticglobalvariable1 {


	static int empId; 
	static double salary;
	static char grade;
	static boolean pagal;
	
	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("salary : "+salary);	//0.0
		System.out.println("empId : "+empId); //0
		System.out.println("grade : "+grade); //
		System.out.println("pagal : "+pagal); //false
		int age=25;
		System.out.println(age);
		System.out.println("program end");

	}

}
