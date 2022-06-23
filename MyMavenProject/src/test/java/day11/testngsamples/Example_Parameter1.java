package day11.testngsamples;

import org.testng.annotations.Test;

public class Example_Parameter1 {

  @Test(invocationCount=10)
	public void param1() {
		System.out.println("Hello, I am TC8 from Example_Param1 class");
	}
  }
