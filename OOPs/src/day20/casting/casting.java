package day20.casting;

class parent100{
	void myhome() {
		System.out.println("parent home");
	}
}
class child100 extends parent100{
	void mycar() {
		System.out.println("child car");
	}
}
public class casting {

	public static void main(String[] args) {
	child100 c2=new child100();
	c2.mycar();
	c2.myhome();
	parent100 p1=new parent100();
	p1.myhome();
	
	System.out.println("*******using upcastiing********");
	child100 c3=new child100();
	c3.mycar();
	c3.myhome();
	parent100 c4=c3;
	c4.myhome();
	}
}
