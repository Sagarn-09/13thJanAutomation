package day14.overriding;

class animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}
class dog2 extends animal2 {
	public void move() {
		super.move(); 
		System.out.println("Dogs can walk and run");
	}
}
public class overriding2 {

	public static void main(String args[]) {
		animal2 b = new dog2(); // Animal reference but Dog object
		b.move(); 
	}
}

/*Animals can move
Dogs can walk and run
*/