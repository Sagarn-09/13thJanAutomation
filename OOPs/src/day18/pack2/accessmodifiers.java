package day18.pack2;

import day18.pack1.modifiers;

public class accessmodifiers extends modifiers {
	

	public static void main(String[] args) {
		accessmodifiers a1=new accessmodifiers();
		
		modifiers m1 = new modifiers();
//		System.out.println("private variable: "+m1.num1);
//		System.out.println("default variable: "+m1.num2);
		System.out.println("protected variable: "+a1.num3);
		System.out.println("public variable: "+m1.num4);
	}
}
