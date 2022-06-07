package day12this;

public class thiskeyword2 {

		int x;
		// Constructor with a parameter
		public thiskeyword2(int x) {
			this.x = x;
		}

		// Call the constructor
		public static void main(String[] args) {
			thiskeyword2 myObj = new thiskeyword2(45);
			System.out.println("Value of x = " + myObj.x);//
		}
}
