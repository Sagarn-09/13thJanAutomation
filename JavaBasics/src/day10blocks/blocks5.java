package day10blocks;

public class blocks5 {

	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		blocks5 b1 = new blocks5();
		System.out.println("---------------------------------");
		blocks5 b2 = new blocks5();
		System.out.println("main() ends");
	}
}
