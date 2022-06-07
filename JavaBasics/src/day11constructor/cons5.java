package day11constructor;

public class cons5 {

	int roll;
	double salary;
	cons5(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(+roll);
		System.out.println(+salary);
	}
	public static void main(String args[]) {
		cons5 c1 = new cons5(101,250045.45);
		c1.display();
		cons5 c2 = new cons5(201,550045.45);		
		c2.display();
	}

}
