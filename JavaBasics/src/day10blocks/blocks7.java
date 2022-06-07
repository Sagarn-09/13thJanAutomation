package day10blocks;

public class blocks7 {
	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 30;
	}
	/* non-static block or IIB */
	{
		//
		salary = 45000.32;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + blocks7.age);
		System.out.println("---------------------------------");
		blocks7 b1 = new blocks7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}
