package day6.operators;

public class unary3 {
	public static void main(String[] args) {
		int a = 5, b;
		b = a++ + ++a + ++a + a; 
	  //b = 5  7  8  8
		System.out.println("a: "+a);//8 
		System.out.println("b: "+b);// 28
		System.out.println("**********************");
		a = -7;
		b = a-- + --a + --a + a;
	//  b = -7  -9  -10  -10 
		System.out.println("a: "+a);//-10
		System.out.println("b: "+b);// -36
		System.out.println("**********************");
		a = 17;
		b = --a + --a + --a + a + ++a + a++;
	//  b = 16  15  14   14   15  15 
		System.out.println(a);// 16
		System.out.println(b);// 89
		System.out.println("**********************");
		a = -3;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
	//  b = -3   -4   -3    -3    -1   -1     0
		System.out.println(a);//
		System.out.println(b);//
	}
}
