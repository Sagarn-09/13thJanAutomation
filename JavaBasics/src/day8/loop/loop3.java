package day8.loop;

public class loop3 {

	public static void main(String[] args) {
		char c1;
		for(c1='a'; c1<='z'; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n*****Print in CAP*********");
		for(c1='A'; c1<='Z'; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n*******reverse no*********");
		for(c1='z'; c1>='a'; c1--) {
			System.out.print(c1+" ");
		}
	}
}
