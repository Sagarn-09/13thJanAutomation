package day25.Stringclass;

import java.util.Scanner;

public class stringclass3 {

public static void main(String[] args) {
	
	System.out.println(reverseString("DhanoriPune"));
	
	String s1="Bangalore";
	System.out.println(reverseString(s1));
	
	Scanner scn=new Scanner(System.in);
	String s2;
	System.out.println("Enter String to be reverse: ");
	s2=scn.next();
	System.out.println("Reverse String is: "+reverseString(s2));
	
	System.out.println();
	Scanner scn1 =new Scanner(System.in);
	String s3;
	System.out.println("Enter string to check for palindrome");
	s3=scn1.next();
	palinString(s3);
	
}
static String reverseString(String str) {
	String s1=str;
	String temp="";
	for(int i=str.length()-1;i>=0;i--) {
		temp=temp+str.charAt(i);
	}
	return temp;
}
static void palinString(String str) {
	String s1=str;
	String temp="";
	for(int i=str.length()-1;i>=0;i--) {
		temp=temp+str.charAt(i);
	}
	if(temp.equals(s1)) {
		System.out.println("Given string is a palindrome..."+str);
	}else {
		System.out.println("Given string is not a palindrome..."+str);
	}
	}
}