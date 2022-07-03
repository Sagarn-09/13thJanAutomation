package day27.Exceptionhandling;

public class exceptionhandling1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		System.out.println("program starts from here....");
		
		int i=10;
		int j=i/0;
		
		System.out.println("res: "+j);
		int[] empIds=new int[3];
		
		empIds[3]=101;
		String str=null;
		
		System.out.println(str.length());
		String s="abc";
		
		int num=Integer.parseInt(s);
		System.out.println("num: "+num);
		System.out.println("programs ends here....");		
	}

}
