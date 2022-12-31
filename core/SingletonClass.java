package core;

public class SingletonClass {


  private static SingletonClass singleton = new SingletonClass();
	
	//private constructor so that object can not be instantiated from other class.
    // create singleton class object and hold in static variable
	// write static getInstance() method and return the object.
  
  //class is guaranteed a singleton class with only one instance.
	
	private SingletonClass() {
	
	
}
	
	public static SingletonClass getInstance() {
		
		return singleton;
	} 

}
