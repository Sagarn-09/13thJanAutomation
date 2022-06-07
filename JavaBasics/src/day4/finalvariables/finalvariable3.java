package day4.finalvariables;

public class finalvariable3 {
	
	
		/* as pi is a global variable*/
		static double pi; 
		public static void main(String[] args) {
			//area=pi*r*r;
			int r=15;
			pi=3.14;
			System.out.println("Radius is: "+r);
			double area = pi*r*r;
			System.out.println("area of circle is: "+area);

	}

}
