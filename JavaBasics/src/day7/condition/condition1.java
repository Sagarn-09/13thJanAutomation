package day7.condition;

public class condition1 {

	public static void main(String[] args) {
	
		int num1=45, num2=30;
		
		if (!(num1==num2)) {
			System.out.println("num1 is equal to num2");
		}else {
			System.out.println("num1 is not equal to num2");	
		}
		
		if(num1>num2) {
			System.out.println("num1 is greather than num2");
		}else {
			System.out.println("num1 is smallar than num2");
		}
		
		if(num1>=num2) {
			System.out.println("num1 is greather than equal to num2");
		}else {
			System.out.println("num1 is smallar than num2");
		}
		
		if(num1==num2 || num1>num2) {
			System.out.println("num1 is greather than num2");
		}else {
			System.out.println("num1 is smallar than num2");	
		}
		
		if(num1>=num2 && num1>num2) {
			System.out.println("num1 is greather than num2");
		}else {
			System.out.println("num1 is smallar than num2");	
		}
		
		if(num1==num2) {
			System.out.println("num1 is equal to num2");
		}else {
			System.out.println("num1 is not equal to num2");
		}
		
		int sub1=50, sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("pass.....");
		}else {
			System.out.println("fail.....");
		}
	}

}
