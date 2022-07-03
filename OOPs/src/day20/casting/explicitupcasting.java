package day20.casting;

class A{
	void test1() {
		System.out.println("running test1()");
	}
}
class B extends A{
	void test2() {
		System.out.println("running test2()");
	}
}
class C extends B{
	void test3() {
		System.out.println("running test3()");
	}
}
public class explicitupcasting {

	public static void main(String[] args) {
		System.out.println("program start");
		C c1=new C();
		B b1=(B)c1; //(B)newC(); explicit upcasting
		b1.test1();
		b1.test2();
		//b1.test3();
		System.out.println("program ends");
		
	}
}
