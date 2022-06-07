package day6.operators;

public class unary2 {
	public static void main(String[] args) {

		int a = 47, b;
		b = a++;
		System.out.println(a);// 48
		System.out.println(b);// 47
		int x = a;
		int y;
		System.out.println(x);// 48
		y = ++x;
		System.out.println(x);// 49
		System.out.println(y);// 49

		int p = -15, q = 25, res;
		res = p++ + --q;
		System.out.println("res: " + res);//9
		System.out.println("p: " + p);// -14
		System.out.println("q: " + q);// 24
		System.out.println("*****************************");
		int res1 = ++p + ++q;
		System.out.println(res1);// -13+25=12
		System.out.println("p: " + p);// -13
		System.out.println("q: " + q);// 25
	}
}
