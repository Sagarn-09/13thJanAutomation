package day20.casting;
class pune{
	void deccan() {
		System.out.println("you are deccan");
	}
}
class mumbai extends pune{
	void kurla() {
		System.out.println("you are in kurla");
	}
}
public class upcasting1 extends mumbai{

	void mycity() {
		System.out.println("you in city");
	}
	public static void main(String[] args) {
	upcasting1 u1=new upcasting1();

//implicit upcasting or auto up-casting
	mumbai m1=new upcasting1();
	mumbai m2=u1;
	pune p1=new upcasting1();
	pune p2=u1;

//explicit upcasting
	mumbai m3=(mumbai) new upcasting1();
	mumbai m4=(mumbai)u1;
	pune p3=(pune)new upcasting1();
	pune p4=(pune)u1;
	
	pune p5=new mumbai();	//implicit upcasting
	pune p6=(pune)new mumbai();	//explicit upcasting
	}
}
