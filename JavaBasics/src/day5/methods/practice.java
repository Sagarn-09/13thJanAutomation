package day5.methods;

public class practice {
	// global variable
			int age=30;							// non-static global variable
			static double salary=55000.56;		//static global variable
	public static void main(String[] args) {
		
		//local variable
		int num1=52;
		System.out.println("LV : "+num1);
		
		// static global variable
		System.out.println("SGV : "+salary);
		
		// non-static global variable
		practice x1= new practice();
		System.out.println("NSGV : "+x1.age);
		System.out.println("NSGV : "+x1.salary);
		
		//static method
		System.out.println("-------static method---------");
		double res=additionresult(25, 30);
		System.out.println("addition result : "+res);
		
		//non-static method
		System.out.println("-------non-static method---------");
		practice m1= new practice();
		double res1=m1.getSI(100, 4.5, 6);
		System.out.println("SI : "+res1);
		
		//static overloading
		System.out.println("-------static overloading ---------");
		System.out.println("Sum 1 : "+sumNumbers(35,45));
		System.out.println("Sum 2 : "+sumNumbers(32,52.36,66));
		
		//non-static overloading
		System.out.println("-------non-static overloading ---------");
		practice z1= new practice();
		System.out.println("Sum 3 : "+z1.addNumbers(25,55));
		System.out.println("Sum 4 : "+z1.addNumbers(23.96,48.23,88.02));
		}
		
		static double additionresult(int num1, int num2) {//static method
		double res=num1+num2;
		return res;
		
		}
		private double getSI(int p, double r, int t) {  //non-static method
		double res1=(p*r*t)/100;
		return res1;
	
		}
		static int sumNumbers(int num1, int num2) {  //static overloading
		return num1+num2;		
		}
		static double sumNumbers(int num1, double num2, int num3) {
		return num1+num2+num3;
		}
		int addNumbers(int num1,int num2) {          //non-static overloading
		return num1+num2;		
		}
		double addNumbers(double num1,double num2,double num3 ) {
		return num1+num2;
		}
	}

/* global variable---> static/non-static
 * method ---> static/non-static
 * overloading---> static/non-static
 */
