package day11constructor;

public class cons2 {
	cons2() {
		System.out.println("This is a zero-para constructor");
	}
	cons2(char c) {
		System.out.println("This is a single-para constructor");
	}
	cons2(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}	
	cons2(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	cons2(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	cons2(double num1, boolean num2,char c) {
		System.out.println("This is a double-int parameterized constructor");
	}
	public static void main(String[] args) {
		cons2 c1 = new cons2();
		cons2 c2 = new cons2(10, 20);
		cons2 c3 = new cons2('d');
		cons2 c4 = new cons2(10d, 20);
		cons2 c5 = new cons2(10, 20.45);
	}
}
