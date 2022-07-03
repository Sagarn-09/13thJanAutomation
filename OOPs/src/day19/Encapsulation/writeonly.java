package day19.Encapsulation;
class student3 {
	private String college="xyz";
	
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
public class writeonly {

	public static void main(String[] args) {
		student3 s=new student3();
		System.out.println(s.getCollege());
		s.setCollege("RGIT");
		student3 s1 = new student3();
		System.out.println("Bye");
		System.out.println(s.getCollege());
		s1.setCollege("IIT");
		System.out.println(s1.getCollege());
	}
}
