package day15.abstraction;

abstract class RBIBank102 {
abstract /* final */ double getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
public class abstract6 {
	public static void main(String args[]) {
		
	}
}
