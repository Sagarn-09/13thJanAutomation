package day12this;


class Student102 {
		int rollno;
		float fee;
		Student102(int rollno) {
			this.rollno = rollno;	
		}
	
		Student102(int rollno, float fee) {
			this(rollno);// C.T.Error
			this.fee = fee;		
		}
		
		void display() {
			System.out.println(rollno + " " + fee);
		}
	}
public class thisstatement7 {
		public static void main(String args[]) {
			Student102 s1 = new Student102(111);
			Student102 s2 = new Student102(112, 6000f);
			s1.display();
			s2.display();
	}
}

/*
 * 111 0.0
 * 112 6000.0
 * 
 */
