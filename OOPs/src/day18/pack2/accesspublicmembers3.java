package day18.pack2;

public class accesspublicmembers3 {

	public static void main(String[] args) {
	
		//using fully qualified class name: packagename.classname
		
		day18.pack1.publicmembers p1=new day18.pack1.publicmembers();
		
		System.out.println("Accessing public members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
