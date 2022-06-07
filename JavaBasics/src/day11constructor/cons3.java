package day11constructor;

public class cons3 {

	int age=5;
	double salary=75.36;
	/**
	 *  below is default constructor, that will be written by java compiler at compile time
	  Cons3(){
			//empty body
		}
	*/

	public static void main(String[] args) {

		cons3 c1 = new cons3();
		System.out.println(c1.age);
		System.out.println(c1.salary);
	}
}

