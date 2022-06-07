package day8.loop;

public class dowhileloop3 {

	public static void main(String[] args) {
			
		int i=0;
	
			System.out.println("printing all no from 0 to 10");
			do {	
				System.out.print(i);
			i++;
			}while(i<=10);
			
			System.out.println("\n*****reverse no*******");
			
			int c=10;
			System.out.println("printing all no from 10 to 0");
			do {
				System.out.print(c);
				c--;
			}while(c>=0);
	}

}
/*int day=1;

do {
	System.out.println("Day: "+day);
	day++;
}while(day<=30);*/