package day25.Stringclass;

class demo123{
	private demo123() {
		System.out.println("I am zero-param");
	}
	static demo123 d1=new demo123();
	String name="Pune";
	static demo123 getInstance() {
		return d1;
	}
	void print() {
		System.out.println("I am print() of singleton class demo123");
	}
}
public class singletonclass2 {

public static void main(String[] args) {
	
	//Demo1223 d1=new Demo1223();//compile time error due to singleton class concept
	//or
	demo123 d1=demo123.getInstance();
	d1.print();
	System.out.println(d1.name);
	
	d1.name="Banglore";
	System.out.println("d1 ref: "+d1.name);
	
	demo123 d2= demo123.getInstance();
	System.out.println("d2 ref: "+d2.name);
	}
}
