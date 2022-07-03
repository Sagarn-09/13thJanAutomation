package day21.polymorphism;
class car {
	void run() {
		System.out.println("running");
	}
}
class innova extends car{
	void run() {
		System.out.println("running fast at 120km");
	}
}
public class runtime3 {

	public static void main(String []args) {
	car c=new innova();
	c.run();
	}
}
