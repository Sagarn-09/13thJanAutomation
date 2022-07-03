package day16interface;
	
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method
}
class interface5 implements Showable2 {
	public void print() {
		System.out.println("Hello");
}
public void show() {
	System.out.println("Welcome");
}
public static void main(String args[]) {
	interface5 obj = new interface5();
	obj.print();
	obj.show();
	Printable2 obj2 = new interface5();
	obj2.print();
	}
}
