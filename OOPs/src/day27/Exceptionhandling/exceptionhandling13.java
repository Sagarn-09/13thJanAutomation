package day27.Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionhandling13 {

		{
			int div = m / n;
			return div;
		}

		// main method
		public static void main(String[] args) throws FileNotFoundException {
			exceptionhandling13 obj = new exceptionhandling13();
			try {
				System.out.println(obj.divideNum(45, 0));
			} catch (ArithmeticException e) {
				System.out.println("\nNumber cannot be divided by 0");
			}
			
			FileInputStream fis=new FileInputStream("fileLocation");
			System.out.println("Rest of the code..");	
	}
}