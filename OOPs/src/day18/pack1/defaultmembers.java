package day18.pack1;

public class defaultmembers {
	
	int accnum=12345;
	void displayaccnum() {
		System.out.println("Account Numbers: "+accnum);
	}
	public static void main(String[] args) {
		defaultmembers d1=new defaultmembers();
		System.out.println(d1.accnum); 
		d1.displayaccnum();

	}
}
class accessdefaultmembers {
	
	public static void main (String [] args) {
		
		defaultmembers d1=new defaultmembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(d1.accnum);
		d1.displayaccnum();
	}
}
