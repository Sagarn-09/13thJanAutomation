package day18.pack2;

import day18.pack1.protectedmembers;

public class accessprotectedmembers2 extends protectedmembers {

	public static void main(String[] args) {
		
		accessprotectedmembers2 p1=new accessprotectedmembers2();
		
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
