package day12this;

public class finalkeyword2 {
	
		final int empId=90;
		double salary=34400.67;
		void run() {
			System.out.println("empId: "+empId);
		}

		public static void main(String args[]) {
			int salary = 0;
			finalkeyword2 obj = new finalkeyword2();
			obj.run();
			System.out.println("salary: "+obj.salary);
		}
}
