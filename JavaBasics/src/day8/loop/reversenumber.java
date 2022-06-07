package day8.loop;

public class reversenumber {
public static void main(String[] args) {  
	
	
//Reverse a number using while loop
	
	{  
	int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		} 
	 
	
	//Reverse a number using for loop

		int num = 1234567, reversed=0;

		for(;num != 0; num /= 10) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				}
				System.out.println("Reversed Number: " + reversed);
		}
	}
