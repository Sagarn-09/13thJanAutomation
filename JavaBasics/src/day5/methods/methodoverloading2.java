package day5.methods;

public class methodoverloading2 {
			/*
			 * Method Overloading: any method declare more than once in class body with
			 * anyone of below rules: 
			 * 1. type of argument differ or 
			 * 2. number of arguments/parameter should differ or 
			 * 3. position of arguments/parameter should differ
			 */
	public static void main(String[] args) {		
		
		methodoverloading2.square();
		methodoverloading2.square(2.5f);
		methodoverloading2.square(5);
	}
		
			public static void square() {
			System.out.println("No Parameter Method Called");
			}
			protected static double square(int number) {
			double res = number * number;
			System.out.println("Method with Integer Argument Called:" + res);
			return res;
			}
			private static void square(double number) {
			double res = number * number;
			System.out.println("Method with float Argument Called:" + res);
			
			}
			
	}
