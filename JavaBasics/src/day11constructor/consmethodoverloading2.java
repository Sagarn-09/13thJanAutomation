package day11constructor;

public class consmethodoverloading2 {
	

	double sum(int g, int h) {
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String args[]) {
		consmethodoverloading2 ob = new consmethodoverloading2();
		double result = ob.sum(20, 20);
		double result2 = ob.sum(20, 20.56);

	}
}
