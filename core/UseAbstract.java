package core;

public class UseAbstract extends AbstractEx {

	@Override
	public void methodB() {
		System.out.println("I'm using abstract");
		
	}
	
	public static void main (String args[]) {
		
		UseAbstract ab = new UseAbstract();
		 ab.methodA();
		 ab.methodB();
		 
		 
	}
}
