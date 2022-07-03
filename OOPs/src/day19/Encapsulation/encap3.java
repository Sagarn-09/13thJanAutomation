package day19.Encapsulation;
class sample{
	private int ssn;
	private String empname;
	private int empage;
	//getter & setter method
	
	public int getSsn() {
		return ssn;
	}
	public String getEmpname() {
		return empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
}
public class encap3 {
	public static void main(String[] args) {
	sample s1=new sample();
	System.out.println("Employee Name: " + s1.getEmpname());
	System.out.println("Employee SSN: " + s1.getSsn());
	System.out.println("Employee Age: " + s1.getEmpage());
	
	System.out.println("**********************");
	s1.setEmpname("Mario");
	s1.setEmpage(32);
	s1.setSsn(112233);
		
	System.out.println("Employee Name: " + s1.getEmpname());
	System.out.println("Employee SSN: " + s1.getSsn());
	System.out.println("Employee Age: " + s1.getEmpage());	

	}
}
