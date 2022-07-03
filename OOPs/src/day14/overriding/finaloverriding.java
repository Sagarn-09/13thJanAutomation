package day14.overriding;

//final methods cannot be overidden
class car{
	//can't be overridden
	final void show() {
		System.out.println("i am final method of car class");
	}
}
class maruti extends car{
	//this would produce error
	
	/*void show() {
		System.out.println("i am show method of maruti class");
	}*/
}
public class finaloverriding {

	public static void main(String[] args) {
		car ref=new maruti();
		ref.show();
	}
}
