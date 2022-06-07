package day10blocks;

public class blocks6 {
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		blocks6 b1=new blocks6();
		System.out.println("---------------------------------");
		blocks6 b2=new blocks6();
		System.out.println("main() ends");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-2 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}
