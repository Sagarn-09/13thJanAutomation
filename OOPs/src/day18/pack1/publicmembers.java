package day18.pack1;

public class publicmembers {
	public int accnum=12345;
	public void displayaccnum() {
		System.out.println("Acount Nunmber: "+accnum);	
	}
	public static void main(String[] args) {
		publicmembers p1=new publicmembers();
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
class accesspublicmembers {
	public static void main(String[] args) {
		publicmembers p1=new publicmembers();
		System.out.println("Accessing public members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}