package day26.Wrapperclass;

public class wrapperclass {

	public static void main(String[] args) {
		int a=20;
		Integer k=new Integer(a);
		Integer l=new Integer(20);
		Integer j=a;
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);
		
		System.out.println("***Unboxing of boxed object***");
		   
		Integer a1=new Integer(3);   
		int i1=a1.intValue();
		System.out.println("a1: "+a1+"\n i1: "+i1); 
		
		System.out.println("a1==i1 : "+(a1==i1));
		System.out.println("a1.equals(i1) : "+a1.equals(i1));
		
	}
}