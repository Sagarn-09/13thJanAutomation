package day10blocks;

public class blocks3 {
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		blocks3 b1 = new blocks3();
		System.out.println("---------------------------------");
		blocks3 b2 = new blocks3();
		System.out.println("main() ends");
	}
}




