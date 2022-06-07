package day11constructor;

public class consoverloading2 {
	
	static int age;
	double salary;
	
	consoverloading2 () {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	consoverloading2(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	consoverloading2(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}

	consoverloading2(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}

	public static void main(String args[]) {
		consoverloading2 pc1 = new consoverloading2();
		System.out.println("After Zero-para constructor,Age= "+pc1.age);
		System.out.println("After Zero-para constructor,Salary= "+pc1.salary);		
		
		consoverloading2 pc2 = new consoverloading2(33);
		System.out.println("After int-para constructor,Age= "+pc2.age);
		System.out.println("After int-para constructor,Salary= "+pc2.salary);
		
		consoverloading2 pc3 = new consoverloading2(34000.34);
		System.out.println("After double-para constructor,Age= "+pc3.age);
		System.out.println("After double-para constructor,Salary= "+pc3.salary);
		
		consoverloading2 pc4 = new consoverloading2(30,95000.34);
		System.out.println("After int-double-para constructor,Age= "+pc4.age);
		System.out.println("After int-double-para constructor,Salary= "+pc4.salary);
		
		
	}
	}
