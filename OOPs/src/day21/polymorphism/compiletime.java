 package day21.polymorphism;

public class compiletime {
	static void sum(int a , int b) {
		int c = a + b;
		System.out.println("addition of two numbers: "+c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("addition of three numbers: "+c);
	}
	public static void main(String []args) {
	compiletime.sum(10, 12, 15);
	compiletime.sum(10,12);
	}
}
