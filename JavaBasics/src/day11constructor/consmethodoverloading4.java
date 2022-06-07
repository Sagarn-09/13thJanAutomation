package day11constructor;

public class consmethodoverloading4 {


	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		consmethodoverloading4.main(12);
		consmethodoverloading4.main('c');
		consmethodoverloading4.main(1236);
	}
}
