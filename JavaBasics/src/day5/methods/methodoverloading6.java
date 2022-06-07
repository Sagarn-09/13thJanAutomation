package day5.methods;

public class methodoverloading6{

	//return type is different. Method name & argument list same.
	
   public int method(int num1, int num2)
   { 
       System.out.println("First method of class Demo");
       return num1+num2;
   }
   public double method(int var1, double var2)
   {
       System.out.println("Second method of class Demo");
       return var1-var2;
   }

   public static void main(String args[])
   {
       methodoverloading6 obj= new methodoverloading6();
       obj.method(10,10);
       obj.method(12,12.02);
   }
}