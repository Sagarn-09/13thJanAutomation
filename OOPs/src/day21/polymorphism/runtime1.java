package day21.polymorphism;
class animal {
	void eat() {
		System.out.println("animal eat");
	}
}
class herbivores extends animal {
	void eat() {
		System.out.println("herbivores eat plants");
	}
}
class omnivores extends animal{
	void eat() {
		System.out.println("omnivores eat plants and meat");
	}
}
class carnivores extends animal{
	void eat() {
		System.out.println("carnivores eat meat");
	}
}
public class runtime1 {

	public static void main(String []args) {
	animal a=new animal();
	a.eat();
	animal h=new herbivores();
	h.eat();
	animal o=new omnivores();
	o.eat();
	animal c=new carnivores();
	c.eat();
	}
}
