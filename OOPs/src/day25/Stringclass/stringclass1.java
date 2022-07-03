package day25.Stringclass;

public class stringclass1 {

	public static void main(String[] args) {
		
	stringclass1 c1=new stringclass1();
	System.out.println("c1:"+c1);		
	String s1="Mumbai";
	String s2="Mumbai";
	String s3="Bangalore";
		
	System.out.println("s1: "+s1);
	System.out.println("s2: "+s2);
	System.out.println("s3: "+s3);
	
	System.out.println("s1 char count: "+s1.length());
	System.out.println("s2 char count: "+s2.length());
	System.out.println("s3 char count: "+s3.length());
	
	System.out.println("s1 & s2 using equals(): "+s1.equals(s2));
	System.out.println("s1 & s2 using '==': "+(s1==s2));
	
	System.out.println("s1 & s3 using equals(): "+s1.equals(s3));
	System.out.println("s1 & s3 using '==': "+(s1==s3));
	
	String s4=new String("Mumbai");
	System.out.println("s4: "+s4);
	
	System.out.println("s1 & s4 using equals(): "+s1.equals(s4));
	System.out.println("s1 & s4 using '==': "+(s1==s4));
	
	String s5=new String("Mumbai");
	System.out.println("s5: "+s5);
	
	System.out.println("s4 & s5 using equals(): "+s4.equals(s5));
	System.out.println("s4 & s5 using '==': "+(s4==s5));
	
	String s6=new String("Hyderabad");
	System.out.println("s6: "+s6);
	
	System.out.println("s1 & s6 using equals(): "+s1.equals(s6));
	System.out.println("s1 & s6 using '==': "+(s1==s6));
	
	}
}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are override
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> overrided 
				3. hashCode()
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/