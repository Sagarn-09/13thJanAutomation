package day20.casting;

class sample {
	void test1(double d) {
		System.out.println("d value ="+d);
	}
	void test1(int k) {
		System.out.println("k valve="+k);
	}
}
public class primitivecasting5 {

	public static void main(String[] args) {
		System.out.println("program starts");
		sample s=new sample();
		s.test1(7.2);
		System.out.println("program ends");
	}
}
