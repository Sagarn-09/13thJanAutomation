package day16interface;

interface Printable {
	int age=30;//by default public static final
	void print();
}
interface Showable {
	void show();
}
class interface3 implements Printable, Showable {

	public void print() {
		System.out.println("Hello, print");
		}
	public void show() {
	System.out.println("Welcome, show");
	}
public static void main(String args[]) {
	interface3 obj = new interface3();
	obj.print();
	obj.show();
	System.out.println(Printable.age);
	}
}
