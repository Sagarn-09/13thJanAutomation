package day22.array;

public class array1 {

	public static void main(String[] args) {
/*		String[] cars;
		cars=new String [4];
		//or
		String[] cars=new String[4];
		
		cars[0]="volvo";
		cars[1]="bmw";
		cars[2]="ford";
		cars[3]="mazda";*/
		//or
		
		String[] cars= {"volvo", "bmw", "ford", "mazda"};
		
		System.out.println(cars[0]);
		cars[0]="opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		System.out.println("*********normal for-loop**********");
		
		for(int i=0; i<=cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("*********for- each loop**********");
		for(String i: cars) {
			System.out.println(i);
		}	
	}
}
