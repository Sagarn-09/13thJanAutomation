package day23.object;

class Print{	
	int a=10;
	public int hashCode() {
		return 101;
	}
	public String toString() {
		return "I am Print Class toString";
	}
	public boolean equals(Object obj) {
		Print p=(Print)obj;//new Print();
		return (this.a==p.a);
			  //10 == 10
	}	
}
public class objectclass5{

	static int last_roll = 100;
	int roll_no;
	objectclass5()
	{
		roll_no = last_roll;
	    last_roll++;
	}	
public static void main(String args[]) {
	Object obj;
	objectclass5 s = new objectclass5();
	System.out.println("s: toString of ObjectClass4: "+s);
	System.out.println("s: hashCode of ObjectClass4: "+s.hashCode());
	
	objectclass5 s1 = new objectclass5();
	System.out.println("s1: toString of ObjectClass4: "+s1);
	System.out.println("s1: hashCode of ObjectClass4: "+s1.hashCode());
	System.out.println(s.equals(s1));
			
	Print p1=new Print();
	System.out.println("toString of Print: "+p1);
	System.out.println("hashCode of Print: "+p1.hashCode());
	Print p2=new Print();
	System.out.println(p1.equals(p2));
	}
}
