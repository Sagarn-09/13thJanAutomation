package day6.operators;

public class logical {
	
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int age=18;
		char blgrp='A';
		boolean res1, res2;
		res1=(age>18);
		res2=(blgrp=='A');
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		// Logical AND
		System.out.println("bool1 && bool2 = " + (res1 && res2));

		// Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2));

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(res1 && res2));
	}
		
	
}
