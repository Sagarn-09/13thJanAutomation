package day12this;

public class thiskeyword4 {

		void m() {
			System.out.println("this keyword pointing to: "+this);// prints same reference ID
		}
		
		public static void main(String args[]) {
			thiskeyword4 obj = new thiskeyword4();
			
			System.out.println("obj pointing to: "+obj);// prints the reference ID
			obj.m();
		}
}
