package day13.inheritance;

class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}

class apple extends fruit{
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("apple class cons..");
	}
	public void shape() {
		System.out.println("apple is round");
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}
