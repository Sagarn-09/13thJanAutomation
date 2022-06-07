package day8.loop;

public class whileloop3reverseno {

	public static void main(String[] args) {
			int num=123,rev=0,rem;
			while(num!=0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println("Reverse Number: "+rev);
			System.out.println("Reverse Number using method: "+getReverseNumber(12345));
		}
		public static int getReverseNumber(int num) {
			int rev=0,rem;
			while(num!=0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			return rev;

	}

}
