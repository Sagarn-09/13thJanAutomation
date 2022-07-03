package day20.casting;

public class primitivecasting1 {

public static void main(String[] args) {
	int myint=9;
	double mydouble = myint;//implicit widing
	double d=(double)myint;//explicit widing
	System.out.println(myint); 
	System.out.println(mydouble);
	System.out.println(d);
	
	double salary=23400.67856856898989545d;		
	int sal=(int)salary;//Narrowing double--->int,explicit	
	long f=(long)salary;//Narrowing double--->long, explicit
	System.out.println("Actual Salary: "+salary);
	System.out.println("Int Salary: "+sal);
	System.out.println("long Salary: "+f);
	}
}