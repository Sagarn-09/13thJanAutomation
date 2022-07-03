package day13.inheritance;
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
//class inheritance5 extends A2,B2 {
 class inheritance5 extends A2 { 
	inheritance5(){
		super();//confusion 
	}

	public static void main(String args[]) {
		inheritance5 obj = new inheritance5();
		obj.msg();
	}
}