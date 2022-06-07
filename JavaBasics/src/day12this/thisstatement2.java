package day12this;

public class thisstatement2 {

	thisstatement2()
		{
			System.out.println("******Zero-Param*********");
		}
	thisstatement2(int age)
		{
			this();
			System.out.println("******int-Param*********");
		}
	thisstatement2(char c, double d)
		{
			this(25);
			System.out.println("******char-double-Param*********");
		}
	public static void main(String[] args) {
			
//			thisstatement2 t1=new thisstatement2();
//			thisstatement2 t2=new thisstatement2(25);
			thisstatement2 t3=new thisstatement2('c',25.36);
	}
}

