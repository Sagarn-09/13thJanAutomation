package day14.overriding;


class Human {
	// Overridden method
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	public void eat() { 
		super.eat();
		System.out.println("Boy is eating");
	}
}
public class overriding3 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}

}
