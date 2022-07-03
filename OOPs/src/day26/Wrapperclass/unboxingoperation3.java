package day26.Wrapperclass;

public class unboxingoperation3 {

	public static void main(String[] args) {
		
		Double doubleObj=25.2566;
		System.out.println("doubleObj: "+doubleObj);
		
		double salary=doubleObj.doubleValue(); 
		System.out.println(salary);
		
		System.out.println(doubleObj==salary);

	}

}
