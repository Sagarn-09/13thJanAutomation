package day21.polymorphism;
class shapes {
	public void area() {
		System.out.println("find area");
	}
	public void area(int r) {
		System.out.println("circle area= "+3.14*r*r);
	}
	public void area(double b, double h) {
		System.out.println("triangle area= "+0.5*b*h);
	}
	public void area(int l, int b) {
		System.out.println("rectangle area= "+l*b);
	}
}
public class overloading {

	public static void main(String[] args) {
		shapes s= new shapes();
		s.area();
		s.area(5);
		s.area(7.0, 12);
		s.area(4, 8);
	}
}
