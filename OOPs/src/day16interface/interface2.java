package day16interface;
interface bank{
	float rateofinterest();	//by default ----> public abstract
}
class SBI1 implements bank{
	public float rateofinterest() {
		return 8.5f;
	}
}
class PNB1 implements bank{
	public float rateofinterest() {
		return 9.5f;
	}
}
public class interface2 {

	public static void main(String[] args) {
		SBI1 s =new SBI1();
		System.out.println("SBI1 ROI: "+s.rateofinterest());
		PNB1 p =new PNB1();
		System.out.println("PNB1 ROI: "+p.rateofinterest());
		bank b=new SBI1();
		System.out.println("ROI: "+b.rateofinterest());
		bank p1=new PNB1();
		System.out.println("ROI: "+p1.rateofinterest()); 
	}
}
