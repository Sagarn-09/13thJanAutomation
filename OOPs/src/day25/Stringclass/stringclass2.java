package day25.Stringclass;

public class stringclass2 {

public static void main(String[] args) {
	String str1="DhanoriPune";
	String temp="";
	//to print one by one character of string
	for(int i=0;i<str1.length();i++) {
		System.out.println(str1.charAt(i));
	}
	
	for(int i=str1.length()-1;i>=0;i--) {
		temp=temp+str1.charAt(i);
	}
	System.out.println("str1: "+str1);
	System.out.println("temp: "+temp);
	}
}
