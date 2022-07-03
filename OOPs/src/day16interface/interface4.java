package day16interface;

interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
class interface4 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
}
public static void main(String args[]) {
		interface4 obj = new interface4();
		obj.print();
		Showable1 obj1 = new interface4();
		obj1.print();
		Printable1 obj2 = new interface4();
		obj2.print();
	}
}
