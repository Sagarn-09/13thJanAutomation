package day19.Encapsulation;

class person {
	private String name;//privare = restricted access

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class encap2 {
	public static void main(String[] args) {
		person myobj =new person();
//		myobj.name = "John"; // error
//		System.out.println(myobj.name); // error
		System.out.println(myobj.getName());
		 myobj.setName("John"); // Set the value of the name variable to "John"
		 System.out.println(myobj.getName());	
	}
}
