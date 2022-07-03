package day18.pack1;

public class accessprotectedmembers2 {
	public static void main (String []args) {
		protectedmembers p1=new protectedmembers();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
