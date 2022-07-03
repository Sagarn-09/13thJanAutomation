package day20.casting;
class apple {
	void test1() {
		System.out.println("Running test1()");
	}
}
class bananna extends apple {
	void test2() {
		System.out.println("Running test2()");
	}
}
class cake extends bananna {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class autoupcasting1 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		cake c21=new cake();
		c21.test1();
	 	c21.test2();
		c21.test3();
		bananna b11=new bananna();
		b11.test1();
		b11.test2();
		apple a21=new apple();
		a21.test1();
		
		
		bananna b1 = new cake();//auto up casting
		b1.test1();
		b1.test2();
		//b1.test3();
		
		cake c2=new cake();
		bananna b4=c2;//implicit up casting
		bananna b2=(bananna)c2;//explicit up casting---->B2 b2=(B2)new C2();
				//or
		//B2 b3=(B2)new C2();//explicit up casting-
		b2.test1();
		b2.test2();
		
		
		apple a1=new cake();//implicit/auto upcasting
		apple a2=new bananna();//implicit/auto upcasting
		
		bananna x1=new bananna();
		apple a3=x1;//implicit/auto upcasting
		apple a4=(apple)x1;//explicit upcasting
		apple a5=(apple)new bananna();
		System.out.println("Program ends");

	}

}
