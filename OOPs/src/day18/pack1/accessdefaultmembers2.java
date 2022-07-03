package day18.pack1;

public class accessdefaultmembers2 {

	public static void main(String[] args) {
		defaultmembers d1=new defaultmembers();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(d1.accnum);
		d1.displayaccnum();
	}

}
