package day12this;

public class finalkeyword4 {
	
	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
	//	   n=n+2;//can't be changed as n is final  
		   return n*n+n;  
		  }

	public static void main(String args[]) {
		finalkeyword4 ref = new finalkeyword4();
		System.out.println(ref.cube(5));
	}
}
