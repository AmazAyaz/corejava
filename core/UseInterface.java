package core;

public class UseInterface implements InterfaceEx {

	
	@Override
	public void a() {
		System.out.println("provided the method a implementation of interface");
		
	}

	@Override
	public void b() {
		System.out.println("method b's implementation");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceEx iex = new UseInterface();
		
		iex.a();
	 

	}

	


	
 




}
