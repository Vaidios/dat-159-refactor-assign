package Test;

import part2After.SomeChildClass;


public class TestClass {
	public TestClass(){
		
	}
	public static void main(String args[]) {
		
		part2After.SomeChildClass A = new part2After.SomeChildClass();
		
		int value = A.method();
		
		System.out.println("\nBut unfortunately the method is returning: " + value);
		
	}
	
}
