package day26.Wrapperclass;

public class boxingoperation {

	public static void main(String[] args) {

		int age=20;
		System.out.println("Age: "+age);
		
		Integer intObj1=new Integer(age);
		System.out.println("intObj1: "+intObj1);
		System.out.println(age==intObj1);
		Integer intObj2=new Integer(50);
		System.out.println("intObj2: "+intObj2);
		Integer intObj3=30;
		System.out.println("intObj3: "+intObj3);

	}

}
