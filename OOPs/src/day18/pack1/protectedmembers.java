package day18.pack1;

public class protectedmembers {
	
	protected int accnum=12345;
	protected void displayaccnum() {
		System.out.println("Account Numbers: "+accnum);
	}
	public static void main(String[] args) {
		protectedmembers p1=new protectedmembers();
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
class  accessprotectedmembers {
	public static void main (String [] args) {
		protectedmembers p1=new protectedmembers();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}