package part2After;

public class SomeClass {
	final int field = 0;
	
	//..more fields
	
	public int method() {
		System.out.println(">> I am a method, I was designed to return the constant integer equal to 54321! ");
				
		// do some serious things
				
		return this.field;
	}
		
	//..more methods
	
}
