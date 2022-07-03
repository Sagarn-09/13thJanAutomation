package day13.inheritance;
class A{
	static int a=10;
	int b=20;
	double c = 13.45;
}
class B{
	static int x=30;
	int y= 40;
	double z=53.45;
}
class C {
	static int p=60;
	int q=60;
	double r=66.45;
}
public class inheritance1 {

public static void main(String[] args) {

//static method
	System.out.println("static class A "+A.a);
	System.out.println("static class B "+B.x);
	System.out.println("static class C "+C.p);

//nonstatic method	
	A a1=new A();
	System.out.println("Non-static class A "+a1.b);
	System.out.println("Non-static class A "+a1.c);
	
	B b1=new B();
	System.out.println("Non-static class B "+b1.y);
	System.out.println("Non-static class B "+b1.z);
	
	C c1=new C();
	System.out.println("Non-static class C "+c1.q);
	System.out.println("Non-static class C "+c1.r);
	}

}
