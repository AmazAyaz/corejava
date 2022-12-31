package core;

public class UnCheckedException {

	public static void main(String[] args) {
		
		try {
		
		int i = 50/0;
		
		System.out.println(i);
		
		} 
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
			
		}
		
		//rest code of the program   
		   System.out.println("rest of the code..."); 
		

	}

}
