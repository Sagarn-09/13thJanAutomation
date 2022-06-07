package day5.methods;

public class method6 {
	// static+ method
	public static void main(String[] args) {
	
	long sum=getadditionresult(25,30);
//	System.out.println("addition result : "+sum);
	
	method6.getadditionresult(25, 35);
	method6.getadditionresult(15, 55);
	
	}
	static long getadditionresult(int num1, int num2) {
	long res=num1+num2;
	
	System.out.println("addition result :"+res);
	
	return res;
	}
}


/*
data type
byte	8		0							-127/+127				
short	16		0							-35000/+36000
int		32		0							-2100000000/+2100000000
long 	64		0							-321231695321321321/+3211233221122322112
float	32		0.0f							6 TO 7 DECIMAL
double	64		0.0d							UPTO 15 TO 16 DECIMAL
char	16		blank space or ASCII CODE		means A to Z
boolean	1		TRUE FALSE NULL*/