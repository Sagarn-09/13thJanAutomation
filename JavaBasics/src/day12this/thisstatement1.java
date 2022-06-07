package day12this;

public class thisstatement1 {

	thisstatement1() {
		System.out.println("******Zero-Param*********");
	}
	
	thisstatement1(int age) {
		System.out.println("******int-Param*********");
	}
	
	thisstatement1(char c, double d) {
		System.out.println("******char-double-Param*********");
	}
	
public static void main(String[] args) {
		
		thisstatement1 t1=new thisstatement1();
		thisstatement1 t2=new thisstatement1(25);
		thisstatement1 t3=new thisstatement1('c',25.36);
	}
}


/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 */