package day12this;


	class Student1 {
		//Global Var
		int rollno;	
		float fee;
		Student1(int rollno, float fee) {
			System.out.println("local rollno : "+rollno);
			System.out.println("local fee : "+fee);
			System.out.println("intial global rollno : "+this.rollno);
			System.out.println("intialglobal fee : "+this.fee);
	//	  Global Var = Local Var;
			this.rollno = rollno;	  
			this.fee = fee;
			System.out.println("after update, global rollno : "+this.rollno);
			System.out.println("after update, intialglobal fee : "+this.fee);
		}
		void display() {
			System.out.println(rollno + " "+ fee);
		}
	}
public class thiskeyword7 {
		public static void main(String args[]) {
			Student1 s1 = new Student1(101, 5000f);
			s1.display();
			Student1 s2 = new Student1(102, 6000f);		
			s2.display();
		}
}
