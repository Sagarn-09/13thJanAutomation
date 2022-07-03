package day20.casting;

public class primitivecasting2 {

public static void main(String[] args) {
	int salary=30000;
	double salarydouble=(double)salary;
	float salaryfloat=(float)salary;
		
	System.out.println("****** explicit widening ******");
	System.out.println("salary: "+salary+"\nsalaryDouble: "+salarydouble+"\nsalaryFloat :"+salaryfloat);
	
	System.out.println("****** implicit widening ******");
	double salaryDouble2=salary;
	float salaryFloat2=salary;
	System.out.println("salary: "+salary+"\nsalaryDouble2: "+salaryDouble2+"\nsalaryFloat2 :"+salaryFloat2);
	
	System.out.println("*********** explicit narrowing ***********");	
	double salaryDb=30000.35d;
	int salaryInt=(int)salaryDb;
	float salartFt=(float)salaryDb; 
	System.out.println("salaryDb: "+salaryDb+"\nsalaryInt: "+salaryInt+"\nsalaryFt :"+salartFt);
	/*implicit narrowing not possible*/
//	int salaryInt2=salaryDb;
//	float salartFt2=salaryDb;
	}
}
