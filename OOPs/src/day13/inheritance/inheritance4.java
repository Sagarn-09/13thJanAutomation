package day13.inheritance;
class fourwheeler {
	//default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}
class car extends fourwheeler {
	//default constructor with default super()
	public void type() {
		System.out.println("I'm a car");
	}
}
class maruti extends car {
	//default constructor with default super();
	public void company() {
		System.out.println("I'm maruti");
	}
}
public class inheritance4 {
	public static void main(String[] args) {
		maruti fr = new maruti(); // object of child class
		fr.wheels();
		fr.type();
		fr.company();
	}
}
