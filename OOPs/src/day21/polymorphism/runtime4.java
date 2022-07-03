package day21.polymorphism;
class bank {
	float getrateofinterest() {
		return 0;
	}
}
class SBI extends bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class runtime4 {
	public static void main(String []args) {
		bank b = new SBI();//upcasting
		System.out.println("SBI Rate of Interest: " + b.getrateofinterest());
		bank i = new ICICI();//up casting
		System.out.println("ICICI Rate of Interest: " + i.getrateofinterest());
		bank a = new AXIS();//up casting
		System.out.println("AXIS Rate of Interest: " + a.getrateofinterest());
	}
}
