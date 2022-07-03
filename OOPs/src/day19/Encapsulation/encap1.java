package day19.Encapsulation;
class demo {
	private int empID=1000;
	private double salary=45000;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getSalary() {
		return salary; 
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class encap1 {
	public static void main(String[] args) {
		demo d1=new demo();
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
		
	//salary + bonus
		double updatedsalary=d1.getSalary()+14000;
		System.out.println("updated salary: "+updatedsalary);
		System.out.println(d1.getSalary());
		System.out.println("***************************");
		d1.setEmpID(1223);
		d1.setSalary(55000);
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
	}
}
