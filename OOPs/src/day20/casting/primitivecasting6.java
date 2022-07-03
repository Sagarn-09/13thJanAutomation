package day20.casting;

class sample1 {
	double test1() {
		System.out.println("running test1");
		return 4;
	}
}
public class primitivecasting6 {

	public static void main(String[] args) {
		System.out.println("program starts");
		sample1 s=new sample1();
		
	//explicit narrowing
		int res=(int)s.test1();
		System.out.println("return value: "+res);
		System.out.println("program ends");
	}
}
