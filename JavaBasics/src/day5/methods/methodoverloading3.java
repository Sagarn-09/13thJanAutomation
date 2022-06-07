package day5.methods;

public class methodoverloading3 {
	public static void main() {
		System.out.println("I am main()...");
	}
	public static void main(String[] args) {
		main();
		System.out.println("sum:1 "+addNumbers());
		System.out.println("sum:2 "+methodoverloading3.addNumbers(45, 55));
		System.out.println("sum:3 "+addNumbers(47, 63, 58));
		System.out.println("sum:4 "+methodoverloading3.addNumbers(37, 36.56, 28));
	}
	static int addNumbers() {
		int num1=10,num2=20;
		return num1+num2;		
	}
	static int addNumbers(int num1,int num2) {
		return num1+num2;		
	}
	static int addNumbers(int num1,int num2,int num3) {
		return num1+num2+num3;		
	}
	static double addNumbers(int num1,double num2,int num3) {
		return num1+num2+num3;		
	}
}
