package day5.methods;

public class method4 {

	public static void main(String[] args) {
		
		System.out.println("simple interest: "+method4.getSI(10, 4.5, 12));
	//or
		double res = +method4.getSI(10, 4.5, 12);
		System.out.println("simple interest: "+res);
	}
	static double getSI(int p, double r, int t) {
		double SI=(p*r*t)/100;
		return SI;
	}
}
