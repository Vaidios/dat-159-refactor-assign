package part2Before;

public class SomeChildClass extends SomeClass{

	final int field = 54321;
	//..more fields
	
	public int method() {
		System.out.println(">> I am a method, I should always return the constant field equal to 54321! ");
				
		// do some serious things
				
		return this.field;
	}
			
	//..more methods
		
}
