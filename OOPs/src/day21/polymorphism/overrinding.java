package day21.polymorphism;
class vehicle {
	void run() {
		System.out.println("vehicle is moving");
	}
}
class maruty extends vehicle {
	void run() {
		System.out.println("car is running safety");
	}
}
public class overrinding {

	public static void main(String []args) {
	maruty obj=new maruty();
	obj.run();
	
	vehicle v1=new vehicle();
	v1.run();
	}
}
