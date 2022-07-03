package day21.polymorphism;
class bike{
	int speedlimit=90;
}
class honda extends bike {
	int speedlimit=150;
}
public class runtime5 {

	public static void main(String []args) {
	bike obj=new honda();
	System.out.println(+obj.speedlimit);
	}
}
