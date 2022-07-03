package day25.Stringclass;

public class Stringsampleprogram3 {

public static void main(String[] args) {
	
// Replacing characters
		String str1 = "CoreJavaBasic";
		System.out.println("Original String: " + str1);
		String str2 = str1.replace('a' ,'x') ;
		System.out.println("Replaced a with x -> " + str2);

		String str3=str1.replace("Java", "Net");
		System.out.println("Replaced 'Java' with 'Net' -> " + str3);

		String str4=str1.replaceFirst("a", "W");	
		System.out.println("Replaced first 'a' with 'W' -> " + str4);
		
		String str5=" ";
		System.out.println("str5 is empty or not: "+str5.isEmpty());
		
		String str6=new String();	
		System.out.println("str6 is empty or not: "+str6.isEmpty());	
	}
}
