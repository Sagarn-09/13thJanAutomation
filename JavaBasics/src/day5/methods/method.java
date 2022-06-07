package day5.methods;

public class method {
	
	public static void printDetails(int age, int salary) {
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" yrs old");
		System.out.println("I am getting "+salary);
		//return;//optional because if you don't write it dn java compiler will write it
	}
	public static void main(String[] args) {
		
		printDetails(30, 96000);
		method.printDetails(25, 56000);
		printDetails(26, 45000);
		
		
	}
}
