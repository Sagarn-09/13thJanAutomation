package day19.Encapsulation;
class student2{
	//private data member
	private String college ="AKG";

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

}
public class readonly {

	public static void main(String[] args) {
		student2 s=new student2();
		System.out.println(s.getCollege());

	}
}
