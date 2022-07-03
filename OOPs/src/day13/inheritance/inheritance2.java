package day13.inheritance;
//super class/parent class
class A1{
	A1(){
		
	}
	static int a=10;
	int b=20;
	double c=13.45;
}
//subclass / child class
class B1 extends A1{
	B1(){
		//super();
	}
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1{
	C1(){
		super();		
	}
	static int p=50;
	int q=60;
	double r=66.45;
}
public class inheritance2 {

public static void main(String[] args) {
	//static method access 	
		System.out.println("static member"+A1.a);
		System.out.println("static member"+B1.x);
		System.out.println("static member"+C1.p);
	//nonstatic method access
		C1 c1=new C1();
		System.out.println("class c refer "+c1.b);
		System.out.println("class c refer "+c1.c);
		System.out.println("class c refer "+c1.y);
		System.out.println("class c refer "+c1.z);
		System.out.println("class c refer "+c1.q);
		System.out.println("class c refer "+c1.r);

		B1 b1=new B1();
		System.out.println("class b refer "+b1.b);
		System.out.println("class b refer "+b1.c);
		System.out.println("class b refer "+b1.y);
		System.out.println("class b refer "+b1.z);
	}

}
