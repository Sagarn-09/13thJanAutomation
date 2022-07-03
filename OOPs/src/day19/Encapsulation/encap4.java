package day19.Encapsulation;
class account {
	private int acc_no;
	private String name;
	private String email;
	private float amount;
	
	public int getAcc_no() {
		return acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
}
public class encap4 {

	public static void main(String[] args) {
		
	account a1 =new account();
	// setting values through setter methods
		a1.setAcc_no(704000);
		a1.setName("Sonoo Jaiswal");
		a1.setEmail("absc@gmail.com");
		a1.setAmount(500000f);
	// getting values through getter methods
		System.out.println(a1.getAcc_no());
		System.out.println(a1.getName());
		System.out.println(a1.getEmail());
		System.out.println(a1.getAmount());
	}
}
