package day10blocks;

public class blocks4 {
	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		blocks4 b1=new blocks4();
		System.out.println("---------------------------------");
		blocks4 b2=new blocks4();
		System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}	
}
