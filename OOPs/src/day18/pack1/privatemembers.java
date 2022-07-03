package day18.pack1;

public class privatemembers {
	
	private int accnum=12345;
	private void displayaccnum() {
		System.out.println("Account Number: "+accnum);
	}
	public static void main(String[] args) {
		
		privatemembers p1=new privatemembers();
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
/*	class accessprivatemembers2{
	public static void main(String[] args) {
		privatemembers p1=new privatemembers();
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}*/