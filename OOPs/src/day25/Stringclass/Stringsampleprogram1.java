package day25.Stringclass;

public class Stringsampleprogram1 {

public static void main(String[] args) {

	String s1= "CoreJavaBasics";
        // or 
	//String s1= new String ("CoreJavaBasics");

// Returns the number of characters in the String.
	System.out.println("String length = " + s1.length());

// Returns the character at ith index.
	System.out.println("Character at 3rd position = "+ s1.charAt(2));

// Return the substring from the ith  index character
// to end of string
	System.out.println("Substring from index 3:" + s1.substring(3));

// Returns the substring from i to j-1 index.
	System.out.println("Substring from 2 to 5: " + s1.substring(2,5));
	System.out.println("Substring from 4 to 8: " + s1.substring(4,8));

// Concatenates string2 to the end of string1.
	String s2 = "Core";
	String s3 = "JavaBasic";
	System.out.println("First value of s2: "+s2);
	System.out.println("First value of s3: "+s3);
	System.out.println("Concatenated string  = "+s2.concat(s3));
	System.out.println("after Concatenated value of s2: "+s2);
	System.out.println("after Concatenated value of s3: "+s3);
	}
}