package day23.object;

public class objectclass4 {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	objectclass4()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	// Driver code
	public static void main(String args[]) {
		objectclass4 s = new objectclass4();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}
}