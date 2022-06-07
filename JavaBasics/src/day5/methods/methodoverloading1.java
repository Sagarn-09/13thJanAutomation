package day5.methods;

public class methodoverloading1 {

	public static void main(String[] args) {
		System.out.println(checklargenum(2, 4));
		System.out.println(checklargenum(8, 4));
		System.out.println(checklargenum(22, 46));
	}
	static boolean checklargenum(int num1, int num2) {
		boolean res=num1<num2;
		return res;
	}
}
