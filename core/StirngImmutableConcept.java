package core;

public class StirngImmutableConcept {

public static void main (String args[]) {
	
	// when instantiated as literals it is created in string pool when string object is created 
	// using new keyword it is created in heap area.
	
	//not object variable but object is immutable once define state of the object can't be changed.
	
	String s1 = "java1";
	s1.concat("world");
	
	// though another object java1 world is created but its holding another reference.
	
	String s2 = s1.concat("world");
	 
	 System.out.println(s1);
	 System.out.println(s2);
}


}
