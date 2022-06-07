package day11constructor;

public class consoverloading1 {
	
//Zero Parameterized Constructor
	consoverloading1() {
	
		System.out.println("*******zero-para*********");
	}
//Parameterized Constructor	
	consoverloading1(int a) {
		System.out.println("*******int para***********");
	}
	consoverloading1(double b) {
		System.out.println("*******double para*********");
	}
	consoverloading1(int a, double b, char c) {
		System.out.println("*******int,double,int para**********");
	}	
	consoverloading1(double a, int b, int c) {
		System.out.println("*******double,int,int para***********");
	}
	public static void main(String args[]) {
		consoverloading1 a1 = new consoverloading1();
		consoverloading1 a2 = new consoverloading1(12);
		consoverloading1 a3 = new consoverloading1(13.34);
		consoverloading1 a4 = new consoverloading1(10,13.34,'a');
		consoverloading1 a5 = new consoverloading1(13.34,23,87);

	}
}