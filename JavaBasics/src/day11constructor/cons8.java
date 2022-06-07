package day11constructor;

public  class cons8 {
	int i = 10;
	 
		cons8() {
			System.out.println("Running Class B constructor..");
			//i = 23;
		}
	
	public static void main(String [] args) {
			
			System.out.println("Main() of Class cons8 is started...");
			cons8 b1 = new cons8();
			System.out.println("Class B global varibale i = " + b1.i);
			System.out.println("======================================");
			cons8 b2 = new cons8();
			System.out.println("Class B global varibale i = " + b2.i);
			System.out.println("Main() of Class cons8 is ends here...");
	}
}

