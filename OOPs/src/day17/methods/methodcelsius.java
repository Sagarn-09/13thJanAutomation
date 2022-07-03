package day17.methods;

public class methodcelsius {

	public static void main(String[] args) {
		float fahrenheit, celsius;
		fahrenheit=43;
		celsius = ((fahrenheit-32)*5)/9;
		System.out.println("temperature in celsius is "+celsius);
		System.out.println("**********************");
		
		methodcelsius m1 = new methodcelsius();
		m1.temperaturecelsius(-40);
	}
	public void temperaturecelsius(float f) {
		float res = (f-32)*5/9;
		System.out.println("temperature in celsius is "+res);
		
	}
}