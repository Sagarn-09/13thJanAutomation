package day12this;
class Student {
	int rollno;
	float fee;

	Student(int rollno, float fee) {//rollon=101, fee=5000.0
		rollno = rollno;
		fee = fee;
	}
	void display() {
		System.out.println(+rollno);
		System.out.println(+fee);
	}
}
public class thiskeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(101, 5000f);
		Student s2 = new Student(102, 6000f);
		s1.display();
		s2.display();
	}
}
