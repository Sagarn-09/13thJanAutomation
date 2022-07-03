package day19.Encapsulation;
class student {
	//private data member
	private String name;
//get method
	public String getName() {
		return name;
	}
//set method	
	public void setName(String name) {
		this.name = name;
	}
}
public class encap5 {

	public static void main(String[] args) {
	//creating instance of the encapsulated class
	student s1=new student();
	System.out.println(s1.getName());
	
	//setting value in the name member  
	s1.setName("vijay");
	//getting value of the name member  
	System.out.println(s1.getName());
		
	}
}
