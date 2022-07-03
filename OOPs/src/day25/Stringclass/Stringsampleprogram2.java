package day25.Stringclass;

public class Stringsampleprogram2 {

public static void main(String[] args) {

// Returns the index within the string
// of the first occurrence of the specified string.
	String s5 = "Learn Share Learn Share";
	System.out.println("s5 size: "+s5.length());
	System.out.println("Index of 'Share' starts from: " + s5.indexOf("Share"));
// Returns the index within the string of the
// first occurrence of the specified string,
// starting at the specified index.
	System.out.println("Index of a = " + s5.indexOf('a',3));
	System.out.println("Index of e = " + s5.indexOf('e',11));

	System.out.println("last Index of 'Learn'  = " + s5.lastIndexOf("Learn",18));
	System.out.println("last Index of e = " + s5.lastIndexOf('e',20));

// Checking equality of Strings
	String s6="Selenium";
	String s7="selenium";
	String s8="Selenium";
	System.out.println("Checking Equality of s6 & s7: " + s6.equals(s7));
	System.out.println("Checking Equality of s6 & s8: " + s6.equals(s8));
	System.out.println("Checking Equality of s6 & s7 with Ignore case: " + s6.equalsIgnoreCase(s7));//

// Converting cases
	String word1 = "CoreJava";
	System.out.println("Changing to lower Case: " +word1.toLowerCase());

// Converting cases
	String word2 = "CoreJava";
	System.out.println("Changing to UPPER Case: " + word2.toUpperCase());

// Trimming the word
	String word4 = " Learn Share Learn ";
	System.out.println("Trim the word:" + word4.trim());
	}
}
