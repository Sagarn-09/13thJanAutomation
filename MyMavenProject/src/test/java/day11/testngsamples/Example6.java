package day11.testngsamples;

import org.testng.annotations.Test;

public class Example6 {
	@Test
	public void testCase8() {
		displayDetails();
		System.out.println("Hello, I am TC6 from example6 class");
	}

	@Test
	public void testCase7() {
		System.out.println("Hello, I am TC5 from example6 class");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("I am display method of Example6 class");
	}
  }
