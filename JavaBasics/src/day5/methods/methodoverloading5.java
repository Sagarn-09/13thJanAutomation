package day5.methods;
public class methodoverloading5 {
	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}
	void disp(int x, int y) {
		System.out.println("Method D");
	}

	public static void main(String args[]) {
		methodoverloading5 obj = new methodoverloading5();
		obj.disp(50, 25.36);
		obj.disp(60, 20.36, 40.25);
		obj.disp(70, 33.36f);
		obj.disp(100, 20);
		
	}
}