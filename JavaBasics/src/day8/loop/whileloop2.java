package day8.loop;

public class whileloop2 {
	public static void main (String []args) {
	char c1='a';
	while (c1<='z') {
		System.out.print(c1);
		c1++;
	}
	System.out.println("\n********reverse alphabet***************");
	c1='z';
	while (c1>='a') {
		System.out.print(c1);
		c1--;
		}
	}
}
