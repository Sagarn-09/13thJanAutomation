package day12this;

public class finalkeyword3 {


		final int speedlimit;// blank final variable
		finalkeyword3() {
			speedlimit = 70;
			System.out.println(speedlimit);
		}
		public static void main(String args[]) {
			finalkeyword3 obj = new finalkeyword3();
			System.out.println(obj.speedlimit); 
		}
}

