package day21.polymorphism;

class hillstations {
	void location() {
		System.out.println("Location is:");
	}
	void famousfor() {
		System.out.println("Famous for:");
	}
}
class manali extends hillstations {
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}
	void famousfor() {
		System.out.println("It is Famous for Hadimba Temple and adventure sports");
	}
}
class mussoorie extends hillstations {
	void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}
	void famousfor() {
		System.out.println("It is Famous for education institutions");
	}
}
class gulmarg extends hillstations {
	void location() {
		System.out.println("Gulmarg is in J&K");
	}
	void famousfor() {
		System.out.println("It is Famous for skiing");
	}
}
public class runtime2 {
	public static void main(String args[]) {
		
		hillstations A = new hillstations();
		A.location();
		A.famousfor();		
		hillstations M = new manali();
		M.location();
		M.famousfor();
		hillstations Mu = new mussoorie();
		Mu.location();
		Mu.famousfor();		
		hillstations G = new gulmarg();
		G.location();
		G.famousfor();
	}
}
