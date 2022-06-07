package day5.methods;

public class method8 {

	public static void main(String[] args) {
		
			//static+ method
		
			//step1
				double res=getSI(10000, 8.5, 36);
				System.out.println("interest : "+res);
			//step 2
				System.out.println("interest : "+getSI(2000, 2.5, 12));
			// step3	
				getSI(3000, 2.5, 36);
			}
	
			public static double  getSI(int p, double r, int t) {
				double res=(p*r*t)/100;
				System.out.println("interest : "+res);
				return res;
			}
			
		}
