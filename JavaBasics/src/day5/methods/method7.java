package day5.methods;

public class method7 {
	public static void main(String[] args) {
	
		//non-static+ method
		method7 x1=new method7();			//complasary
	//step1
		double res=x1.getSI(10000, 8.5, 36);
		System.out.println("interest : "+res);
	//step 2
		System.out.println("interest : "+x1.getSI(2000, 2.5, 12));
	// step3	
		x1.getSI(3000, 2.5, 36);
	}
	public double  getSI(int p, double r, int t) {
		double res=(p*r*t)/100;
		System.out.println("interest : "+res);
		return res;
	}
	
}
