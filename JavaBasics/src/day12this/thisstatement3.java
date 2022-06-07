package day12this;

public class thisstatement3 {

	thisstatement3() {
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	
	thisstatement3(int age) {
		System.out.println("******int-Param*********");
	}
	
	thisstatement3(char c, double d) {
		this(25);
		System.out.println("******char-double-param*********");
	}

	public static void main(String[] args) {
		
		thisstatement3 t1=new thisstatement3();
	}
}
