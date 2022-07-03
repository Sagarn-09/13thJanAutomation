package day18.pack1;

public class accesspublicmembers2 {

	public static void main(String[] args) {
		publicmembers p1=new publicmembers();
		System.out.println("Accessing public members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
