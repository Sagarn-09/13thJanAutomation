package day6.operators;

public class unary1 {
	
		public static void main(String[] args) {

//a++ = var+1  & a-- = var-1 &  ++a = 1+var & --a = -1-var
//public class UnaryOp3 {
//* pre: first perform the operation dn use the updated value  = a++ & a-- 
//* post: first use the value dn perform the operation  = ++a & --a
			
		int a = 10;
		int b = a;
		System.out.println("a: " + a);//10
		System.out.println("b: " + b);//10
		System.out.println("*********************");	
		int k = ++a;
		System.out.println("k: " + k);//11
		System.out.println("a: " + a);//11
		System.out.println("*********************");
		int j = k++;//
		System.out.println("k: " + k);//12
		System.out.println("j: " + j);//11
		System.out.println("*********************");
		int r = 21;
		System.out.println("r=: " + r++);//21
		System.out.println("r=: " + r);//22
		System.out.println("r=: " + ++r);//23
		System.out.println("r=: " + r);//23
		System.out.println("*********************");
		int x = 105;
		System.out.println("x=: " + --x);//104
		System.out.println("x=: " + x);//104
		System.out.println("x=: " + x--);//104
		System.out.println("x=: " + x);// 103
	}
}

